"# ofss202601" 

https://codeshare.io/test1

PATH


/home/tufail/training/hello.txt
/home/tufail/training/OFSS/Banking/

cat  ../../sql.txt

/home/tufail/training/sql.txt
/home/tufail/training/linux.txt


relative path


absolute path

cat 



.	- current
..	-previous
/	- root

chmod ugo+rwx demo.txt
chmod ugo-rwx demo.txt

chmod u+x demo.txt

r	-4
w	-2
x	-1



chmod 000 demo.txt
----------

chmod 435 demo.txt

-r---wxr-x

-rw--wx--x


chmod 6 demo.txt




The table in the slide shows the file and directory permissions for each of the umask octal values.
 This table can also help you determine the umask value that you want to set on files and directories. To determine the umask value, subtract the value of the permissions that you want from 666 for a file, or 777 from a directory. 
If you want to change the default mode for files to 644 (rw-r--r--). The difference between 666 and 644 is 0022, which is the value you would use as an argument to the umask command.
Note: The write (w) and execute (x) permissions also require the read (r) permission. Therefore, you cannot write or execute a file if you cannot read it.
Therefore, the permission sets: -wx, -w-, and --x are not useful.   


0002


664	- files
775	- directory


0022


umask - 027
639	- files	666-27
750	- directory  777-27





027


666
640















grep
-------------

grep stands for Global Regular Expression Print. It is used to search for text or patterns in files or command output.

employees.txt

101 Ahmed HR
102 Neha Sales
103 Karthik HR
104 Neha Finance
105 Tarun Marketing


grep "Neha" employees.txt
ignorecase -- 
grep "Neha" employees.txt
Show line numbers
grep -n "Neha" employees.txt
Count matching lines
grep -c "Neha" employees.txt
Print lines NOT matching (-v)
grep -v "HR" employees.txt
Search all files inside a directory.
grep -r "main" project/

Match whole words (-w)
grep -w "Neha" employees.txt

Matches:
Neha
Does not match:
Nehaby
Neha123



Find all Java files containing main:
grep -rn "main" *.java
Search for "Exception" in all log files:
grep -i "Exception" *.log
Find all users with Bash shell:
grep "/bin/bash" /etc/passwd


-----

cat >
cat <
cat >>

1
2
0


tar -cvf session.tar file1 file2 file3 riya.txt

tar -tvf session.tar

tar -xvf session.tar












Creating Shell Scripts
Shell Scripting



















Linux command execution Flow

User
   │
   ▼
Terminal
   │
   ▼
Bash Shell
   │
   ▼
Parse & Interpret Command
   │
   ▼
Locate Executable
   │
   ▼
Create Process
   │
   ▼
Linux Kernel
   │
   ▼
CPU • Memory • Disk • Devices
   │
   ▼
Output Returned
   │
   ▼
Terminal Displays Result



Common Shells in Linux

| Shell | Description                                                      |
| ----- | ---------------------------------------------------------------- |
| Bash  | Most popular and widely used shell                               |
| sh    | Original Bourne Shell                                            |
| zsh   | Feature-rich shell with advanced customization                   |
| ksh   | Korn Shell                                                       |
| csh   | C Shell                                                          |
| tcsh  | Enhanced C Shell                                                 |
| fish  | User-friendly shell with syntax highlighting and autosuggestions |


how to know which shell ?
echo $SHELL

echo $0


List All Installed Shells
cat /etc/shells


Check Your Login Shell
 grep "^$USER:" /etc/passwd



which
------------
Find the Python executable
which python3

/usr/bin/python3

Use it with command substitution:

ls -l $(which python3)

Internally, Bash executes:

ls -l /usr/bin/python3



Find the Java executable
which java

/usr/bin/java

Now display its details:

ls -l $(which java)

Or check its version:

$(which java) -version


--------GIT
How which Works


which git

-Bash (or the which program) searches the directories listed in the PATH environment variable:
-PATH=/usr/local/bin:/usr/bin:/bin

It checks each directory in order:

Search PATH
│
├── /usr/local/bin/git  Not found
├── /usr/bin/git          Found
└── Stop searching

So the output is:

/usr/bin/git

This is why which is useful—it tells you exactly which executable will run when you type a command, especially if multiple versions of the same program are installed.






XML
--------

Hello

<greetings>Hello</greetings>

Well Formed 
---------------


<productdata>
<productname id="18181">Monitor</productname>
<price>90000</price>
<quantity>976</quantity>
</productdata>

















XSD


<?xml version="1.0"?>
<xsd:schema	xmlns:xsd="http://www.w3.org/2001/XMLSchema"> 
	<xsd:element name="mobileNumber" type="xsd:positiveInteger"/>
</xsd:schema>


XML
<?xml version="1.0"?>
<mobileNumber>1298</mobileNumber>


---------------------------

XSD


<?xml version="1.0"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"> 
	<xsd:element name="employee">
		<xsd:complexType>
			<xsd:sequence>
			<xsd:element name="mobileNumber" type="xsd:positiveInteger"/>
			<xsd:element name="employeename" type="xsd:string"/>
			</xsd:sequence>
		</xsd:complexType>
	</xsd:element>
</xsd:schema>


XML- Activity1
<?xml version="1.0"?>
<employee>
	<mobileNumber>1298</mobileNumber>
	<name>
		<firstname>Sathvik</firstname>
		<lastname>Sai</lastname>
	</name>
</employee>



---

<?xml version="1.0"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"> 
	<xsd:element name="employee">
		<xsd:complexType>
			<xsd:sequence>
			<xsd:element name="mobileNumber" type="xsd:positiveInteger"/>
			<xsd:element name="employeename" type="xsd:string"/>
			</xsd:sequence>
		</xsd:complexType>
	</xsd:element>
</xsd:schema>


<xsd:simpleType name="emailType">
    <xsd:restriction base="xsd:string">
        <xsd:pattern value="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}"/>
    </xsd:restriction>
</xsd:simpleType>.


Oracle 23ai
-------------------

https://download.oracle.com/otn-pub/otn_software/db-free/oracle-ai-database-free-26ai-23.26.2.windows.x64.zip

https://www.oracle.com/database/sqldeveloper/technologies/download/



JDK
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

Eclipse IDE
https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2026-06/R/eclipse-inst-jre-win64.exe



Supplier	- S#, status, city
Supplier Parts - s#, p#, qty,pname




Student

Pk	PK
Roll	SId	Name
1	1
1	2
2	1
1	1	X

1	a@gmail.com
1	b@


FK



Normalization
----------------------

	

select * from employees;

select * from departments;

select department_id,department_name from departments;

select sysdate from dual;

select 3+2

select * from employees;

select first_name+ last_name from employees;

select last_name,salary, salary+3000 from employees;


-----GET ALL EMPLOYEES FIRST_NAME,SALARY, COMMISSION, ANNUAL SALARY (sal+comX12)
select first_name,salary, (salary+salary/100*commission_pct)*12  from employees
-- solution later


--alias

select first_name,salary, (salary+salary/100*commission_pct)*12 as AnnualSalary  from employees

select first_name,salary, (salary+salary/100*commission_pct)*12 as "Annual Salary"  from employees

select first_name,salary, (salary+salary/100*commission_pct)*12  AnnualSalary  from employees

select first_name,salary, (salary+salary/100*commission_pct)*12   "Annual Salary"  from employees


||
select first_name || last_name || job_id from employees

select first_name || '  ' || last_name || '  ' || job_id from employees


--distinct

select distinct(first_name) from employees;


---Which different roles employees are working on?
select distinct(job_id) from employees;


describe employees;

----------WHERE
select * from employees where department_id = 90;


--Get all the info about john

select * from employees where first_name = 'John';
-- functions - later


SELECT last_name 
FROM   employees
WHERE  hire_date = '17-OCT-11' ;

---IN
select * from employees where department_id in (60,90);

select * from employees where department_id not in (60,90);

--RR

--AND
select * from employees where department_id in (60,90) and salary >10000

select * from employees where department_id in (60,90) and salary <20000


------------------ORDER BY
select first_name, salary, hire_date from employees order by hire_date desc

select first_name,salary, (salary+salary/100*commission_pct)*12  AnnualSalary  from employees
order by AnnualSalary desc



SELECT employee_id, first_name
 FROM employees
 ORDER BY employee_id
 FETCH FIRST 5 ROWS ONLY;
 
 
 ------Hands on
Get the name,salary of the person who is getting highest salary
select first_name, salary from employees order by salary desc Fetch first 1 row only;

select first_name, salary from employees order by salary asc Fetch first 1 row only;

---Hands on
-- Print department wise employee names and if job_id are same then sort on salary

select first_name,department_id,  job_id,salary from employees
order by department_id,job_id,salary

-----
select * from employees;
select * from employees where employee_id = 100;
select * from employees where employee_id = &eid;
select &&column1, first_name from employees where &column1 = 100;


SET VERIFY ON
select * from employees where employee_id = &eid;


select first_name,salary from employees order by salary desc OFFSET 1 ROW 
FETCH FIRST 1 ROW ONLY



---Functions

select * from employees where lower(first_name) = 'john';

select first_name,last_name,lpad(salary,10,0) from employees


------------
SELECT employee_id, CONCAT(first_name, last_name) NAME,
LENGTH(last_name), INSTR(last_name, 'a') "Contains 'a'?"
FROM   employees
WHERE  SUBSTR(last_name, -1, 1) = 'n';


SELECT last_name,
  UPPER(CONCAT(SUBSTR(LAST_NAME, 1, 8), '_US'))
FROM   employees
WHERE  department_id = 60;

----

SELECT last_name, (SYSDATE-hire_date)/7 AS WEEKS
FROM   employees
WHERE  department_id = 90;


select * from employees;

--first_name, salary, hire_date , exp(in years)
select first_name,salary,hire_date,round((sysdate-hire_date)/365,0) "exp" from employees


--TO_CHAR
select * from employees;

select to_char(salary) from employees;

--implict
select length(to_char(salary)) from employees;

select length(salary) from employees;


SELECT employee_id, TO_CHAR(hire_date, 'MM/YY') Month_Hired
FROM   employees
WHERE  last_name = 'Higgins';


SELECT last_name,
       TO_CHAR(hire_date, 'DD Month YYY')
       AS HIREDATE
FROM   employees;



select first_name, to_char(salary, '$9999,999.00') from employees order by salary desc;

update employees set salary =100000 where first_name = 'Steven'

commit;


select * from employees;


SELECT last_name, TO_CHAR(hire_date, 'DD-Mon-YYYY')
FROM  employees
WHERE hire_date < TO_DATE('01 Jan, 10','DD Mon,RR');

select * from employees;

--get me all employees who got hired in the month of April
select first_name,hire_date from employees where to_char(hire_date,'MM') ='04'

select first_name,hire_date from employees where substr(to_char(hire_date,'DD-MM-YY'),5,1) = '4'

select first_name,hire_date as "Employees Hired in April" from employees where substr(to_char(hire_date,'DD-MM-YY'),5,1) = 
4

---NVL

select first_name,salary, commission_pct, (salary+salary/100*commission_pct)*12  from employees

select first_name,salary, commission_pct, (salary+salary/100*NVL(commission_pct,0))*12  from employees

select first_name,NVL(to_char(manager_id),'No manager assigned') from employees;

--NVL2
select * from employees

select first_name, department_id, salary "Actual Salary" ,NVL2(department_id,salary,salary+2000) 
"Total Monthly Salary" from employees

-- Hands on
Print monthly salary of employees, calculate
if commission is null, increase 5000
if commission is not null increase 7000 and also include commission_pct percentage


----

SELECT last_name, salary, commission_pct,
COALESCE((salary+(commission_pct*salary)), salary+2000)
AS New_Salary
FROM   employees;


---GET MONTHLY salary as
sal+comm    - if commission is not null
sal+2000    - if salary is null
salary       - if commission+salary is null
10000        - if nothing satisfies



select first_name, salary, commission_pct, 
COALESCE(salary*(1+commission_pct/100), NVL2(salary, null, 2000), NVL2(commission_pct, null, salary), 10000)
from employees;


-------GROUP

select max(salary) from employees;

select first_name,salary from employees where salary = max(salary)

select round(avg(NVL(commission_pct,0)),3) from employees;


---department wise employees count
select count(employee_id) from employees;

select department_id,count(employee_id) from employees
group by department_id
order by department_id


select department_id,count(employee_id) 
from employees
where department_id is not null
group by department_id
order by department_id

---Print sum of salary for every salary department , manager wise

select department_id,manager_id , sum(salary) 
from employees
where department_id is not null
group by department_id, manager_id
order by department_id

---------------------print only sum of salary > 10000

select department_id,manager_id , sum(salary) 
from employees
where department_id is not null
having sum(salary) > 10000
group by department_id, manager_id
order by department_id

-----JOINS

---Natural join
select * from employees
natural join departments;

select * from departments;
select * from employees


---inner join
select first_name,salary, department_name
from employees join departments
using (department_id)

select first_name,salary, department_name,department_id,manager_id
from employees join departments
using (department_id)


select first_name,salary, department_name,department_id,employees.manager_id
from employees join departments
using (department_id)
--USING CLAUSE

select first_name,salary, department_name,department_id,e.manager_id
from employees e join departments d
using (department_id)


--ON CLAUSE

select first_name,salary, department_name,e.department_id,e.manager_id
from employees e join departments d
on e.department_id = d.department_id


--Print first_name,department_name ,city


---LEFT OUTER JOIN
select first_name,salary, department_name,e.department_id,e.manager_id
from employees e LEFT OUTER join departments d
on e.department_id = d.department_id

---RIGHT OUTER JOIN
select first_name,salary, department_name,e.department_id,e.manager_id
from employees e RIGHT OUTER join departments d
on e.department_id = d.department_id


---FULL OUTER JOIN
select first_name,salary, department_name,e.department_id,e.manager_id
from employees e FULL OUTER join departments d
on e.department_id = d.department_id


--SELF JOIN

select * from employees;

Neena reports to Steven
--Self join
select emp.first_name || ' reports to ' || mgr.first_name from employees emp join employees mgr 
on emp.manager_id = mgr.employee_id

select first_name || ' reports to ' || first_name from employees 

--CROSS JOIN
select * from employees
cross join departments


---CASE
SELECT last_name,salary, 
(CASE WHEN salary<5000 THEN 'Low' 
      WHEN salary<10000 THEN 'Medium' 
      WHEN salary<20000 THEN 'Good' 
      ELSE 'Excellent' 
END) AS qualified_salary 
FROM employees;


--DECODE
SELECT last_name, job_id, salary,
       DECODE(job_id, 'IT_PROG',  1.10*salary,
                      'ST_CLERK', 1.15*salary,
                      'SA_REP',   1.20*salary,
              salary)
       REVISED_SALARY
FROM   employees;



--SUB QUERY



select employee_id, first_name,salary from employees where salary > 
        ( select salary from employees where upper(first_name) = 'NEENA')


---Department wise employees name , who is drawing highest salary

select department_id, first_name, salary from employees where salary >= (select max(salary)  from employees group by department_id)

select department_id, first_name, salary from employees where salary IN (select max(salary)  from employees group by department_id)


select department_id, first_name, salary from employees where salary IN (select max(salary)  from employees group by department_id)

select department_id, first_name, salary from employees
where (salary,department_id) IN 
(select max(salary),department_id from employees group by department_id)
order by department_id
 
----Print the name of the person who is drawing lowest salary

select min(salary) from employees;

select first_name, min(salary) from employees group by first_name   

select first_name, salary from employees where salary = (select min(salary) from employees)   

select first_name, salary from employees where salary = (select max(salary) from employees)   

----
SELECT employee_id, last_name
FROM   employees
WHERE  salary IN
                (SELECT   MIN(salary)
                 FROM     employees
                 GROUP BY department_id);


---Real time example
-- second largest salary

------Find out the name and salary of Kochhar - Manager's - Manager

select first_name,salary from employees where employee_id=
(select manager_id from employees where first_name='TJ');


select first_name, salary from employees where employee_id = 
(select manager_id from employees where employee_id =
(select manager_id from employees where first_name = 'TJ'));

select emp.first_name || ' reports to ' || mgr.first_name from employees emp join employees mgr 
on emp.manager_id = mgr.employee_id


select e.first_name,e.employee_id,e.manager_id,d.employee_id,d.manager_id from employees e join employees d on e.manager_id=d.employee_id



-----SET OPERATORS

create table newemployees
as
select * from employees;

create table retiredemployees
as
select * from newemployees where employee_id in (109,110,111);

delete from newemployees where employee_id = 109;

select * from retiredemployees;
select * from newemployees;


newemployees - except 109       -106
retiredemployees  - 109,110,111  - 1 records

--union
select employee_id ,first_name,salary from newemployees
union
select employee_id, first_name,salary from retiredemployees

--union all
select employee_id ,first_name,salary from newemployees
union all
select employee_id, first_name,salary from retiredemployees


--union all
select employee_id ,first_name,salary from newemployees
intersect
select employee_id, first_name,salary from retiredemployees

--union all
select employee_id ,first_name,salary from newemployees
minus
select employee_id, first_name,salary from retiredemployees


------
select department_id, department_name,to_number(null) from departments
union
select department_id, To_Char(null) "DeptName", salary from employees


---------DML - Riya
desc departments;
select count(department_id) from departments;
insert into departments values (900,'CRDepartment',null,null)

insert into departments (department_id,department_name) values (901,'Operations')

INSERT into departments(department_id, department_name, manager_id, location_id)
    VALUES
    (909, 'HR', 100, 1700),
    (910, 'IT', 101, 1800),
    (920, 'HelpDesk', 102, 1700);


commit;

insert into departments values (&did, &dname,&mgr_id,&locid);

select * from locations;

select * from departments;

desc departments;



create table freshers
as
select * from employees where employee_id is null;


select * from freshers;



create table jobaspirants
as
select employee_id, first_name, salary, commission_pct from employees where employee_id is null;

select * from jobaspirants;

insert into jobaspirants (employee_id, first_name, salary, commission_pct )
select employee_id, first_name, salary, commission_pct from employees where salary > 20000;


insert into jobaspirants (employee_id, first_name, salary, commission_pct )
select employee_id, first_name, salary, commission_pct from retiredemployees;

select * from jobaspirants;

---update


----Neeena is working in a department
----TJ should be moved to same department as neena's and salary should also be same.

select * from employees where first_name in ('Neena','TJ');

UPDATE   employees
SET      (job_id,salary)  = (SELECT  job_id,salary
                    	       FROM    employees 
                             WHERE   employee_id = 205)
         WHERE    employee_id    =  103;

UPDATE   employees
SET      (department_id,salary)  = (SELECT  department_id,salary
                    	       FROM    employees 
                             WHERE   employee_id = 101)
         WHERE    employee_id    =  131;


select * from employees;
commit;


select * from departments;

delete from departments where department_id = 20;



delete from job_history  where department_id = 20;
delete from employees where department_id = (SELECT department_id   FROM   departments where department_id = 20);

delete from employees where employee_id =201;

select * from job_history;


commit;
---------------TCL
Transaction = a unit of work

insert employees
update salary
update pf

ACID

commit
rollback
savepoint



update employees set salary  = salary + salary * 0.1 where employee_id = 101;

create table newemp as
select * from employees;
--Riya
select * from employees where employee_id = 101;


update employees set salary  = salary + salary * 0.1 where employee_id = 101;

create table abc
as
select * from employees;

commit;



SELECT employee_id, salary, commission_pct, job_id
FROM employees  
WHERE job_id = 'SA_REP'
FOR UPDATE 
ORDER BY employee_id;


commit;


--COLUMN LEVEL
create table bankcustomer
(
        customerid number constraint pk_customerid primary key,
        accountNumber varchar(20)  constraint pk_accountNumber primary key,
        customerName varchar(20) not null,
        mobileNumber varchar(10)  constraint check (length(mobileNumber ) =10)
)

--TABLE LEVEL
create table bankcustomer
(
        customerid number not null,
        accountNumber varchar(20) not null,
        customerName varchar(20) not null,
        mobileNumber varchar(10)  constraint chkMobileNumber check  (length(mobileNumber ) =10),
        constraint  pk_cust_id_acc_number primary key (customerid,accountNumber)
)

insert into bankcustomer values(100,918176,'Tufail','8867205331')

select * from bankcustomer;

create table bankloan
(
    loanid varchar(20) constraint pkloanid primary key,
    loanamount number constraint chkloanAmount check  ( loanamount > 0),
    customerId number,
     accountNumber varchar(20) not null,
    constraint fkcustId foreign key(customerId,accountNumber) references bankcustomer(customerId,accountNumber) on delete cascade
)

insert into bankloan values(10113,1000000,100,'918171')

select * from bankcustomer;
select * from bankloan;

delete from bankcustomer where customerId = 100 and accountNumber = '918174'

---alter 

alter table bankcustomer add balance number

update bankcustomer set balance = 10000 


ALTER TABLE bankcustomer
MODIFY		   (customername VARCHAR2(30));

desc bankcustomer



DESCRIBE DICTIONARY

SELECT *
FROM   dictionary
WHERE  table_name = 'USER_OBJECTS';

SELECT object_name, object_type, created, status
FROM   user_objects
ORDER BY object_type;


SELECT table_name
FROM   user_tables;

SELECT column_name, data_type, data_length,
       data_precision, data_scale, nullable
FROM   user_tab_columns
WHERE  table_name = 'EMPLOYEES'; 

SELECT constraint_name, constraint_type,
       search_condition, r_constraint_name, 
       delete_rule, status
FROM   user_constraints
WHERE  table_name = 'EMPLOYEES'; 



SELECT constraint_name, column_name
FROM   user_cons_columns
WHERE  table_name = 'EMPLOYEES'; 


--COMMENTS
COMMENT ON TABLE employees
IS 'Employee Information';


COMMENT ON COLUMN employees.first_name
IS 'First name of the employee';

COMMENT ON COLUMN employees.salary
IS 'Salary of the employee';

View –Comments 
SELECT column_name, comments FROM user_col_comments WHERE table_name = 'EMPLOYEES' AND column_name = 'SALARY';



SELECT constraint_name, constraint_type,
       search_condition, r_constraint_name, 
       delete_rule, status
FROM   user_constraints
WHERE  lower(table_name) = 'bankcustomer'; 

select * from bankcustomer;


create sequence bankcustomeridsequence
        START WITH 200
                INCREMENT BY 10
                MAXVALUE 9999
                NOCACHE
                NOCYCLE;

create sequence bankcustomeraccountnumbersequence
        START WITH 99
                INCREMENT BY 2
                MAXVALUE 9999
                NOCACHE
                NOCYCLE;
                        
insert into bankcustomer values(bankcustomeridsequence.nextval,bankcustomeraccountnumbersequence.nextval,'Nikhil','8867205331',10000)

select * from bankcustomer;

drop sequence    bankcustomeridsequence  
drop sequence    bankcustomeraccountnumbersequence  


CREATE SEQUENCE ID_SEQ START WITH 1;


CREATE TABLE emp (ID NUMBER DEFAULT ID_SEQ.NEXTVAL NOT NULL, 
                  name VARCHAR2(10));
INSERT INTO emp (name) VALUES ('john');
INSERT INTO emp (name) VALUES ('mark');
SELECT * FROM emp;

DESCRIBE user_sequences

SELECT	sequence_name, min_value, max_value, 
	increment_by, last_number
FROM	 user_sequences;

create public synonym dep for departments;


select * from dep;
select * from departments;


---index



 create index idx_first_name
 on employees(first_name);

 create index idx_last_name
 on employees(last_name);
 
 DESCRIBE user_indexes

 
 SELECT index_name, table_name, uniqueness
FROM   user_indexes
WHERE  table_name = 'EMPLOYEES'; 


drop index idx_first_name

CREATE VIEW 	empvu80
 AS SELECT  employee_id, last_name, salary
    FROM    employees
    WHERE   department_id = 80;

SELECT * FROM EMPVU80;

UPDATE empvu80 set salary =salary + 2000 where employee_id = 145;

SELECT * FROM employees where employee_id = 145;

--Hands on 
select * from futureemployees;
create table futureemployees
as 
select * from employees;

CREATE or replace force VIEW  viewEmp100 
 AS SELECT  employee_id, last_name, salary,department_id
    FROM    futureemployees
    WHERE   department_id = 80 and salary > 10000
with check option

insert into viewEmp100 values(19181,'Kushagra',430000,80)

select * from VIEWEMP100;

UPDATE viewEmp100 set salary =11000 where employee_id = 146;

SELECT text FROM user_views 
WHERE lower(view_name) = 'viewemp100';

SELECT view_name FROM user_views;


CREATE OR REPLACE VIEW dept_sum_vu
  (name, minsal, maxsal, avgsal)
AS SELECT   d.department_name, MIN(e.salary), 
            MAX(e.salary),AVG(e.salary)
   FROM     employees e JOIN departments d
   USING    (department_id)
   GROUP BY d.department_name;


select * from dept_sum_vu


-------GRANT


create user c##nandini identified by root;

----------------Creating Role and assigning user

create role c##manager;

GRANT create session
TO c##manager;  

create user c##nikhil

create user c##realnikhil identified by root

grant c##manager to c##realnikhil

ALTER USER c##nikhil
IDENTIFIED BY root;


GRANT  select
ON     employees
TO     c##realnikhil;

GRANT  create table
TO     c##realnikhil

GRANT   update 
TO     c##realnikhil

GRANT   insert
ON     departments
TO     c##realnikhil
WITH GRANT OPTION;

GRANT   insert
ON     emp100
TO     c##realnikhil
WITH GRANT OPTION;


---------------------------------------------------------


26 | 3 | Introduction to Vector Databases and AI Vector Search in Oracle Database 23ai
27 | Creating Vector Embeddings, VECTOR Data Type, and Similarity Search
28 | Building RAG Applications with Oracle AI Vector Search
29 | Vector Indexes, Performance Tuning, and Real-world GenAI Use Cases


DROP TABLE IF EXISTS employeeprofiles;

CREATE TABLE EMPLOYEEPROFILES
(
    ID NUMBER,
    content varchar(200),
    embedding vector(3,FLOAT32)
) TABLESPACE USERS;


desc employeeprofiles;

insert into employeeprofiles values(100,'Oracle Database Developer' , VECTOR('[0.1,0.2,0.3]'));
insert into employeeprofiles values(200,'AI Vector Search Developer' , VECTOR('[0.2,0.3,0.4]'));
insert into employeeprofiles values(300,'Machine Learning Developer' , VECTOR('[0.9,0.8,0.7]'));

select * from employeeprofiles;
insert into employeeprofiles values(400,'MySQL Developer' , VECTOR('[0.1,0.2,0.0]'));
insert into employeeprofiles values(500,'Postgres Developer' , VECTOR('[0.0,0.0,0.0]'));


DROP TABLE EMPLOYEEPROFILES2 if exists;

CREATE TABLE EMPLOYEEPROFILES2
(
    ID NUMBER,
    content varchar(200),
    embedding vector(*,FLOAT32,SPARSE)
) TABLESPACE USERS;
insert into employeeprofiles2 values(100,'Oracle Database Developer' , VECTOR('[0.1,0.2,0.3]'));
insert into employeeprofiles2 values(200,'AI Vector Search Developer' , VECTOR('[0.2,0.3,0.4]'));
insert into employeeprofiles2 values(300,'Machine Learning Developer' , VECTOR('[0.9,0.8,0.7]'));

select * from employeeprofiles2;
insert into employeeprofiles2 values(400,'MySQL Developer' , VECTOR('[0.1,0.2,0.0]'));
insert into employeeprofiles2 values(600,'Postgres Developer',VECTOR('[0,19,98]'));
insert into employeeprofiles2 values(700,'Postgres Developer',VECTOR('[0,0,0]'));

commit;


-----------------------Query
select * from employeeprofiles
INSERT INTO employeeprofiles
VALUES (
4,
'Python Full Stack Developer',
VECTOR('[0.16,0.26,0.36]')
);

INSERT INTO employeeprofiles
VALUES (
5,
'Network Administrator',
VECTOR('[0.95,0.85,0.75]')
);


select * from employeeprofiles order by embedding;


drop table t1;
create table t1 ( v vector) TABLESPACE USERS;

insert into t1 values('[1.9]')

INSERT INTO t1 VALUES ('[1.5]');

INSERT INTO t1 VALUES ('[2.5, 3.5]');

INSERT INTO t1 VALUES ('[1.1, 2.2, 3.3]');

INSERT INTO t1 VALUES ('[4.4, 5.5, 6.6, 7.7]');

INSERT INTO t1 VALUES ('[10, 20, 30, 40, 50]');

INSERT INTO t1 VALUES ('[-1.5, 2.8]');

INSERT INTO t1 VALUES ('[0, 0, 0]');

INSERT INTO t1 VALUES ('[-5.2, 3.4, -8.1, 7.6]');

INSERT INTO t1 VALUES ('[100.25]');

insert into t1 values (null);

select * from t1;



----------t2

drop table t2;
CREATE TABLE IF NOT EXISTS t2
(
    id      NUMBER NOT NULL,
    name    VARCHAR2(32),
    v1      VECTOR,
    PRIMARY KEY (id)
) TABLESPACE USERS;

INSERT INTO t2 VALUES (100, 'Park', '[1.1]')

INSERT INTO t2 VALUES (1, 'A', '[1.1]'),
                      (2, 'B', '[2.2]');

select * from t2;


update t2 set v1 = '[9,2]' where id = 1;

update t2 set v1 = '[9,2]' where id = 1;

select * from employeeprofiles2;
---ToDo - : Textual input conversion between sparse and dense vector is not supported.
update employeeprofiles2 set embedding = '[0.2,0.3,0.4]' where id = 200;



 CREATE TABLE IF NOT EXISTS t3
    (
        id      NUMBER NOT NULL,
        name    VARCHAR2(32),
        v1      VECTOR,
        v2      VECTOR,
        v3      VECTOR,
        PRIMARY KEY (id)
    )  TABLESPACE USERS;
    
    
        INSERT INTO t3 VALUES
(
    1,
    'One',
    '[2.3, 4.5, 0.1]',
    '[1.3]',
    '[4.981, -6.3]'
);

    INSERT INTO t3 VALUES
(
    3,
    'Two',
    '[2.3,2,2,2,2,2,2,2,2,2,222]',
    '[1.3]',
    '[1]'
);


select * from t3;


CREATE TABLE IF NOT EXISTS t4
(
    v VECTOR(3, FLOAT32)
) TABLESPACE USERS;



INSERT INTO t4 VALUES ('[1.3, 2.4, 3.5]');

select * from t4;

truncate table t4;

drop table vt1;

CREATE TABLE IF NOT EXISTS vt1
(
    id    NUMBER NOT NULL,
    v     VECTOR(2, FLOAT32),
    PRIMARY KEY (id)
) Tablespace users;

DESC vt1

    INSERT INTO vt1
VALUES (1, '[3, 3]'),
       (2, '[5, 3]'),
       (3, '[7, 3]'),
       (4, '[3, 5]'),
       (5, '[5, 5]'),
       (6, '[7, 5]'),
       (7, '[3, 7]'),
       (8, '[5, 7]'),
       (9, '[7, 7]');


----
select * from vt1 order by id;

select * from vt1 order by  VECTOR_DISTANCE(VECTOR('[9,3]'), v, EUCLIDEAN) ;  

SELECT id
FROM vt1
ORDER BY VECTOR_DISTANCE(
           VECTOR('[0, 0]'),
           v,
           EUCLIDEAN)
FETCH FIRST 3 ROWS ONLY;


SELECT id
FROM vt1
ORDER BY VECTOR_DISTANCE(
           VECTOR('[0, 0]'),
           v,
           COSINE)
FETCH FIRST 3 ROWS ONLY;


select * from t2;

select * from employeeprofiles;



insert into employeeprofiles values(100,'Oracle Database Developer' , VECTOR('[0.1,0.2,0.3]'));
insert into employeeprofiles values(200,'AI Vector Search Developer' , VECTOR('[0.2,0.3,0.4]'));
insert into employeeprofiles values(300,'Machine Learning Developer' , VECTOR('[0.9,0.8,0.7]'));


commit;
-- back end developer   - embedding  0.2,0.5,0.9
-- ai developer   - embedding  0.2,0.5,0.9
-- search shoes - emdedding - AI model
-- machine developer - 0.7,0.4,0.6
SELECT id, content,  VECTOR_DISTANCE( embedding,VECTOR('[0.7,0.4,0.6]'), EUCLIDEAN) AS distance 
    FROM employeeprofiles ORDER BY distance;




CREATE TABLE products
(
    product_id NUMBER PRIMARY KEY,
    product_name VARCHAR2(100),
    image_embedding VECTOR(3)
)tablespace users;


INSERT INTO products VALUES(101,'Black Sports Shoe', VECTOR('[0.82,0.14,0.67]'));
INSERT INTO products VALUES(102,'Running Shoe', VECTOR('[0.81,0.15,0.66]'));
INSERT INTO products VALUES(103,'Leather Wallet', VECTOR('[0.20,0.85,0.11]'));
INSERT INTO products VALUES(104,'Tracks', VECTOR('[0.78,0.10,0.63]'));
INSERT INTO products VALUES(105,'Cash', VECTOR('[0.22,0.83,0.09]'));
INSERT INTO products VALUES(106,'Cards', VECTOR('[0.23,0.87,0.15]'));


commit;

SELECT product_id, product_name,  VECTOR_DISTANCE( image_embedding,VECTOR('[0.74,0.76,0.54]'), EUCLIDEAN) AS Results 
    FROM products ORDER BY Results FETCH FIRST 2 ROWS ONLY;

--searching loan
SELECT product_id, product_name,  VECTOR_DISTANCE( image_embedding,VECTOR('[0.64,0.76,0.54]'), EUCLIDEAN) AS Results 
    FROM products ORDER BY Results FETCH FIRST 2 ROWS ONLY;

-------------

Code:
-- [Commodity, Material, Color]
INSERT INTO products VALUES
(201,'Black Sports Shoe',       VECTOR('[0.82,0.14,0.67]')),
(302,'White Running Shoe',      VECTOR('[0.81,0.18,0.36]')),
(603,'Green Leather Wallet',    VECTOR('[0.20,0.85,0.11]')),
(804,'Green Sneakers',          VECTOR('[0.85,0.12,0.12]')),
(905,'Brown Leather Belt',      VECTOR('[0.11, 0.81,0.96]')),
(1106,'White Polymer Wallet',    VECTOR('[0.21,0.67,0.34]'));

SELECT * FROM PRODUCTS;

-- White Leather Shoe
select product_id, product_name, VECTOR_DISTANCE(image_embedding, '[0.80, 0.83, 0.38]', EUCLIDEAN) AS DISTANCE
from products
order by Distance FETCH FIRST 3 ROWS ONLY;




select * from vt1;


---Index and clustered

ALTER SYSTEM SET vector_memory_size = 512M SCOPE=SPFILE;

SHOW PARAMETER vector_memory_size;


CREATE VECTOR INDEX emp_vector_idx
ON employeeprofiles(embedding)
ORGANIZATION INMEMORY NEIGHBOR GRAPH
TABLESPACE USERS;

----RAG ----------


-----------Narrow Search----------

select * from vt2;

SELECT id,
       vsize,
       shape,
       color,
       TO_NUMBER(
           VECTOR_DISTANCE(
               VECTOR('[16, 3]'),
               v,
               EUCLIDEAN
           )
       ) AS distance
FROM vt2
WHERE id > 30
  AND id < 40
ORDER BY VECTOR_DISTANCE(
             VECTOR('[16, 3]'),
             v,
             EUCLIDEAN
         )
FETCH FIRST 4 ROWS ONLY;




select * from vt2;


SELECT id,
       vsize,
       shape,
       color
FROM vt2
ORDER BY VECTOR_DISTANCE(
           VECTOR('[6, 8]'),
           v,
           EUCLIDEAN)
FETCH FIRST 10 ROWS ONLY;




select * from loan ;







select * from customers;
select * from customers where customerName = jayesh;

select * from employees100;
select * from contractemployee100;
select * from Regularemployee100





























Hands - on

1. Get the name and salary of the employee who is getting the second highest salary.

select first_name,salary from employees order by salary desc OFFSET 1 ROW 
FETCH 1 ROW

2. Get the names and salaries of the top 5 highest-paid employees.
3. Get the employee who is getting the lowest salary.







Java 17 Fundamental
Day 1: Introduction to Java
Welcome and Course Overview
Introduction to Java
History and Evolution of Java
Java SE 17 Features and Enhancements
Setting Up the Development Environment
	Installing JDK 17
	Setting up IDE (IntelliJ IDEA/Eclipse/NetBeans)
Configuring the IDE
Basic Syntax and Structure
Java Program Structure
Writing Your First Java Program
Compiling and Running Java Programs
Variables and Data Types
Primitive Data Types
Reference Data Types
Variable Declaration and Initialization
Type Casting
Operators and Expressions
Arithmetic Operators
Relational Operators
Logical Operators
Assignment Operators



C:\Program Files\Java\jdk-17\bin
E:\Trainings\2026\7.OFSS\ofss202601\corejava




class Hello
{
}

JVM		- XX

JRE
	-JVM
	- lib 


JDK	- lib
	- JVM
	- JRE


History of java


JDK 1
*JDK 5	- Generirs, Annotation, enhanced for loop, 
JDK 7 	- try with resources
* JDK 8	- Lambda Expression, Functional Programming,streams
JDK 9	- Modules



---Convention
class - Starting with upper case
methods - smallCase
variables - sameCase
CONSTANT - FULL CAPITAL


** Eclipse IDE
Intellji
** Netbeans


Hands on : Create Weather class with method getWeather and return a message "Today weather is awesome" and call the method in App class main method

5 minutes


Packages
-----------------
-- maintainace
- name collision

All java classes belongs packages
default package - java.lang	- 


Variables
--------------
number 
	byte
	short
	int
	long

decimal
	float
	double

char
	char

	boolean

String - class - java.lang

int marks=95;
XX	float grade=99.9;
boolean married=true;
char vowel = 'P';
byte b1 = 12;
short s1 = 1200;
double d1 = 789.98;
long l1 = 918181;


Casting
-------------

Implict
Explicit


byte b1 = 2;
byte b2 = 2;
byte result = b1 + b2;
System.out.println(result);










Access specifier
---------------------

public		default		private	       protected

Everyone		same package	No access      package+child classess


Hands on : Create two packages pack1 and pack2 with following classes

pack1
	A
		protected i
	B:A

	C

pack2
	D:A

	E



---
Exercise: Packages

Create a new project in which create a package named org.animals.

 In that create various classes like Lion, Monkey, Elephant. In each class create data members like color, weight and age. Create methods like isVegetarian, canClimb, getSound.

Create another package called zoo and create a class called VandalurZoo and create objects for the animals that are existing in zoo and print the characteristic of each animal.

Reference Data Types
-----------------------------
Variable Declaration and Initialization


class Animal
{
	int age;
	public void eat()
	{
		int drink;
		System.out.println("Animal age is :"+age);
               	System.out.println("Animal drinks water in liter :"+drink);
      		System.out.println("Total :"+age+drink);
	}
	
}

















Introduction to OOP
Principles of OOP


Benefits of OOP
Classes and Objects

Defining Classes
Creating Objects
Class Members (Fields and Methods)
Constructors
Methods and Encapsulation
Method Declaration and Invocation
Method Overloading
Access Modifiers
Encapsulation and Data Hiding


Employee
Manager
Tea

Tea extends Manager


is-a test



Constructors
-----------------



Load the class.
Execute static variables (top to bottom).
Execute static blocks (top to bottom).
Execute main().
On each new object:
	Instance variables (top to bottom)
	Instance initialization blocks (top to bottom)
	Constructor



09:41 13-07-2026

https://www.oracle.com/in/middleware/technologies/weblogic-server-downloads.html

https://github.com/oracle/weblogic-remote-console/releases/download/v2.4.16/WebLogic-Remote-Console-2.4.16-win.exe




Remote console - Download and install WebLogic-Remote-Console-2.4.16-win

Day 2: Object-Oriented Programming (OOP) Basics
Introduction to OOP
Principles of OOP
Benefits of OOP
Classes and Objects
Defining Classes
Creating Objects
Class Members (Fields and Methods)
Constructors
Methods and Encapsulation
Method Declaration and Invocation
Method Overloading
Access Modifiers
Encapsulation and Data Hiding


Inheritance
Inheritance Basics
The super Keyword
Method Overriding
Object Class




extends



class Manager 
{
	
}

class Employee extends Manager
{
	
}


Overrding

Access spec- child classes can increase the accessiblity 

public --> proctected --> default --> private

Cannot reduce the visibility of the inherited method from Manager


GC
---------



Object  -super  class for all classes in java

----------------
Object
	------
toString
finalize
equals
hashcode
wait
notify




Create a banking app to bank customer can transfer, apply for loans




Model /Pojo 
	
	private 

Customer
	customerId
	accountNumber
	customerName
	mobileNumber
	balance


	//default cons
	//parametrized cons
	//getter and setters

	//toString

































Day 3: Advanced OOP Concepts
Polymorphism
Static vs Dynamic Binding
Method Overriding and Overloading
Polymorphic Behavior



Abstract Classes and Interfaces
Abstract Classes
Interfaces
Implementing Multiple Interfaces



Abstract class -
with abstract methods 



Interfaces
Implementing Multiple Interfaces
------------------------------------------------

class extends class

class implements interface


interface extends interface



































Inner Classes
Member Inner Classes
Local Inner Classes
			** Anonymous Inner Classes
Static Nested Classes






** Anonymous Inner Classes
-----------------------------------------













Packages and Access Control
Defining Packages
Importing Packages
Access Control Levels




Functional Interfaces and Lambda Expressions (Java 8 and beyond)
------------------------------------------------------------------------------------

Hands on 

Create two interface

1) 	MutualFund
		addPortfolio(String shareName, int shares, int value)


	shares*value	


2) Create a class to implement this interface

	MRF shares of 2 value of 140000 = 280000

3) Use anonymous inner class to print values 

	OFSS shares of 2 value of 12000 = 24,000



1.8 onwards
Function programming -- 
Functional Interface	- any interface with a single method 



Day 4: Exception Handling and Collections Framework
Exception Handling
Types of Exceptions
The try-catch Block
throw and throws
Custom Exceptions

Object


Throwable


	Exception				Error


RuntimeException(unchecked)



try


catch


finally
	


throws
throw		- 














































The Collections Framework
Introduction to Collections
List, Set, and Map Interfaces
ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap
Iterating through Collections
Generics
Introduction to Generics
Generic Classes and Methods
Bounded Type Parameters
Type Inference and Wildcards



		Collection	- interface

Set(no duplicates)			List		
	
TreeSet(sort)			ArrayList - not sync, not thread safe
LinkedHashSet(order)		LinkedList		address
HashSet(no order)			Vector	- sync and thread safe



		Collections	- class	0 lots of static methid

	Map


Functional Interface 
Comparable	- java.lang	compare(
Comparator	- java.util		compareTo(2 param)






HashMap
TreeMp
LinkedHashMap
HashTable




--------------------------------------------------------










Thread

Serialization
Multithreading and Concurrency
Introduction to Threads
Creating and Running Threads
Synchronization
Concurrency Utilities (java.util.concurrent)




extends Thread
implements Runnable












Hands on :

create two threads and call the same method from the two threads


Transfer

	deposit
	













































Day 5: Java Advanced Topics and Best Practices
Java I/O
File I/O with java.nio.file
Reading and Writing Files
Buffered Streams



java.io.



FileReader


FileWriter


Input - 	Read
Output	- Write


Customer	- Serialization
ObjectInputStream
ObjectOutputStream

File




product-app
	product-details	- names of product
	product-list	- printing





--------------Expected

The product details are :

Monitor
Mobile
Keyboard




























Annotation
--------------------
Maven
-------------------


Step 1: 
Create a maven project named product-app-alstrom
select quick start

group id : com.training.papp
Artifact id : product-app-alstrom
package : com.training.papp

Finish























Step 2 :

Create two folders named productlist and productdetails

Right click on your project product-app-alstrom and create the above folders ( normal folder and not source folder )


Step 3: Create new maven project in above two folders :
Right click on productlist folder  new maven project 


** important to checkbox first and uncheck the next one

Step 4:

Create another maven project similarly inside productdetails folder








Step 5:
You should have two project created + one main project by this time.

Next step is to update the pom.xml of all three project to have JDK11 by default
Open pom.xml of all the three project and update
 <url>http://maven.apache.org</url>

 <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   <maven.compiler.source>11</maven.compiler.source>
   <maven.compiler.target>11</maven.compiler.target>
  </properties>

  <dependencies>

 other pom.xml 

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   <maven.compiler.source>11</maven.compiler.source>
   <maven.compiler.target>11</maven.compiler.target>
  </properties>

 <modelVersion>4.0.0</modelVersion>
  <groupId>com.training.list</groupId>
  <artifactId>productlist</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</project>


Step 6:
Update your project  Right click on main project  Maven  Update

Step 7:
** Navigate to project explorer, if right click Configure not coming
Now we add modules in all the sub projects
** don’t add module-info in main project , neither add main modules in pom.xml


Step 8: Repeat the same for productlist project as well

You must have module-info.java in both 

Step 9: Its time to update main project pom.xml to include the modules :
 <packaging>pom</packaging>

  <name>product-app-alstrom</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   <maven.compiler.source>11</maven.compiler.source>
   <maven.compiler.target>11</maven.compiler.target>
  </properties>

<modules>
		<module>productdetails</module>
		<module>productlist</module>
</modules>

Save and maven update main project


Step 10:
Now we create a method in productlist module and access it in productdetails module.
Productlist  src/main/java  Right click  new class
package com.training.plist;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
		
	public static List<String> getProductList() {
		List<String> products = new ArrayList();
			products.add("Lakme");
			products.add("Aroma");
			products.add("Glass");
			return products;
	}
}




Step 11:
Add exports to module-info.java file of productlist project

module productlist {
exports com.training.plist;
}


Step 12:
Add requires to module-info.java file of productdetails project

module productdetails {
requires productlist;
}


**error will come . Hover and click fix project setup  Ok



Step 13:

Now we create a method in productldetails module and access it in 
productdetails  src/main/java  Right click  new class
package com.training.plist;


Now we create a method in productldetails module and access it in 
package com.training.pdetails;

import java.util.List;

import com.training.plist.ProductList;

public class PrinntProductDetails {

	public static void main(String[] args) {
		List<String> products = ProductList.getProductList();
		
		System.out.println(products);
	}

}


Step 14:
Now we create a method in productldetails module and access it in 
package com.training.pdetails;

import java.util.List;

import com.training.plist.ProductList;

public class PrinntProductDetails {

	public static void main(String[] args) {
		List<String> products = ProductList.getProductList();
		
		System.out.println(products);
	}

}
Save but NR 





Step 15:
Right click on main project  Run as maven install .

Re run if it gives some error.

[INFO] Reactor Summary for product-app-alstrom 0.0.1-SNAPSHOT:
[INFO] 
[INFO] productdetails ..................................... SUCCESS [  1.287 s]
[INFO] productlist ........................................ SUCCESS [  0.151 s]
[INFO] product-app-alstrom ................................ SUCCESS [  0.032 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.586 s
[INFO] Finished at: 2023-07-23T14:28:20+05:30
[INFO] ------------------------------------------------------------------------



Step 16:
Right click on project productdetails  build path  Libraries  ModulePath  Add Jars  add productlist jar file here 


Step 17:
Success






































Lambda Expressions and Streams API
Lambda Expressions Syntax
Functional Interfaces
Streams API for Bulk Data Operations
Stream Processing: filter, map, reduce



Java Modules (Project Jigsaw)
Introduction to Modules
Creating and Using Modules
Module Declarations
Module System in Java 17
Best Practices and Design Patterns
Coding Standards and Conventions
Design Patterns in Java
Effective Java Tips
Code Optimization Techniques
Course Wrap-Up
Review Key Concepts
Q&A Session
Resources for Further Learning
Final Project/Assignment






Streams in java

Streams API for Bulk Data Operations
Stream Processing: filter, map, reduce


Stream represents a sequence of objects from a source which supports aggregate operations. 


  Sequence of elements – They provide a set of elements of specific type    
    in a sequential manner. 
    They get/compute elements on demand. They never store elements.

   Source - Streams take Collections, Arrays, or I/O resources as input  
                    source.

Aggregate Operations – They support aggregate operations like filter, map,  
                 limit, reduce, find, match, etc.



       List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1"); myList .stream() 
.filter(s -> s.startsWith("c")) 
.map(String::toUpperCase) 
.sorted() 
.forEach(System.out::println); // C1 // C2 


Stream operations are either intermediate or terminal. 


       stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))		//desc order
                .forEach(System.out::println);


  long startsWithB = stringCollection
                .stream()
                .filter((s) -> s.startsWith("b"))
                .count();

        System.out.println(startsWithB);    // 3








• Create an object called employee whose attributes are emp_id, emp_name and emp_sal.  Write a program to Serialize and deserialize the employee object except for the emp_sal attribute. 


•	A shop has a list of product code , description and price.  Some prices are listed in terms of kg and others are listed in terms of dozens. Customers buys the different products  in different  quantities. The application must display a bill with the product code , description , quantity  and price per unit and total price.


 Modules in Java
-----------------------


method	
class
packages

multi modules project






























JPA
-----


   <dependency>
			<groupId>org.eclipse.persistence</groupId>
			<artifactId>org.eclipse.persistence.jpa</artifactId>
			<version>2.5.1</version>
			<scope>provided</scope>
		</dependency>


		<dependency>
			<groupId>org.eclipse.persistence</groupId>
			<artifactId>eclipselink</artifactId>
			<version>2.0.0</version>
			<scope>>compile</scope>
		</dependency>

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.1.0.Final</version>
			<type>pom</type>
			<scope>compile</scope>
		</dependency>

		<dependency>
			<groupId>javax</groupId>
			<artifactId>javaee-api</artifactId>
			<version>7.0</version>
		</dependency>

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-entitymanager</artifactId>
			<version>5.3.7.Final</version>
		</dependency>


		


		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>1.7.25</version>
		</dependency>

		<dependency>
			<groupId>org.hibernate.common</groupId>
			<artifactId>hibernate-commons-annotations</artifactId>
			<version>5.1.0.Final</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/com.oracle.database.jdbc/ojdbc10 -->
		<dependency>
			<groupId>com.oracle.database.jdbc</groupId>
			<artifactId>ojdbc10</artifactId>
			<version>19.19.0.0</version>
		</dependency>


		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.9</version>
		</dependency>


	</dependencies>
	<repositories>
		<repository>
			<id>EclipseLink Repo</id>
			<url>http://download.eclipse.org/rt/eclipselink/maven.repo</url>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</repository>
	</repositories>



</project>


---src/main/resources/META-INF/persistence.xml


-----
** most important  right click on project --> show in system explorer
create resources folder under src/main
create META-INF folder under resources
Click refresh
create persistence.xml file inside META-INF folder


<persistence xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
  version="2.0" xmlns="http://java.sun.com/xml/ns/persistence">
  <persistence-unit name="ahmed" transaction-type="RESOURCE_LOCAL">
  	<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
    <class>com.training.Product</class>
    <properties>
      <property name="javax.persistence.jdbc.driver" value="oracle.jdbc.driver.OracleDriver" />
            <property name="javax.persistence.jdbc.url" value="jdbc:oracle:thin:@0.0.0.0:1521:free" />
            <property name="javax.persistence.jdbc.user" value="system" />
            <property name="javax.persistence.jdbc.password" value="root" />
			<property name="hibernate.hbm2ddl.auto" value="update" />
				  <property name="eclipselink.ddl-generation" value="drop-and-create-tables"/>
                   <property name="hibernate.dialect" value="org.hibernate.dialect.OracleDialect" />
		<property name="eclipselink.ddl-generation" value="create-or-extend-tables" />
     	 <property name="eclipselink.ddl-generation.output-mode" value="galaxe" />
    	</properties>

  </persistence-unit>
</persistence>


----
package com.training;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products200")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@Column
	private String productName;
	
	@Column
	private int quantityOnHand;
	
	@Column
	private int price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}



-----------------

package com.training;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

	private static final EntityManagerFactory entityManagerFactory;
	
	static {
		try {
			entityManagerFactory =  Persistence.createEntityManagerFactory("ahmed");
		}
		catch(Throwable throwable) {
			throw new ExceptionInInitializerError(throwable);
		}
	}
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}


---------------

package com.training;

import javax.persistence.EntityManager;

/**
 * Hello world!
 *
 */
public class App {
	private EntityManager entityManager = EntityManagerUtil.getEntityManager();

	public static void main(String[] args) {
		App app = new App();
		app.saveProduct();
		System.out.println("Product saved");
	}

	public void saveProduct() {
		Product product = new Product(122, "Speakers", 18, 19);
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(product);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Exception occurred " + e);
		}
	}
}



JPA
--------
1. Overview of JPA and Eclipselink	- ORM ( Object relational mapping)
2. Mapping with JPA
3. Updates and Queries
4. Inserting and Updating
5. Entity Association (one-one, one-many……) & Inheritance
6. Entity Association Cont….
7.Querying and JPQL
8.Named Queries
9. Criteria Query API
10. Queries Across Relationships (Inner Joins, Outer Joins, Fetch Joins)
11. Simple case study for 2 hours on JPA


Database connection to app -- JDBC



Use case : Customer details needs to be saved in oracle database.


































Use case : Create a CRUD app for Customer.

DAO Design pattern 

M E N U

	1. Add a customer
	2. 

JPQL
-------



Customer customer = em.createQuery(
        "SELECT c FROM Customer c WHERE c.customerId = :id",
        Customer.class)
        .setParameter("id", 101)
        .getSingleResult();


List<Customer> customers = em.createQuery(
        "SELECT c FROM Customer c WHERE c.customerName = :name",
        Customer.class)
        .setParameter("name", custName)
        .getResultList();


List<Customer> customers = em.createQuery(
        "SELECT c FROM Customer c WHERE c.balance > :bal",
        Customer.class)
        .setParameter("bal", 10000)
        .getResultList();


UPDATE using JPQL

em.createQuery(
    "UPDATE Customer c SET c.balance = :bal WHERE c.customerId = :id")
    .setParameter("bal", 50000)
    .setParameter("id", 101)
    .executeUpdate();

DELETE using JPQL
em.createQuery(
    "DELETE FROM Customer c WHERE c.customerId = :id")
    .setParameter("id", 101)
    .executeUpdate();


count
-----------

Long count = em.createQuery(
        "SELECT COUNT(c) FROM Customer c",
        Long.class)
        .getSingleResult();

System.out.println(count);

--order by
List<Customer> customers = em.createQuery(
        "SELECT c FROM Customer c ORDER BY c.balance DESC",
        Customer.class)
        .getResultList();



--BETWEEN

List<Customer> customers = em.createQuery(
        "SELECT c FROM Customer c WHERE c.balance BETWEEN :min AND :max",
        Customer.class)
        .setParameter("min", 10000)
        .setParameter("max", 50000)
        .getResultList();

----------------Association code

package com.training.alstrom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "employees100")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

----------

package com.training.alstrom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Regularemployee100")
@PrimaryKeyJoinColumn(name = "ID")
public class Regular_Employee extends Employee {

	@Column(name = "salary")
	private float salary;

	@Column(name = "bonus")
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

//setters and getters  

}

--------------
package com.training.alstrom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="contractemployee100")  
@PrimaryKeyJoinColumn(name="ID")  
public class Contract_Employee extends Employee{  
      
    @Column(name="pay_per_hour")  
    private float pay_per_hour;  
      
    @Column(name="contract_duration")  
    private int contract_duration;

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public int getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(int contract_duration) {
		this.contract_duration = contract_duration;
	}  
  
    //setters and getters  
    
    
}  ------------

<class>com.training.alstrom.model.Employee</class>
		<class>com.training.alstrom.model.Regular_Employee</class>
		<class>com.training.alstrom.model.Contract_Employee</class>


TestEmployee.java


package com.training;

import javax.persistence.EntityManager;

import com.training.alstrom.model.Contract_Employee;
import com.training.alstrom.model.Employee;
import com.training.alstrom.util.EntityManagerUtil;

public class TestEmployee {

	public TestEmployee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getEntityManager();
		
		Contract_Employee emp = new Contract_Employee();
		emp.setId(22);
		emp.setName("Sathvik");
		emp.setContract_duration(12);
		emp.setPay_per_hour(100000);
		
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
		
		System.out.println("Employee saved");
	}
}



Weblogic






















--- Domain	- highest level entity
	--- Admin Server		- manages the web logic 
	--- Managed Server		-- manages the requests/serves the request



	localhost:7001/hello-app	--> request	WSL



What is role of web logic server in JDBC ?
We create DSN ( data source name )/JNDI in wsl and use in our app.














weblogic
weblogic@123



localhost: 7001		- AdminServer	-- start
server1  :7003		- server1
server2  :7004		- server2


machine1	 : 5556


configuration
H:\Oracle\Middleware\Oracle_Home\oracle_common\common\bin


start weblogic
H:\Oracle\Middleware\Oracle_Home\user_projects\domains\base_domain\startWebLogic.cmd

start weblogic managed server
H:\Oracle\Middleware\Oracle_Home\user_projects\domains\base_domain\sartManagedWebLogic.cmd server1 http://localhost:7001

H:\Oracle\Middleware\Oracle_Home\user_projects\domains\base_domain\bin>startManagedWebLogic.cmd server2 http://localhost:7001



Node Manager
---------------------
Deploy Application
-------------------------
Clustering



Use case : 

Step 1: start web logic server
H:\Oracle\Middleware\Oracle_Home\user_projects\domains\base_domain\startWebLogic.cmd

7001


Step 2: 

H:\Oracle\Middleware\Oracle_Home\user_projects\domains\base_domain\bin\startNodeManager.cmd
5556



























