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
--C(�����ͻ���/�߰�)   insert
--R(��������ȸ)          select
--U(�����ͼ���)          update
--D(�����ͻ���)          delete
insert into student values('John', 'male', 'WestLake',6,null,null,null,null);

select * from student;

insert into student values('Jane', 'Female', 'RiverWest', 5, null,null,null,null);
insert into student(name,gender,school_name,grade_num) values('Jacob', 'male', 'RiverEast', 6);
insert into student(name,gender,school_name,grade_num) values('������', '����', '������', '8');
-- '' == null
commit;
rollback;
delete from student where name='Jacob';

select * from student;

update student set gender='male' where name='�̼���';
update student set school_name='��' where gender='����';
update student set gender='male' where school_name='������';
update student set mobile='-' where mobile is null;
update student set match_score=-1, english_score=-1,korea_score=-1 where grade_num=5;

select * from student;

create table worker as select * from employees;

select * from worker where manager_id = 124;
--

select salary from worker where manager_id is null ;

--worker ���̺��� manager_id �� null�� ����� ����(salary)�� 30000 ���� ����(update)
update worker  set salary = 30000 where manager_id is null;

--manager_id�� 124�� ����� Ŀ�̼��ۼ�Ƽ������ 0.25�� ����
update worker set commission_pct = 0.25 where manager_id = 124;