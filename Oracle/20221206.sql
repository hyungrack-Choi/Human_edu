declare
    vs_emp_name employees.emp_name%type;
    cursor c1(vn number)
is
    select emp_name from employees where employee_id>vn; --선언
begin
    open c1(200);--열기(실행)
    loop
        fetch c1 into vs_emp_name; -- 사용
        exit when c1%notfound;
        dbms_output.put_line(vs_emp_name);
    end loop;
    close c1; --닫기
end;
/

--loop문두개 select값
declare
    vs_emp_name employees.emp_name%type;
    vs_emp_id employees.employee_id%type; --두개 변수선언
    cursor c1(vn number)
is
    select employee_id, emp_name from employees where employee_id>vn; --선언 --두개 선언
begin
    open c1(200);--열기(실행)
    loop
        fetch c1 into vs_emp_id, vs_emp_name; -- 사용
        exit when c1%notfound;
        dbms_output.put_line(to_char(vs_emp_id)||', '||vs_emp_name); --두개를 못받는다 한개로합쳐서
    end loop;
    close c1; --닫기
end;
/

--for문 버전2
declare
    cursor c1(vn number)
is
    select employee_id, emp_name from employees where employee_id>vn; --선언 --두개 선언
begin
    for rec in c1(200)
    loop
        DBMS_OUTPUT.PUT_LINE (rec.employee_id||',  ' ||rec.emp_name);
    end loop;
end;
/

--for문 버전3
declare
begin
    for rec in (select employee_id, emp_name from employees where employee_id>200)
    loop
        DBMS_OUTPUT.PUT_LINE (rec.employee_id||',  ' ||rec.emp_name);
    end loop;
end;
/

--for문 버전3+@
declare
m_name employees.emp_name%type;
d_name departments.department_name%type;
begin
    for rec in (select employee_id, emp_name, manager_id from employees where employee_id>200)
    loop
            select a.emp_name, b.department_name into m_name, d_name
            from employees a , departments b
            where a.employee_id = rec.manager_id
            and a.department_id = b.department_id;
            DBMS_OUTPUT.PUT_LINE(rec.employee_id||','||rec.emp_name||','||m_name||','||d_name);
    end loop;
end;
/


declare
m_name employees.emp_name%type;
e_id employees.employee_id%type;
begin
    for rec in (select a.employee_id, a.emp_name, a.manager_id, b.department_name 
    from employees a , departments b 
    where a.department_id(+) = b.department_id
    and a.employee_id is not null)
    loop
        if rec.manager_id is null then
            m_name := '없음';
        else
            select emp_name, employee_id  into m_name, e_id
            from employees
            where employee_id = rec.manager_id
            order by employee_id;
            DBMS_OUTPUT.PUT_LINE(rec.employee_id||','||rec.emp_name||','||m_name||','||rec.department_name);
        end if;
    end loop;
end;
/

select * from employees;