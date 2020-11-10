--2020.11.10
--함수

--단일행, 집합함수

--단일행 함수 : 숫자, 문자, 날짜, 변환

desc dual;

--숫자함수
select abs(-15.5) from dual;    --절대값
select floor(15.7) from dual;   --절사
select round(15.54) from dual; --반올림
select round(15.56,1) from dual; --반올림(1자릿수)
select round(15.693,2) from dual; --반올림(2자릿수)
select log(10,100) from dual; --지수
select power(3,2) from dual; --제곱수

--문자함수
select concat('나는',' 손흥민 입니다') from dual; --문자 연결
select concat('저의 이름은 ',ename) from emp where job='MANAGER';
select LOWER('MR. SCOTT MCMILLAN') "Lowercase" FROM DUAL; --소문자로
select lower(ename) from emp;
select LPAD('Page 1',15,'*') from dual; --앞자리 별
select RPAD('001212-1',14,'*') from dual; --뒷자리 별
select SUBSTR('ABCDEFG',3,4) from dual; --범위 자르기
select rpad(substr('001212-301247',1,8),14,'*') from dual;
select rpad(substr('juminno',1,8),14,'*') from dual;
select ltrim(' =from= ',' ') from dual;     --제거
select Rtrim('   =from====       ',' ') as "from" from dual; 
select trim('='from '=from=') as "from" from dual;

select REPLACE('JACK and JUE','J','BL') "Changes" FROM DUAL;
select REPLACE('000000-0000000', '-','') "Changes" FROM DUAL;

--날짜 함수
SELECT SYSDATE FROM DUAL;
SELECT SYSDATE+14 FROM DUAL; --날짜 더하기
SELECT SYSDATE-3 FROM DUAL;

SELECT ADD_MONTHS(SYSDATE,4) FROM DUAL; --달 더하기
SELECT LAST_DAY(SYSDATE) FROM DUAL;

--변환함수
--TO_CHAR : 날짜->문자, 숫자->문자

--날짜->문자
SELECT SYSDATE,TO_CHAR(SYSDATE,'YYYY-MM-DD day dy am pm hh hh24 mi ss') FROM DUAL;
--2020.11.09. 22:14
select to_char(sysdate,'yyyy.mm.dd. hh24:mi:ss') from dual;

--숫자->문자
select to_char(100000.123,'L000,000.00') from dual;
select to_char(10000,'L999,999.99') from dual;

select sal, to_char(sal*1100,'L99,000,000') from emp;
select sal, to_char(sal*1100,'L00,000,000') from emp;
select ename, job,sal, to_char(sal*1100*12,'L99,000,000') from emp order by sal desc;
select ename, job,sal, to_char(sal*1100*12+nvl(comm,0)*1100,'L99,000,000') as "연봉" from emp order by sal desc;

--문자 -> 날짜
--2020.11.01.
select TO_DATE('2009/09/05', 'YYYY/MM/DD') from dual;
select TO_DATE('2020/11/01', 'YYYY.MM.DD') from dual;


--오늘이 2020년 1월 1일에서 며칠이 지났는지 확인
select trunc(sysdate - to_date('20-01-01','YY-MM-DD')) from dual;

--내가 며칠을 살았는지ㅣ 확인
select trunc(sysdate-to_date('1994/09/13','yyyy/mm/dd')) from dual;

--문자->숫자
select TO_NUMBER('100,000.00', '999,999.99')*TO_NUMBER('10.00', '999,99.99') from dual;

--decode 함수 : switch 문과 비슷하다.
--사원이름, 부서번호, 부서이름 출력----------------------오류-----------
select ename, deptno,
decode(deptno,
10,'ACCOUNTING', --DEPTNO=10 이면
20,'RESERCH',
30,'SALES',
40,'OPERATIONS'
) AS 'DNAME'
from emp ORDER BY DEPTNO;
-----------------------------------------------------------------------

SELECT ename, sal,
    decode(
    job, 'ANALYST', sal*1.05
    ,'SALESMAN', sal*1.1
    ,'MANAGER', sal*1.15
    ,'CLERK', sal*1.20
    ) as upsal
from emp
order by sal
;

select ename, deptno,
case 
    when deptno=10 then 'ACCOUNTING'
    when deptno=20 then 'RESEARCH'
    when deptno=30 then 'SALES'
    when deptno=40 then 'OPERATIONS'
end as dname
from emp
order by dname
;

--그룹함수: 하나의 행의 컬럼을 대상이 아닌 행의 그룹의 컬럼들을 묶어 그룹화하고 연산하는 함수
--그룹함수: SUM, AVG, COUNT, MAX, MIN

select
       to_char (sum(sal)*1100,'L999,999,999') as "월 급여 총액", 
        round(avg(sal))*1100 as "월급여평균",
        count(sal) as "급여 전체 사원의 수",
        count(comm) as "커미션을 받는 사원 수"
        max(sal) as "가장 큰 급여"
        min(sal) as "가장 작은 급여"
from emp;


select
    sum(comm),
    avg(nvl(comm,0)),
    count(nvl(comm,0)),
    max(comm),
    min(comm)
from emp;

--전체 행을 구한다
select 
    count(*) as "Manager의 수", 
    round(avg(sal)) as "매니저의 평균 급여" ,
    max(sal),
    min(sal)
from emp where job='MANAGER';

--직무의 개수

select count(distinct job) 
from emp
order by job


--특정 컬럼을 기준으로 그룹핑 
--------------------------------------
--각 부서의 소속 인어ㅜㄴ을 구하자
select deptno,cunut(*) as "cnt";
from emp
group by deptno
order by count(*) desc;


orderd by deptno;
-----------------------------------


--각 부서별 총 급여액 출력
--group by deptno: 부서별로 그룹핑
select deptno, sum(sal)
from emp
group by deptno
order by deptno
;

--부서별 급여 평균
select deptno,round(avg(sal))
from emp
group by deptno
order by deptno
;

--부서별 급여 최고금액과 최소금액 출력
select deptno, min(sal),max(sal),max(sal)-min(sal)
from emp
group by deptno
order by deptno
;

--부서별로 그룹지은 후(GROUP BY), 그룹 지어진 부서별 평균 급여가 2000 이상인(HAVING) 부서번호와 부서별 평균 급여
select deptno, avg(sal)
from emp
group by deptno
having avg(sal)>=2000
--having not avg(sal)<2000
order by deptno
;
--부서별 급여의 최대값과 최소값을 구하되 최대급여가 2900이상인 부서 출력
select deptno, max(sal), min(sal)
from emp
group by deptno
having max(sal)>=2900
order by deptno;

--직무별 지표 : 사원의 수, 급여의 총합, 평균급여, 최대급여, 최소급여
select job, 
count(*) ||'명' as "사원의 수", 
to_char(sum(sal)*1100,'L999,999,999') as "급여의 총합",
to_char(avg(sal)*1100,'L999,999,999.99') as "평균급여",
to_char(max(sal),'L999,999,999') as "최대급여",
to_char(min(sal),'L999,999,999') as "최소급여"
from emp
where job!='PRESIDENT'  --그룹하기 위한 행을 선택
group by job
order by job;

desc book;
select * from book;

desc customer;
select * from customer;

desc orders;
select * from orders;

