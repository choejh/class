
--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(5) 박지성이구매한도서의출판사수
select count(publisher) from book 
where bookid=any(select o.bookid from customer c,orders o where c.custid=o.custid and c.name='박지성');
--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
select a.bookname, b.PRICEGAP
from (select * from book where bookid=any(select o.bookid from customer c,orders o where c.custid=o.custid and c.name='박지성'))a
,(select b.bookid, b.price-o.saleprice as PRICEGAP from book b, orders o where b.bookid = o.bookid)b where a.bookid=b.bookid;

--(7) 박지성이구매하지않은도서의이름

select bookname from book where bookid not in(select o.bookid from customer c,orders o where c.custid=o.custid and c.name='박지성');

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(8) 주문하지않은고객의이름(부속질의사용)
select name from customer where custid not in (select distinct(custid) from orders);
--(9) 주문금액의총액과주문의평균금액
select sum(saleprice) as TOTAL, avg(saleprice) as AVGSALEPRICE from orders;
--(10) 고객의이름과고객별구매액
select c.name,sum(o.saleprice) from customer c, orders o where c.custid=o.custid group by c.name;

--(11) 고객의이름과고객이구매한도서목록

select o.name, b.bookname from book b, (select c.name,o.bookid from customer c, orders o where c.custid=o.custid) o 
where b.bookid=o.bookid order by o.name;

--(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
select * from orders o ,book b where o.bookid=b.bookid and (b.price-o.saleprice)=(select max(b.price-o.saleprice) from book b,orders o where b.bookid=o.bookid); 

--(13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름

select c.name from customer c, orders o where c.custid=o.custid 
group by c.name
HAVING avg(saleprice) >(select avg(saleprice) from orders);
​
--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select c.name from customer c,orders o where c.custid=o.custid 
and o.bookid=any(select bookid from book where publisher=any(select publisher from book where bookid = any(select o.bookid from customer c,orders o where c.custid=o.custid and c.name='박지성')))
and c.name!='박지성';

--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름

select d.name from (select distinct(o.name),(b.publisher) from book b,(select c.name,o.bookid from customer c, orders o where c.custid=o.custid)o 
where b.bookid=o.bookid order by o.name)d group by d.name having count(d.name)>1;
