create table student(
name varchar2(20) not null,
gender varchar(6)  not null,
school_name varchar(20)  not null,
grade_num NUMBER(1) not null,
mobile varchar2(8),
match_score number(3),
english_score number(3),
korea_score number(3)
);
desc student;
--C(데이터생성/추가)   insert
--R(데이터조회)          select
--U(데이터수정)          update
--D(데이터삭제)          delete
insert into student values('John', 'male', 'WestLake',6,null,null,null,null);

select * from student;

insert into student values('Jane', 'Female', 'RiverWest', 5, null,null,null,null);
insert into student(name,gender,school_name,grade_num) values('Jacob', 'male', 'RiverEast', 6);
insert into student(name,gender,school_name,grade_num) values('윤석봉', '남성', '세종대', '8');
-- '' == null
commit;
rollback;
delete from student where name='Jacob';

select * from student;

update student set gender='male' where name='이순신';
update student set school_name='명량' where gender='남성';
update student set gender='male' where school_name='세종대';
update student set mobile='-' where mobile is null;
update student set match_score=-1, english_score=-1,korea_score=-1 where grade_num=5;

select * from student;

create table worker as select * from employees;

select * from worker where manager_id = 124;
--

select salary from worker where manager_id is null ;

--worker 테이블에서 manager_id 가 null인 사람의 월급(salary)을 30000 으로 변경(update)
update worker  set salary = 30000 where manager_id is null;

--manager_id가 124인 사람의 커미션퍼센티이지를 0.25로 변경
update worker set commission_pct = 0.25 where manager_id = 124;