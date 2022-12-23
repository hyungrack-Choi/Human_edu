declare
    vs_emp_name employees.emp_name%type;
    cursor c1(vn number)
is
    select emp_name from employees where employee_id>vn; --����
begin
    open c1(200);--����(����)
    loop
        fetch c1 into vs_emp_name; -- ���
        exit when c1%notfound;
        dbms_output.put_line(vs_emp_name);
    end loop;
    close c1; --�ݱ�
end;
/

--loop���ΰ� select��
declare
    vs_emp_name employees.emp_name%type;
    vs_emp_id employees.employee_id%type; --�ΰ� ��������
    cursor c1(vn number)
is
    select employee_id, emp_name from employees where employee_id>vn; --���� --�ΰ� ����
begin
    open c1(200);--����(����)
    loop
        fetch c1 into vs_emp_id, vs_emp_name; -- ���
        exit when c1%notfound;
        dbms_output.put_line(to_char(vs_emp_id)||', '||vs_emp_name); --�ΰ��� ���޴´� �Ѱ������ļ�
    end loop;
    close c1; --�ݱ�
end;
/

--for�� ����2
declare
    cursor c1(vn number)
is
    select employee_id, emp_name from employees where employee_id>vn; --���� --�ΰ� ����
begin
    for rec in c1(200)
    loop
        DBMS_OUTPUT.PUT_LINE (rec.employee_id||',  ' ||rec.emp_name);
    end loop;
end;
/

--for�� ����3
declare
begin
    for rec in (select employee_id, emp_name from employees where employee_id>200)
    loop
        DBMS_OUTPUT.PUT_LINE (rec.employee_id||',  ' ||rec.emp_name);
    end loop;
end;
/

--for�� ����3+@
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
            m_name := '����';
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