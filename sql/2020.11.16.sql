--2020.11.16

--PhoneBook DDL : 테이블 정의서를 참고해서 DDL을 작성한다.

create table phoneInfo_basic (
    idx number(6) constraint pi_basic_idx_PK primary key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date default sysdate
)
;
desc phoneInfo_basic;

--제약 조건 확인 user_constraints
desc user_constraints;


select constraint_name,constraint_type
from user_constraints
where table_name='PHONEINFO_BASIC'
;

--INSERT : CREATE
insert into phoneinfo_basic
values (1,'SCOTT','010-0000-0000', 'SCOTT@GMAIL.COM','서울',SYSDATE);
select * from phoneinfo_basic;

--시퀀스: 숫자 재생기
--delete로 데이터를 지워도 이전 번호로 돌아가지 않음.
create sequence SEQ_PIBASIC_IDX
MINVALUE 0
START WITH 0
INCREMENT BY 1
;

--INSERT : CREATE
insert into phoneinfo_basic
values (1,'SCOTT','010-0000-0000', 'SCOTT@GMAIL.COM','서울',SYSDATE);

--데이터 삭제 : DELETE
delete from phoneinfo_basic; 
select * from phoneinfo_basic;

insert into phoneinfo_basic (IDX, fr_name, fr_phonenumber)
values (SEQ_PIBASIC_IDX.nextval,'KING','010-9999-9999');

--기존 데이터 업데이트 : UPDATE
update phoneinfo_basic
set FR_EMAIL='KING@NAVER.COM',FR_ADDRESS='부산'
WHERE IDX=6;

-- C(CREATE), R(READ), U(UPDATE), D(DELETE)
-- INSERT, SELECT, UPDATE, DELETE

drop table phoneinfo_univ;

--PhoneInfo_univ
create table phoneinfo_univ (
    idx number(6) not null,
    fr_u_major varchar2(20) default 'N',
    fr_u_year number(1) default 1 check(fr_u_year between 1 and 4),
    fr_ref number(6),
    constraint pi_univ_idx_PK primary key(idx),
    constraint pi_univ_ref_FK FOREIGN key (fr_ref) references phoneInfo_basic(idx)
);

desc phoneinfo_univ;
select * from user_constraints where table_name='PHONEINFO_UNIV';

--CRUD
--create : 대학친구 입력
--기본정보
insert into phoneinfo_basic (IDX, fr_name, fr_phonenumber)
values (SEQ_PIBASIC_IDX.nextval,'KING','010-9999-9999');
--대학정보
insert into phoneinfo_univ values(3,'computer',2,SEQ_PIBASIC_IDX.currval);
--read
select * from phoneinfo_univ;
select * from phoneinfo_basic;

select * from phoneinfo_basic pb, phoneinfo_univ pu
where pb.idx=pu.fr_ref;

--update : phoneinfo_univ where idx=3
update phoneinfo_univ
set fr_u_major='체육', fr_u_year=4
where idx=3;

--delete : idx=10 행 삭제

delete phoneinfo_univ where fr_ref=7; --부터 삭제
delete phoneinfo_basic Where idx=7;

--phoneinfo_com
create table phoneinfo_com (
    idx number(6) constraint pi_com_idx_PK primary key,
    fr_c_company varchar2(20) default 'N',
    fr_ref number(6) not null constraint pi_com_ref_FP references phoneinfo_basic (idx)
);

--회사 친구 정보 입력------------------------------이상한부분
--기본정보
insert into phoneinfo_basic (IDX, fr_name, fr_phonenumber)
values (SEQ_PIBASIC_IDX.nextval,'손흥민','010-1111-9999');

--회사정보 입력
insert into phoneinfo_com(1,'토트넘',SEQ_PIBASIC_IDX.currval);

--Read
--회사 치누
select *
from phoneinfo_basic bb,phoneinfo_com pc
where pb.idx=pc.tr_ref
and pb.fr_name ='손흥민';

--update
update phoneinfo_com
set fr_c_company='레알'
where idx=1;

--delete
--자식테이블의 행부터 삽입

delete from phoneinfo_com where fr_ref() 
t