"# ofss202601" 

https://codeshare.io/test1


To access OU SGD, navigate to http://ouconnect.oracle.com.
Select Log in link.
Enter in user name: 98595274.user01 ... 98595274.userxx
Enter in password: Mtm1GDr7iO (same for all users)
Once connected, follow the lab exercises provided in the e-kit.






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

	
















