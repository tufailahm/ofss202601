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
        .setParameter("name", "John")
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
