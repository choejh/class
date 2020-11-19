--#2 요구사항에 맞는 오브젝트를 생성하는 sql을 작성하시오.
-- 1. 대리키 IDX, 회원 아이디, 이름, 비밀번호, 사진이름, 가입일 을 저장할 수 있는
--   이름이 MEMBER인 테이블을 생성하세요.
--    회원 아이디에는 기본 키 제약설정을 하고, 이름과 비밀번호에는 not null,
--    가입 일은 기본 값으로 sysdate가 입력되도록 하시오.
--  2. MEMBER 테이블에서 이름 컬럼으로 인덱스 객체를 생성하시오.
--  3. MEMBER 테이블에서 회원 아이디, 이름, 사진 정보만을 출력하는 view 객체를 생성하시오.
-- view의 이름은 member_view 로 생성하시오.

create table member (
 IDX Number,
 ID varchar2(12) primary key,
 NAME varchar2(12) not null,
 PW varchar2(18) not null,
 photoname varchar2(12),
 joinDate date default sysdate
  );
 
 create index index_member
 on member (name);
 
create view member_view
as select id, name, photoname
from member;




--1 아래 요구사항에 맞도록 기본 SQL 문을 작성하시오.

--1. 아래 조건에 맞는 DDL을 작성하시오.
--===== 전화번호 부( 테이블 이름 : Contact )
------ 기본정보(not null)
-- 대리키 : 일련번호 -> pIdx 기본키로 설정
-- 이름, 전화번호, 주소, 이메일
-- 주소값과 이메일은 입력이 없을 때 기본값 입력
-- 친구의 타입 (카테고리) : univ, com, cafe 세가지 값만 저장 가능
------ 선택 정보
-- 전공, 학년
-- 회사이름, 부서이름, 직급
-- 모임이름, 닉네임
--=============================

--2. DEPT 테이블에 데이터를 삽입하는 SQL을 작성하시오. 입력 데이터는 임의로 작성하시오.
--3. DEPT 테이블에 위에서 삽입한 데이터의 dname, loc 데이터를 변경하는 SQL을 작성하시오.
--   입력 데이터는 임의로 작성하시오.
--4. DEPT 테이블에 위에서 삽입한 데이터를 deptno 컬럼의 값을 기반으로 삭제하는 SQL을 작성하시오.
--5. 사용자가 보유한 테이블 목록을 확인하는 SQL문을 작성하시오.
--6. EMP 테이블의 구조를 확인하는 SQL을 작성하시오.
--7. 사용자가 정의한 제약조건들을 확인하는 SQL문을 작성하시오.


--#2 아래 요구사항에 맞도록 고급 SQL 문을 작성하시오.

--1. EMP 테이블의 ename 컬럼에 인덱스를 생성하는 SQL을 작성하시오. 인덱스의 이름은 emp_index
--2. EMP 테이블과 DEPT 테이블을 조인하는 SQL을 기반으로 view 객체를 생성하는 SQL을 작성하시오.
--   view 의 이름은 emp_view 로 하시오.
--3. EMP 테이블에서 모든 사원의 부서번호를 이름이 'SCOTT'인 사원의 부서번호로 변경하는 SQL을 작성하시오.