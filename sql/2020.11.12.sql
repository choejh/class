-- 2020.11.12
-- DDL

-- 테이블 생성 : 
-- creat table table_name
--( 
-- column_name domain [constraint],
-- column_name domain [constraint],
-- column_name domain [constraint]
-- )

create table test_tbl (
    no number(4),
    user_name varchar2(10),
    user_id varchar2(16),
    user_password varchar2(12),
    reg_date Timestamp default sysdate
);

desc test_tbl;

-- 사원 테이블과 유사한 구조의 사원번호, 사원이름, 급여 emp01 tavle
desc emp;

create table emp01 (
empno number(4),
ename varchar2(10),
sal number(7,2)
);

desc emp01;

-- Create table - as - : table 복사, 제약조건은 복사되지 않음
-- CREATE TABLE 명령어 다음에 컬럼을
-- 일일이 정의하는 대신 AS 절을 추가하여 EMP 테이블과 동일한 내용과 구조를 갖는 EMP02 테이블을 생성

create table emp02
as
select * from emp;
desc emp02;
select * from emp02;
--서브 쿼리문의 SELECT 절에 * 대신 원하는 컬럼명을 명시하면 기존 테이블에서 일부의 컬럼만 복사할 수 있습니다.
create table emp03
as
select empno, ename, sal from emp;
select * from emp03;

--서브 쿼리문의 SELECT 문을 구성할 때 WHERE 절을 추가하여 원하는 조건을 제시하면 기존 테이블에서 일부의 행만 복사합니다.
create table emp04
as
select * from emp
where deptno=10;

select * from emp04;

--WHERE 조건 절에 항상 거짓이 되는 조건을 지정하게 되면 
--테이블에서 얻어질 수 있는 로우가 없게 되므로 빈 테이블이 생성되게 됩니다.
create table emp05
as
select * from emp where 1=2
;

select * from emp05;
select *from tab;
--테이블의 삭제 ; 저장공간을 삭제 --> 저장되어 잇는 데이터도 모두 삭제
--drop table table_name
drop table test_tbl;

--테이블의 모든 로우(행) 제거, 물리적인 적용도 바로 진행
--truncate table ___
create table emp06
as
select * from emp;
select * from emp06;
truncate table emp06;

--테이블이름 변경
--rename old_name To new_name
rename emp06 to new_emp;
select * from tab;
select * from new_emp;

--테이블 구조의 변경
--alter table table_name {add(컬럼추가) | modify (컬럼수정) | drop(컬럼삭제)}

--기존 테이블에 속성을 추가: 각 행의 컬럼 데이터는 null값으로 채워진다.
--emp01 job 컬럼을 추가 job varchar2(10)

desc emp01;
alter table emp01
add(deptno number(2))
;

--기존 테이블의 컬럼 변경 : 새로 정의된 컬럼으로 교체하는 것
alter table emp01
modify (deptno number(10)) --number(2)->(10)
;
--기존 테이블의 컬럼 삭제 : 데이터도 모두 삭제
alter table emp01
drop (deptno)
;
desc emp01;

--제약 조건 정의
insert into dept values (10, 'test', 'seoul');

desc emp01;
insert into emp01 values (null,null,1000,'tester');
select * from emp01;

--emp01 테이블 삭제
drop table emp01;
--emp01 테이블 생성 : empno,ename에 null값이 들어가지 않도록 제약
create table emp01(
empno number(4) not null,
ename varchar2(10) not null,
job varchar(9),
deptno number(2)
);
insert into emp01 values (null,null,"tester",10);
desc emp01;

--데이터의 중복 금지 : unique
drop table emp02;
create table emp02 (
 empno number(4) unique,
 ename varchar2(10) not null
);

desc emp02;

insert into emp02 values(1,'test1');
insert into emp02 values(1,'test2');

select * from emp02;

--empno not null, unique 제약을 동시에 적용
drop table emp03;

create table emp03 (
    empno number(4) not null unique,
    ename varchar2(10) not null
);


insert into emp03 values(null, 'test1');
insert into emp03 values(1, null);
insert into emp03 values(1, 'test1');
insert into emp03 values(1, 'test2');
insert into emp03 values(2, 'test2');

select * from emp03;

--기본키 제약 : 기본기 설정 -> not null, unique
drop table emp04;
create table emp04(
    empno number(4) primary key,
    ename varchar2(10) not null
);

insert into emp04 values (null,'test');
insert into emp04 values (1,'test');

--외래키 제약 : 참조하는 테이블과 컬럼을 정의
drop table emp05;
create table emp05(
    empno number(4) primary key,
    ename varchar2(10) not null, 
    deptno number(2) references dept(deptno) --10,20,30,40 만 가능
);

insert into emp05 values (1,'test',10);
insert into emp05 values (6,'test',50);
insert into emp05 values (7,'test',null); --null도 가능

--check : 특정 범위 제한
drop table emp06;
create table emp06 (
    empno number(4) primary key,
    ename varchar2(10) not null,
    sal number(7,2) check (sal >=800)
);

insert into emp06 values (1,'test',700); --800이상만

--default : insert 시 데이터가 입력되지 않을 때 자동으로 등록되는 데이터 정의
drop table emp07;
create table emp07 (
    empno number(4) primary key,
    ename varchar(10) not null,
    sal number(7,2) check(sal>=500),
    comm number(7,2) default 0,
    hiredate date default sysdate
);

insert into emp07 (empno,ename,sal) values(1,'test',3000);
select * from emp07;

--제약 조건에 이름 부여 --자바에서 코딩할때 도움을 받음.
drop table emp08;
create table emp08 (
    empno number(4) constraint emp08_empno_PK primary key,
    ename varchar(10) constraint emp08_ename_NN not null,
    sal number(7,2) constraint emp08_sal_CK check(sal>=500),
    comm number(7,2) default 0,
    hiredate date default sysdate
);

insert into emp08 (empno,ename,sal) values(1,'test',3000);
select * from emp08;

-- 테이블 레벨에서 제약조건 정의
drop table emp09;
create table emp09(
    empno number(4),
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(10), --컬럼 정의 끝
    constraint emp09_empno_pk primary key (empno),
    constraint emp09_job_UK unique (job),
    constraint emp09_deptno_FK foreign key (deptno) references dept(deptno) --제약조건의 정의
);

insert into emp09 values (null,null,'job1',50);
insert into emp09 values (1,'tester','job1',40);
insert into emp09 values (2,'tester','job1',40);--job위배
insert into emp09 values (2,'tester','job2',40);
select * from emp09;

------------------------------------------------------------------------
-- DML : 데이터의 삽입, 수정, 삭제
-- DML의 대상은 행이다. 행단위 입력, 행단위 수정, 행단위 삭제

--데이터 삽입
--insert into table_name (데이터 저장할 컬럼들) values(저장할 데이터들)

--dept01 테이블 생성
create table dept01
as
select * from dept where 1=2 --false 값이 나와서 형식만 가져옴
;

insert into dept01 (deptno, dname, loc)
values (10, '마케팅','서울')
;

select * from dept01;

desc dept01;
insert into dept01 values(11,'재무','인천'); --전체 컬럼에 넣을 경우 테이블명 생략가능

--null 값의 입력
insert into dept01 (deptno, dname) values (30,'QC');
insert into dept01 values (40,'DEV',null);

--서브쿼리를 이용해서 데이터 입력
drop table dept02;
create table dept02 as select * from dept where 1=2;

desc dept02;

insert into dept02
select * from dept;

select * from dept;


--UPDATE
--데이터의 수정

--update table_name set culumn_name = value, ..., where 조건 <=행을 찾기 위한 조건

drop table emp10;
create table emp10
as
select * from emp
;
select * from emp10;

--모든 사원의 부서번호를 30번으로 수정합시다.
update emp10 set deptno=30;

--이번엔 모든 사원의 급여를 10% 인상시키는 update 문을 보겠습니다.
update emp10
set sal = sal*1.1;

--모든 사원의 입사일을 오늘로 수정하려면 다음과 같이 합니다.
update emp10
set hiredate = sysdate;

--급여가 3000이상인 사원만 급여를 10% 인상
update emp10
set sal = sal*1.1
where sal>=3000
;
--1987년 입사한 사원의 입사일을 오늘로 수정
--사원의 입사일을 오늘로 수정한 후 테이블 내용을 살피자

-- 전체 데이터를 삭제 DDL
truncate table emp10;

insert into emp10
select * from emp
;

select * from emp10 where substr(hiredate,1,2)='87';

update emp10
set hiredate=sysdate
--where hiredate between '87/01/01' and '87/12/31'
where substr(hiredate,1,2)='87';

--SCOTT 사원의 부서번호는 20번으로, 직급은 MANAGER로 한번에 수정
update emp10
set deptno=20, job='MANAGER'
where ename='SCOTT';

select * from emp10;

--SCOTT 사원의 입사일자는 오늘로, 급여를 50으로 커미션을 4000으로 수정
update emp10
set sal=50, comm=4000
where ename='SCOTT';

--20번 부서의 지역명을
--40번 부서의 지역명으로
--변경하기 위해서 서브 쿼리문을 사용
drop table dept01;
create table dept01
as
select * from dept;

UPDATE dept01
set loc= (select loc from dept01 where deptno=40)
where deptno=20
;

--부서 번호 20의 부서명과 지역
--부서번호가 40인 부서와 동일하게 UPDATE


update dept01
set (DNAME)=(SELECT DNAME, LOC FROM DEPT WHERE DEPTNO=40), loc=(select loc from dept01 where deptno=40)
WHERE DEPTNO=20;

update dept01
set (dname, loc) = (select dname, loc from dept01 where deptno=40)
where deptno=20;

select * from dept01;

--테이블의 행 삭제
--delete from table_name : 행단위 삭제, where가 없으면 전체 행 대상

--dept01 의 모든 데이터 삭제
select * from dept01;
delete from dept01;

--emp10
select * from emp10;

--emp10 테이블의 데이터 중 부서번호가 10번 부서의 사원들을 삭제
delete from emp10 where deptno=10;

--사원 테이블에서 부서명이 sales인 사원모두 삭제
delete from emp10 where deptno= (
select deptno from dept where dname='SALES'
);

rollback; --커밋 하기 전까지 돌려줌  --create 는 무조건 커밋 

select * from emp10;