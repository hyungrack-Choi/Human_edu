select table_name from user_tables;
select view_name from user_views;
select sequence_name from user_sequences;
select * from worker;
select employee_id, emp_name, salary,commission_pct,
          to_char(salary*(1+commission_pct/100), '99,999.99')
from worker
where commission_pct is not null;
select count(*) from worker;
select count(*),count(manager_id) from worker;
select sum(salary) from worker;
select sum(salary) /count(*) from worker;
select to_char(avg(salary), '99,999.99') from worker;
select max(salary) from worker;
select min(salary) from worker;
select manager_id, count(*) from worker group by manager_id;
--매니저 아이디 별 갯수

select manager_id, count(*), sum(salary) from worker group by manager_id;
--매니저 아이디별 월급합계

select manager_id, count(*), sum(salary), to_char(avg(salary),'99,999.99') 
from worker 
group by manager_id;

--매니저 아이디별 월급 합계 자리수 표시
select department_id, count(*)
from worker
group by department_id;
--데파트 먼트 아이디별 갯수
--
--select 구룹바이컬럼,...,구룹바이컬럼, 직계함수필수()
--from worker
--group by 구룹바이 컬럼
select manager_id, count(*) cnt, sum(salary) total , to_char(avg(salary),'99,999.99') avg_sal
from worker 
group by manager_id;


--커미션 퍼센테이지별 인원수
select commission_pct, count(*),sum(commission_pct)
from worker
group by commission_pct;


select commission_pct, count(*),sum(commission_pct)
from worker
where commission_pct is not null
group by commission_pct;

select commission_pct
        , count(*)total
        , sum(commission_pct)pct
        , to_char(avg(salary)
        , '99,999.99') total
from worker
where commission_pct is not null
group by commission_pct
order by commission_pct;

select commission_pct
        , count(*)total
        , sum(commission_pct)pct
        , to_char(avg(salary)
        , '99,999.99') total
from worker
where commission_pct is not null
group by commission_pct
order by avg(salary);

select * from worker order by employee_id;
select * from worker order by salary;
select * from worker order by salary desc;
select * from worker order by hire_date;
select * from worker order by hire_date desc;

select * from customers;

select cust_gender, count(*) from customers
group by cust_gender;

select cust_street_address, count(*)
from customers
group by cust_street_address;

select cust_marital_status, count(*)
from customers
group by cust_marital_status
order by cust_marital_status;

select * from customers;

select count(*) from customers
where cust_gender='F';

--생년별 고객수
select cust_year_of_birth, count(*)
from customers
group by cust_year_of_birth
order by cust_year_of_birth;

select * from customers;

select cust_year_of_birth, count(*),cust_gender
from customers
group by cust_year_of_birth,cust_gender
order by cust_year_of_birth;

select substr(emp_name,1,1) one from worker order by one;

select substr(emp_name,1,1) one, count(*)
from worker 
group by substr(emp_name,1,1)
order by one;

--월급 대별 인원수 (200불 몇명  3000불 몇명 4000불 몇명)
select floor(salary/1000)*1000 zone, count(*) cnt
from worker
group by floor(salary/1000)*1000
order by cnt;
select * from exp_goods_asia;
create table exp_goods_asia(
country varchar2(10), seq number, goods varchar(80));
desc exp_goods_asia;
insert into exp_goods_asia values('한국',1,'원유제외 석유류');
insert into exp_goods_asia values('한국',2,'자동차');
insert into exp_goods_asia values('한국',3,'전자집적회로');
insert into exp_goods_asia values('한국',4,'선박');
insert into exp_goods_asia values('한국',5,'LCD');
insert into exp_goods_asia values('한국',6,'자동차부품');
insert into exp_goods_asia values('한국',7,'휴대전화');
insert into exp_goods_asia values('한국',8,'환식탄화수소');
insert into exp_goods_asia values('한국',9,'무선송신기 디스플레이 부속품');
insert into exp_goods_asia values('한국',10,'철 또는 비합금강');
insert into exp_goods_asia values('일본',1,'자동차');
insert into exp_goods_asia values('일본',2,'자동차부품');
insert into exp_goods_asia values('일본',3,'전자집적회로');
insert into exp_goods_asia values('일본',4,'선박');
insert into exp_goods_asia values('일본',5,'반도체웨이퍼');
insert into exp_goods_asia values('일본',6,'화물차');
insert into exp_goods_asia values('일본',7,'원유제외 석유류');
insert into exp_goods_asia values('일본',8,'건설기계');
insert into exp_goods_asia values('일본',9,'다이오드,트랜지스터');
insert into exp_goods_asia values('일본',10,'기계류');

select * from exp_goods_asia;

select goods from exp_goods_asia where country ='한국'
intersect
select goods from exp_goods_asia where country = '일본';

(select goods from exp_goods_asia where country ='한국'
union
select goods from exp_goods_asia where country = '일본');

select goods from exp_goods_asia where country ='한국'
union all
select goods from exp_goods_asia where country = '일본' order by goods;

select goods from exp_goods_asia where country ='한국'
minus
select goods from exp_goods_asia where country = '일본';

(select goods from exp_goods_asia where country ='한국'
union
select goods from exp_goods_asia where country = '일본')
minus
(select goods from exp_goods_asia where country ='한국'
intersect
select goods from exp_goods_asia where country = '일본');

--(합집합)-(교집합)
--(a union b) minus ( a intersect b)




select * from worker;

select * from departments;

select emp_name, department_id from worker;

select worker.emp_name, departments.department_name
from worker, departments
where worker.department_id = departments.department_id;

select worker.employee_id, worker.emp_name, departments.department_name
from worker, departments
where worker.department_id = departments.department_id;

select * from jobs;
select * from worker;
select * from departments;
select * from sales;
select distinct(prod_id) from sales
order by prod_id;

--worker 테이블을 기준으로 조인 -> 사원명(worker.emp_name), 직위 명(jobs.job_title)출력
select a.emp_name, b.job_title,a.job_id
from worker a, jobs b --alias name
where a.job_id = b.job_id;

select * from roomtype;
select * from roominfo;
desc roomtype;
desc roominfo;
insert into roomtype values(4, 'Qeen Room', null);
insert into roominfo values(101, '지리산', 2,7,1500);
insert into roominfo values(102, '설악산', 4,8,1800);
insert into roominfo values(103, '한라산', 3,5,1600);

select b.num, b.name, a.typename, b.howmany, b.howmuch
from roomtype a, roominfo b
where a.typenum = b.type
order by b.num;

select * from sales;
select * from products;
select * from customers;
select * from channels;
select * from employees;
--sales테이블의 prod_id를 product_name바꾼다(by. join with products테이블)
--prod_id -> prod_name, cust_id, channel_id, employee_id

select b.prod_name, c.cust_name, d.channel_desc, e.emp_name, f.department_name
from sales a, products b, customers c, channels d, employees e, departments f
where a.prod_id = b.prod_id
    and a.cust_id = c.cust_id
    and a.channel_id = d.channel_id
    and a.employee_id = e.employee_id
    and e.department_id = f.department_id;
    
    
select * --count(*)  
from sales 
where employee_id not in (select employee_id from employees);
--employesss 테이블의 값이 들어있지 않은 sales테이블의 값의 수

select b.prod_name, to_char(sum(a.amount_sold), '99,999,999,999.99')
from sales a, products b
where a.prod_id = b.prod_id
group by b.prod_name
order by b.prod_name;


select b.prod_name, to_char(sum(a.amount_sold), '99,999,999,999.99') amount_sold
from sales a, products b
where a.prod_id = b.prod_id
group  by b.prod_name
order by b.prod_name;


select a.employee_id,  to_char(sum(a.amount_sold), '99,999,999,999.99') amount_sold
from sales a
group by a.employee_id
order by a.employee_id;

select * from sales;
select * from employees;


select a.employee_id, b.emp_name,  to_char(sum(a.amount_sold), '99,999,999,999.99') amount_sold
from sales a, employees b
where a.employee_id = b.employee_id
group by a.employee_id, b.emp_name
order by a.employee_id, b.emp_name;

