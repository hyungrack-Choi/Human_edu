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
--�Ŵ��� ���̵� �� ����

select manager_id, count(*), sum(salary) from worker group by manager_id;
--�Ŵ��� ���̵� �����հ�

select manager_id, count(*), sum(salary), to_char(avg(salary),'99,999.99') 
from worker 
group by manager_id;

--�Ŵ��� ���̵� ���� �հ� �ڸ��� ǥ��
select department_id, count(*)
from worker
group by department_id;
--����Ʈ ��Ʈ ���̵� ����
--
--select ��������÷�,...,��������÷�, �����Լ��ʼ�()
--from worker
--group by ������� �÷�
select manager_id, count(*) cnt, sum(salary) total , to_char(avg(salary),'99,999.99') avg_sal
from worker 
group by manager_id;


--Ŀ�̼� �ۼ��������� �ο���
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

--���⺰ ����
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

--���� �뺰 �ο��� (200�� ���  3000�� ��� 4000�� ���)
select floor(salary/1000)*1000 zone, count(*) cnt
from worker
group by floor(salary/1000)*1000
order by cnt;
select * from exp_goods_asia;
create table exp_goods_asia(
country varchar2(10), seq number, goods varchar(80));
desc exp_goods_asia;
insert into exp_goods_asia values('�ѱ�',1,'�������� ������');
insert into exp_goods_asia values('�ѱ�',2,'�ڵ���');
insert into exp_goods_asia values('�ѱ�',3,'��������ȸ��');
insert into exp_goods_asia values('�ѱ�',4,'����');
insert into exp_goods_asia values('�ѱ�',5,'LCD');
insert into exp_goods_asia values('�ѱ�',6,'�ڵ�����ǰ');
insert into exp_goods_asia values('�ѱ�',7,'�޴���ȭ');
insert into exp_goods_asia values('�ѱ�',8,'ȯ��źȭ����');
insert into exp_goods_asia values('�ѱ�',9,'�����۽ű� ���÷��� �μ�ǰ');
insert into exp_goods_asia values('�ѱ�',10,'ö �Ǵ� ���ձݰ�');
insert into exp_goods_asia values('�Ϻ�',1,'�ڵ���');
insert into exp_goods_asia values('�Ϻ�',2,'�ڵ�����ǰ');
insert into exp_goods_asia values('�Ϻ�',3,'��������ȸ��');
insert into exp_goods_asia values('�Ϻ�',4,'����');
insert into exp_goods_asia values('�Ϻ�',5,'�ݵ�ü������');
insert into exp_goods_asia values('�Ϻ�',6,'ȭ����');
insert into exp_goods_asia values('�Ϻ�',7,'�������� ������');
insert into exp_goods_asia values('�Ϻ�',8,'�Ǽ����');
insert into exp_goods_asia values('�Ϻ�',9,'���̿���,Ʈ��������');
insert into exp_goods_asia values('�Ϻ�',10,'����');

select * from exp_goods_asia;

select goods from exp_goods_asia where country ='�ѱ�'
intersect
select goods from exp_goods_asia where country = '�Ϻ�';

(select goods from exp_goods_asia where country ='�ѱ�'
union
select goods from exp_goods_asia where country = '�Ϻ�');

select goods from exp_goods_asia where country ='�ѱ�'
union all
select goods from exp_goods_asia where country = '�Ϻ�' order by goods;

select goods from exp_goods_asia where country ='�ѱ�'
minus
select goods from exp_goods_asia where country = '�Ϻ�';

(select goods from exp_goods_asia where country ='�ѱ�'
union
select goods from exp_goods_asia where country = '�Ϻ�')
minus
(select goods from exp_goods_asia where country ='�ѱ�'
intersect
select goods from exp_goods_asia where country = '�Ϻ�');

--(������)-(������)
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

--worker ���̺��� �������� ���� -> �����(worker.emp_name), ���� ��(jobs.job_title)���
select a.emp_name, b.job_title,a.job_id
from worker a, jobs b --alias name
where a.job_id = b.job_id;

select * from roomtype;
select * from roominfo;
desc roomtype;
desc roominfo;
insert into roomtype values(4, 'Qeen Room', null);
insert into roominfo values(101, '������', 2,7,1500);
insert into roominfo values(102, '���ǻ�', 4,8,1800);
insert into roominfo values(103, '�Ѷ��', 3,5,1600);

select b.num, b.name, a.typename, b.howmany, b.howmuch
from roomtype a, roominfo b
where a.typenum = b.type
order by b.num;

select * from sales;
select * from products;
select * from customers;
select * from channels;
select * from employees;
--sales���̺��� prod_id�� product_name�ٲ۴�(by. join with products���̺�)
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
--employesss ���̺��� ���� ������� ���� sales���̺��� ���� ��

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

