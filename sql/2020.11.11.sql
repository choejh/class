--2020.11.11
--JOIN
--CROSS JOIN : 조건 없이 테이블과 테이블을 붙여준다
SELECT *
FROM EMP,DEPT;

--Equi JOIN
select *
from emp, dept
where emp.deptno=dept.deptno;

--SCOTT의 사원번호와 이름, 부서이름, 지역을 출력
select empno, ename,dname, loc
from emp, dept
where emp.deptno=dept.deptno and ename='SCOTT';

select empno, ename, emp.deptno, dname, loc
from emp, dept
where emp.deptno=dept.deptno and ename='SCOTT';


--테이블에 별칭 사용
select e.empno, e.ename, e.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno=d.deptno and e.ename='SCOTT';

--ANSI -> T1 INNER JOIN T2 ON 조인의 조건
select *
from emp inner join dept
on emp.deptno= dept.deptno
;

select *
from emp join dept
USING(deptno) --USING을 쓰니까 DEPTNO가 하나만 뜸
              --공통 컬럼은 하나만 가지게 해준다. 공통컬럼을 구별할 필요가 없다.
--on emp.deptno= dept.deptno
;

--NATURAL JOIN : 동일 컬럼 조인의 조건을 생략, 같은 이름의 컬럼은 하나씩 
select ename, deptno, dname
from emp Natural join dept
;


--Non Equi JOIN : 동등 비교가 아닌 비교연산이 가능
--급여 등급을 5개로 나누어 놓은 salgrade에서 정보를 얻어와서
--각 사원의 급여 등급을 지정해보도록 합시다.
--이를 위해서 사원 테이블과 급여 등급 테이블을 조인하도록 합시다.
--사원의 급여가 몇 등급인지 살펴보자

--1.CROSS JOIN -> 조건
select *
from emp e, salgrade s
where e.sal between s.losal and s.hisal
;

--ANSI JOIN : CROSS JOIN
select *
from emp cross join dept
;

select * from salgrade;

--Self JOIN : 자기 자신의 테이블을 조인
--SMITH의 매니저 이름이 무엇인지

select e.ename, e.mgr, m.ename
from emp e, emp m
where e.mgr = m.empno 
and e.ename='SMITH'
;


--정보가 부족해도 출력하는 outer JOIN
select e.ename, e.mgr, m.ename
from emp e, emp m
where e.mgr = m.empno(+)
;

--ANSI outer JOIN
--T1 [ LEFT | RIGHT | FULL ] OUTER JOIN T2

select *
from emp e left outer join emp m
on e.mgr = m.empno;

-- 회원 , 구매
-- customer, orders
select * from customer;
select * from orders order by custid;

select *
from customer c, orders o
where c.custid = o.custid(+);


--회원별 구매 횟수
select c.name, count(o.orderid),sum(o.saleprice), avg(o.saleprice)
from customer c, orders o
where c.custid = o.custid(+)
group by c.name;

--===========================================

--서브 쿼리
--스칼라 부속질의 - select 부속질의,단일행 단일열
--인라인 뷰      - from 부속질의, 복합행, 복합열
--중첩질의       - where 부속질의, 단일열, 단순비교 -> 단일행, 집합비교-> 복합행

--중첩 질의 : 단순 비교
--평균 급여(sub query)보다 더 많은 급여를 받는 사원을 출력

select avg(sal) from emp;
select *
from emp
where sal > (select avg(sal) from emp)--평균 급여
;

--sal 3000이상 받는 사원이 소속된 부서
select distinct deptno from emp where sal >=3000;

select *
from emp
where deptno in(select distinct deptno from emp where sal >=3000);
--where deptno=10 or deptno=20;




--SCOTT 사원의 같은 부서에 근무하는 사원의 리스트를 출력
select deptno from emp where ename='SCOTT';

select ename, deptno
from emp
where deptno=(select deptno from emp where ename='SCOTT') --scott이 소속된 부서 번호
;

--30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다 더 많은 급여를 받는
--사람의 이름, 급여를 출력하는 쿼리문을 작성해 봅시다.

SELECT MAX(SAL) FROM EMP WHERE DEPTNO=30;

SELECT ENAME,SAL
FROM EMP
--WHERE SAL > 2850
--WHERE SAL> (SELECT MAX(SAL) FROM EMP WHERE DEPTNO=30)
--where sal> all (select sal from emp where deptno=30) --and
--where sal>any (select sal from emp where deptno=30)  --or
;


--ROWNUM
select rownum, empno, ename, hiredate
from emp
order by hiredate
;

select rownum, empno, ename, hiredate from emp order by hiredate;

select rownum,empno, ename,hiredate
from (select rownum, empno, ename, hiredate from emp order by hiredate) --인라인 뷰
where rownum<4
;

--가장 급여를 많이 받는 사원 3명을 출력하자
select rownum, ename, sal from emp order by sal desc;
select rownum, ename, sal
from (select rownum, ename, sal from emp order by sal desc)
where rownum<6
;
---------------------------------------------------------------------------------졸은부분
--- mysql --> top     select * from emp limit 0, 3

select  name from customer where custid=1;

-- 스칼라 부속질의 : select 절 프리젠테이션 영역에 쓸 수 있는 부속질의, 단일행, 단일열, 단일값의 결과만 나와야한다.
select custid, (select name from customer where customer.custid=orders.custid),
        saleprice, orderdate
from orders
;

-- 마당서점의 고객별  group by 
-- 판매액을 보이시오 orders
-- (결과는 고객이름과 고객별 판매액을 출력).
select c.custid, c.name, sum(o.saleprice)
from customer c, orders o
where c.custid=o.custid(+)
group by c.custid, c.name
order by sum(o.saleprice)
;

select o.custid, 
    (
        select name from customer c where o.custid=c.custid
    )  
    ,  sum(o.saleprice)
from orders o
group by o.custid
;

-----------------------------------------------------------------------------여기까지

select custid, name
from customer
where custid<=2
;

--인라인 뷰 : from 절 이후에 들어가는 서브쿼리, 가상 테이블, rownum이 새롭게 생성 
select c.name, sum(o.saleprice), avg(o.saleprice)
from orders o, (select custid, name
                from customer
                where custid<=2
                ) c
where o.custid=c.custid
group by c.name
;

--평균 주문금액 이하의 
--주문에 대해서 주문번호와 금액을 보이시오.
select avg(saleprice) from orders;

select orderid, saleprice
from orders
where saleprice <= (select avg(saleprice) from orders)--평균 주문 금액
;

--각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해 주문번호, 고객번호, 금액
select avg(saleprice) from orders where custid=1;

select orderid, custid, saleprice
from orders o1
where saleprice > (select avg(saleprice) from orders o2 where o2.custid=o1.custid);


select * from customer where address like '%대한민국%';
--대한민국에 거주하는 고객에게 판매한 도서의 총판매액을 구하시오
select sum(saleprice)
from orders
where custid in (select custid from customer where address like '%대한민국%')
;

--3번 고객이 주문한 도서의 최고 금액보다
--더 비싼 도서를 구입한 
--주문의 주문번호와 금액을 보이시오.
select max(saleprice) from orders where custid=3;

select orderid, saleprice
from orders
--where saleprice >(select max(saleprice) from orders where custid=3) --3번고객 비싸게삼
where saleprice > all(select saleprice from orders where custid=3)
;

--EXISTS 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
select * from customer where address Like '%대한민국%';

select sum(saleprice)
from orders o
where exists (select * from customer c where address Like '%대한민국%' and o.custid=c.custid)
;