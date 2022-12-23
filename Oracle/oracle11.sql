declare
    VI_NUM char(20);
    PI CONSTANT NUMBER :=3.14;
    A INTEGER := 2**3*2**2;
begin
    VI_NUM := -100;
    DBMS_OUTPUT.PUT_LINE(VI_NUM);
    --DBMS_OUTPUT.PUT_LINE(pi);
    --DBMS_OUTPUT.PUT_LINE(A);
    --DBMS_OUTPUT.PUT_LINE(3**4);
end;
/
set serveroutput on;
set TIMING on;

declare 
    v_employee_id employees.employee_id%type;
    vs_emp_name employees.emp_name%type;
begin
    select employee_id, emp_name
        into v_employee_id , vs_emp_name
    from employees
    where employee_id = 120;
    dbms_output.put_line('사번='||to_char(v_employee_id)||', 이름='||vs_emp_name);
end;
/

select * from departments;
declare 
    v_manager_id departments.manager_id%type;
    vs_departments departments.department_name%type;
begin
    select manager_id, department_name
        into v_manager_id , vs_departments
    from departments
    where department_id = 80;
    dbms_output.put_line('부서명='||to_char(v_manager_id)||', 부서장사번='||to_char(vs_departments));
end;
/