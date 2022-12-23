create table person(
name varchar2(20),
gender varchar2(6),
mobile varchar2(8),
address varchar2(30),
city varchar2(20)
);

create table roomtype(
typenum number(3) primary key,
typename varchar2(20) not null,
comments varchar2(32)
);

desc roomtype;

create table roominfo(
num varchar2(10) primary key,
name varchar2(20) not null,
type number(3) ,
howmany number(3) default 1,
howmuch number(4) default 0,
constraint fk_typenum foreign key(type) references roomtype(typenum)
);
insert into roomtype values(1, 'suite Room', null);
insert into roomtype values(2, 'Deluxe Room', null);
insert into roomtype values(3, 'Family Room', null);
select * from roomtype;
insert into roominfo values(100, '백두산', 1,6,1200);
select * from roominfo;
insert into roominfo values(100, '한라산', 4, 6, 1200);

create view under_file as select * from worker where salary < 5000;

select * from under_file;

create index ndx_emp_name on worker(emp_name);

select * from employees;

create table worker as select * from employees;
create synonym human_resource for employees;
select * from human_resource;

create sequence seq_id;
select seq_id.nextval from dual;

desc roomtype;

select *  from roomtype;
insert into roomtype values(seq_id.nextval, 'Domitory', null);
insert into roomtype values(seq_id.nextval, 'Single Room', null);
insert into roomtype values(seq_id.nextval, 'Single Room', null);
select seq_id.currval from dual;
select * from worker;
select emp_name||','||salary from worker;
--이름 : 매니저 사번,월급
 select emp_name || ':'|| manager_id || ','|| salary from worker;

select (10 - 5) as mi, (10 + 5) as pl, (10 / 5) as na, (10 * 5) as gub from dual;

select employee_id, salary,
case when salary <= 5000 then 'C등급'
        when salary > 5000 and salary <=15000 then 'B등급'
        else 'A등급'
        end  as salary_grade
        from worker;
        
--salary > == 10000: 본부장급 , 6000<=salary<10000:  팀장급, salary<6000: 팀원급
--6000<=salary<10000:파이썬에선 된다.
select employee_id, salary,
        case when salary >= 10000 then '본부장급'
                when salary >= 6000 and salary <10000 then '팀장급'
                else '팀원급'
        end  as salary_grade
from worker;

select employee_id, salary
from worker
where not(salary>=2500)
order by employee_id;

select employee_id, salary
from worker
where salary in(2000, 3000, 4000)
order by employee_id;


select * from worker;

select employee_id, salary
from worker
where salary between 4000 and 7000
order by employee_id;

select emp_name from worker where emp_name like '%ac%';
select emp_name from worker where emp_name like 'J_____%';
select emp_name from worker where emp_name like '%ing%';

select ceil(10.234)
from dual;

select floor(10.234)
from dual;

select ceil(3.14) from dual;

select floor(3.14) from dual;

select power(4,4) from dual; 
select sqrt(16) from dual;

select initcap('good morning vietnam') from dual;
select emp_name from worker;
select lower(emp_name) from worker;
select upper(emp_name) from worker;

select concat(concat(emp_name, ','), salary) from worker;

select substr(emp_name,1,4) from worker;
select emp_name from worker;
select '['||emp_name||']' as 배열 from worker;
select emp_name from worker where substr(emp_name, -3)='son';
select emp_name from worker where emp_name like '%son';

select ltrim('abcdefgabc', 'abc') from dual;
select rtrim('abcdefgabc', 'abc') from dual;
select replace('Good Morning Vietnam', 'Morning', 'Evening') from dual;
select replace(emp_name, 'John', 'John-') from worker where emp_name like 'John%';

select replace(emp_name, ' ', '') from worker where emp_name like 'John%';

select instr('내가 만약 외로울 때면, 내각 만약 괴로울 때면, 내가 만약 즐거울 때면', '만약') as a, 
            instr('내가 만약 외로울 때면, 내각 만약 괴로울 때면, 내가 만약 즐거울 때면', '만약', 5) as b,
            instr('내가 만약 외로울 때면, 내각 만약 괴로울 때면, 내가 만약 즐거울 때면', '만약', 5, 2)as c 
from dual;

select emp_name, length(emp_name) from worker;

select emp_name from worker;
--이름 공백으로 나눠서 보여줘라
--
select instr(emp_name, ' ') as a from worker;
select substr(emp_name, 1, instr(emp_name, ' ')-1) as a from worker order by employee_id;
select emp_name from worker;

select substr(emp_name,  instr(emp_name, ' ')+1) as a from worker;
select replace(emp_name, ' ', '-') from worker;

select to_char(salary, '99,999') as salay from worker;
select sysdate, systimestamp from dual;
select to_char(sysdate, 'yyyy-mm-dd') from dual;
select to_char(systimestamp, 'yyyy-mm-dd HH24:Mi:SS') from dual;

select to_char(sysdate, 'PM HH')||'시 '||to_char(sysdate, 'MI')||'분 '||to_char(sysdate, 'ss')||'초' from dual;

select employee_id
    , to_char(start_date, 'yyyy')
    , to_char(end_date, 'yyyy')
    , nullif(to_char(start_date, 'yyyy'), to_char(end_date, 'yyyy')) nullif_year
from job_history;

select emp_name, salary, decode(salary,3000,'3k',4000,'4k',5000,'5k','etc') from worker;