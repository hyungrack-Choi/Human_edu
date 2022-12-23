--사번, 이름, 매니저이름, 부서명
select a.employee_id, a.emp_name, b.emp_name manager_name
from employees a, employees b
where a.manager_id = b.manager_id;
--self join 

select * from employees; 

select * from departments;

select b.department_id, b.department_name , a.department_name up_name
from departments a, departments b
where a.department_id = b.parent_id;

select a.employee_id, a.emp_name, b.emp_name manager_name, c.department_name
from employees a, employees b, departments c
where a.manager_id = b.manager_id
    and a.department_id = c.department_id
order by a.employee_id;

select a.department_id,a.department_name, b.department_name parent_name,
        c.emp_name 
 from departments a, departments b, employees c
where a.parent_id=b.department_id(+)
  and a.manager_id=c.employee_id(+)
order by a.department_name;


select a.employee_id, a.emp_name, a.salary, b.department_name
from employees a, departments b
where a.department_id = b.department_id
and a.salary>6000
order by a.salary;

select a.employee_id, a.emp_name, a.salary, b.department_name
from (select * from employees  where salary>6000) a, departments b --sub-query --inline view
where a.department_id = b.department_id;

select a.employee_id, a.emp_name, a.salary, b.department_name
from employees a, departments b
where a.department_id = b.department_id
and a.employee_id in (select employee_id from employees where salary>6000);

select * from departments
where parent_id not in (select department_id from departments where manager_id is null);

select * from departments;
select * from employees;

select d.employee_id, d.emp_name, b.department_name 
from departments a , departments b , employees c, employees d
where a.department_id = b.parent_id
and c.employee_id = d.manager_id;


select a.employee_id, a.emp_name, b.emp_name manager_name, c.department_name, b.emp_name
from employees a, employees b, departments c, departments d
where a.manager_id = b.manager_id
    and a.department_id = c.department_id
    and c.department_id = d.manager_id
order by a.employee_id;

select * from departments;
select * from employees;
--부서명,인원수
select b.department_name, count(*)
from employees a, departments b
where a.department_id = b.department_id
group by b.department_name
order by b.department_name;
--부서명 , 부서장, 인원수
select b.department_name, c.emp_name, count(*)
from employees a, departments b, employees c
where a.department_id = b.department_id
and b.manager_id = c.employee_id
group by b.department_name, c.emp_name
order by b.department_name, c.emp_name;

--부서명 , 부서장, 인원수,(월급합계)
select b.department_name, c.emp_name, count(*), sum(a.salary)
from employees a, departments b, employees c
where a.department_id = b.department_id
and b.manager_id = c.employee_id
group by b.department_name, c.emp_name
order by b.department_name, c.emp_name;

select * from employees;

--부서명,인원수,월급총액
select b.department_name, sum(a.salary)
from employees a, departments b
where a.department_id = b.department_id
group by b.department_name
order by b.department_name;

select * from employees;
select * from departments;

select a.employee_id, a.emp_name, b.department_name, c.emp_name manager
from employees a, departments b, employees c
where a.department_id = b.department_id
    and a.employee_id = c.manager_id;
    
select a.employee_id, a.emp_name, b.employee_id manager_id, b.emp_name manager_name
from employees  a, employees b
where a.manager_id = b.employee_id(+);

select a.department_id, a.department_name, b.department_name 
from departments a, departments b
where a.parent_id = b.department_id(+);

select a.department_id, a.department_name, b.department_name 
from departments a
inner join departments b
on (a.parent_id = b. department_id)
where a.department_id  > 50;

--mysql은 안시조인써야 됨 예)아웃조인
select a.department_id, a.department_name, b.department_name 
from departments a
left outer join departments b
on (a.parent_id = b. department_id)
where a.department_id  > 50;

--mysql은 안시조인써야 됨 예)라이트 아웃조인
select a.department_id, a.department_name, b.department_name 
from departments a
right outer join departments b
on (a.parent_id = b. department_id)
where a.department_id  > 50;

--mysql은 안시조인써야 됨 예)풀 아웃조인
select a.department_id, a.department_name, b.department_name 
from departments a
full outer join departments b
on (a.parent_id = b. department_id)
where a.department_id  > 50;

--서브쿼리 셀프조인

create view v_six as 
select a.employee_id, a.emp_name, a.salary, b.department_name
from employees a, departments b
where a.department_id = b.department_id(+)
and a.salary>5000;

select * from v_six order by emp_name;

drop view v_six;

create view v_siz as select * from employees  where salary>6000;

select a.employee_id, a.emp_name, a.salary, b.department_name
from v_siz a, departments b --sub-query
where a.department_id = b.department_id;

select avg(salary) from employees;
select emp_name, salary from employees where salary > (select avg(salary) from employees)
order by salary;
--서브쿼리 안에는 order by  안된다 group by는 사용 가능

select a.emp_name, c.emp_name catpion
from employees a , departments b, employees c
where a.department_id = b.department_id(+)
and b.department_name = '영업부'
and b.manager_id = c.employee_id(+);
--from 서브쿼리
select b.emp_name, c.emp_name catpion
from (select a.emp_name, b.department_name, b.manager_id from employees a, departments b where a.department_id= b.department_id and b.department_name like '%부') b, employees c
where b.manager_id = c.employee_id(+);

--where 서브쿼리
select a.emp_name, b.department_name, c.emp_name caption
from employees a, departments b, employees c
where a.department_id in ( 
select department_id
from departments
where  department_name like '%부')
and a.department_id = b.department_id(+)
and b.manager_id = c.employee_id(+);


create table book(
booknum number(5) primary key,
constraint num number(5) 
)





















