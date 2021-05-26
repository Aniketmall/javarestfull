package com.java;



public class Employee {

private int id;

private String name;

private String city;

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

public String getCity() {

 return city;

}

public void setCity(String city) {

 this.city = city;

}

@Override

public String toString() {

 return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";

}

}





<?xml version="1.0" encoding="UTF-8"?>

<beans

  xmlns="http://www.springframework.org/schema/beans"

  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

  xmlns:p="http://www.springframework.org/schema/p"

  xsi:schemaLocation="http://www.springframework.org/schema/beans

        http://www.springframework.org/schema/beans/spring-beans-4.0.xsd">

<bean id="obj" class="com.java.Employee">

<property name="id" value="10"></property>

<property name="name" value="Vijay"></property>

<property name="city" value="hyderabad"></property>

</bean>

</beans>









package com.java;



import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

 public static void main(String[] args) {

 ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

 Employee e=(Employee)context.getBean("obj");

 System.out.println(e);

 }

}














import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i=sc.nextInt();
	    if(i==0)
		  System.out.println(i+" : Zero");
		else if(i<0)
		  System.out.println(i+" : Negative Integer");
		else
		 System.out.println(i+" : Positive Integer");
	}
}



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i=sc.nextInt();
	    if(i%2==0)
		  System.out.println(i+" : Even");
		else
		 System.out.println(i+" : Odd");
	}
}


public class First {
    public static void main(String[] args) {        
        int a = 10;
           int b = 20;
           System.out.println("a == b = " + (a == b) );
           System.out.println("a != b = " + (a != b) );
           System.out.println("a > b = " + (a > b) );
           System.out.println("a < b = " + (a < b) );
           System.out.println("b >= a = " + (b >= a) );
           System.out.println("b <= a = " + (b <= a) );        
    }
}



public class First {
    public static void main(String[] args) {        
        boolean a = true;
           boolean b = false;
           System.out.println("a && b = " + (a&&b) );
           System.out.println("a || b = " + (a||b) );
           System.out.println("!(a && b) = " + !(a && b) );
        
    }
}






3-import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i=5;
	    System.out.println(++i);
	    System.out.println(i);
	    Scanner sc=new Scanner(System.in);
	    char ch1=sc.next().charAt(0);
	    char ch2=sc.next().charAt(0);
	    if(ch1>ch2)
		  System.out.println(ch2+" "+ch1);
		else
		  System.out.println(ch1+" "+ch2);
		if(((ch1>=65 && ch1<=90)||(ch1>=97 && ch1<=122)) &&((ch2>=65 && ch2<=90)||(ch2>=97 && ch2<=122)))
		  System.out.println("Alphabet");
		else if((ch1>=48 && ch1<=57) &&(ch2>=48 && ch2<=57))
		  System.out.println("Digit ");
		else
		    System.out.println("Special Character ");
	}
}


5-import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char ch1=sc.next().charAt(0);
	    if((ch1>=65 && ch1<=90)){
	     char ch=(char)(ch1+32);
		System.out.println(ch);}
		else{
		 char ch=(char)(ch1-32);
		 System.out.println(ch);}
		 
		
	}
}




class  TestBase1
{
    TestBase1()
    {
        System.out.println("base class constructor");
    }    
    
    void m1()
    {
        System.out.println("m1.............");
    }
}
class TestDer1  extends TestBase1
{    
    TestDer1()
    {        
        System.out.println("der class Constructor");
    } 
    public static void main(String[] args) 
    {
        System.out.println("before object creation");
        TestDer1 td=new TestDer1();
        td.m1();
    }//main
}//class













*******************************************************************************************************************


    class Marks

     {

   int m1,m2,m3;

    Marks()

  {

     System.out.println("marks class constructor");

  }

   void get(int x,int y,int m3)

       {

        m1=x;

        m2=y;

       this.m3=m3;

       System.out.println("Marks class get()");

       }

       void disp()

       {

       System.out.println("marks are");

       System.out.println(m1+" "+m2+" "+m3);

       }

 }//marks class

   class Student22 extends Marks

    {

     int sno;

     String sname;

     int total;

     double avg;

  Student22()

  { //super();//optional

System.out.println("Student class Constructor");

  }

     void get(int sno,String sname)

     {

       this.sno=sno;

       this.sname=sname;

       total=m1+m2+m3;

       avg=total/3.0;

       //float avg2=total/3.0f;

      System.out.println("Student class get()");

       }

     void disp()

      {

      System.out.println("name is "+sname);

      System.out.println("number is "+sno);

     // super.disp();// invokes base class disp();

      System.out.println("total is "+total);

      System.out.println("avg is "+avg);

      }

 }//Student class

  class Result extends Student22

{

 char grade;

 String result;

 Result()

 {

  System.out.println("Result class Constructor");

 }

 void find_Grade_Result()

 {

 if(avg<35)

 {

  grade='N';

  result="fail";

 }

 else if(avg<50)

 {

  grade='C';

  result="pass";

 }

 else if(avg<60)

 {

  grade='B';

  result="pass";

 }

 else if(avg>=60 && avg<=100)

 {

  grade='A';

  result="pass";

 }

 else

 {

  System.out.println("Invalid marks ");

 }

System.out.println("grade is "+grade);

System.out.println("result is "+result);

 }//find result

}//Result class

  public class MLInhTest

 {

public static void main(String args[])

   {

 Result rs=new Result(); //has-a -relationship

 rs.get(67,89,67);

 rs.get(101,"raja");

 rs.disp();

 rs.find_Grade_Result();

    }//main

 }//MLInhTest*/










class A

{

 void m1()

 {

 System.out.println("m1............");

 }

 void x()

 {

 System.out.println("x of A class");

 }

}

class B extends A

{

  void x()

 {

 System.out.println("x of B class");

 }

 void y()

 {

 System.out.println("y of B class");

 }

}

class C extends A

{

 void x()

 {

 System.out.println("x of C class");

 }

 void z()

 {

 System.out.println("z of c class");

 }

}

public class BaseRefTest

{

 public static void main(String args[])

 {

 A a=new A();

 a.x();

 A ob=new B();

 ob.x();

 ob.m1();

 a=new C();

 a.x();

   }

}











public class FDemo

{

 final double pi;

 FDemo()

 {

 pi=3.14;

 }

 void disp()

 {

 //pi=4444.55;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo ob=new FDemo();

 ob.disp();

 }

}













final class K

{

   void disp()

 {

 System.out.println("super class");

 }

}

public class FDemo extends K

{

 final double pi;

 FDemo()

 {

 pi=3.14;

 }

 void disp()

 {

 //pi=4444.55;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo ob=new FDemo();

 ob.disp();

 }

}











final class K

{

   void disp()

 {

 System.out.println("super class");

 }

}

public class FDemo extends K

{

 final double pi;

 FDemo()

 {

 pi=3.14;

 }

 void disp()

 {

 //pi=4444.55;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo ob=new FDemo();

 ob.disp();

 }

}













final class K

{

   void disp()

 {

 System.out.println("super class");

 }

}

public class FDemo extends K

{

 final double pi;

 FDemo()

 {

 pi=3.14;

 }

 void disp()

 {

 //pi=4444.55;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo ob=new FDemo();

 ob.disp();

 }

}













final class K

{

   void disp()

 {

 System.out.println("super class");

 }

}

public class FDemo extends K

{

 final double pi;

 FDemo()

 {

 pi=3.14;

 }

 void disp()

 {

 //pi=4444.55;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo ob=new FDemo();

 ob.disp();

 }

}




final class K

{

   void disp()

 {

 System.out.println("super class");

 }

}

public class FDemo extends K

{

 final double pi;

 FDemo()

 {

 pi=3.14;

 }

 void disp()

 {

 //pi=4444.55;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo ob=new FDemo();

 ob.disp();

 }

}










1)Write a program to initialize an integer array and print the sum and average of the array.

2) Write a program to initialize an integer array and find the maximum and minimum value of the array.

3) Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given number in the array.

Example 1) If the Array elements are {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are {1,4,34,56,7} and the search element is 56, then the output expected is 3.

4) Initialize an integer array with ascii values and print the corresponding character values in a single row.

5) Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.









public class Main {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before  Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 System.out.println("Array after  Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                 System.out.println();  
                  
                    int max1=arr[arr.length-1],min2=arr[1],min1=arr[0];
     int    max2=arr[arr.length-2];
        System.out.println("Min1:"+min1+" Min2:  "+min2+"  max1:"+max1+" max2:  "+max2);  
                 
                
                }  
}
        




*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] asc={65,66,67,68,69};
	    for(int i=0;i<asc.length;i++)
	    {
		System.out.print((char)(asc[i])+"\t");}
		
	}
}

   












final class K

{

   void disp()

 {

 System.out.println("super class");

 }

}

public class FDemo extends K

{

 final double pi;

 FDemo()

 {

 pi=3.14;

 }

 void disp()

 {

 //pi=4444.55;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo ob=new FDemo();

 ob.disp();

 }

}









class  Base
{
    int a,b;
    void getData(int x,int y)
    {
        a=x;
        b=y;
    }
    void disp()
    {
        System.out.println("base class "+a+"  "+b);
    }
}
class Der extends Base
{
    int a;
    int b;
    void assignData(int x,int y)
    {
        a=x;
        b=y;
    }
    void disp()
    {
      super.disp();
    System.out.println("der class "+a+"  "+b);
    int total=super.a+super.b+a+b;
    System.out.println("total is "+total);
    }
}//class
class SuperTest
{
    public static void main(String args[])
    {
        Der d=new Der();
        d.getData(4,5);
        d.assignData(6,7);
        d.disp();
    }//main
}//class



// Example on super.member

class TestBase

{

int a,b;

  TestBase()

 {

 System.out.println("Zero-args constructor base");

 }

 TestBase(int x,int y)

 {

 a=x;

 b=y;

 System.out.println("param construcotr of base");

 }

 void disp()

 {

 System.out.println("base class "+a+" "+b);

 }

}

class TestDer extends TestBase

{

 int c;

 int d;

TestDer()

 {

 System.out.println("zero-arg con in der ");

 }

TestDer(int x,int y,int z,int dx)

 {

 super(x,y);

 c=z;

 d=dx;

 System.out.println("param con -der class");

 }

 void disp()

 {

 super.disp();

 System.out.println("der class "+c+" "+d);

 }

}//class

class SuperTest1

{

 public static void main(String args[])

 {

 TestDer d=new TestDer(1,2,3,4);

 d.disp();

 }//main

}//class



abstract class T

{

 abstract void disp();

 void m1()

 {

 System.out.println("m1 method");

 }

}

class Q extends T

{

 void disp()

 {

 System.out.println("disp method");

 }

 void m2(){

 System.out.println("m2 method");

 }

 public static void main(String[] args)

 {

 T obj=new Q();

 obj.disp();

 obj.m1();

 Q ob=new Q();

 ob.disp();

 ob.m1();

 ob.m2();

 }

}



interface First

{

 void red();

 void blue();

}

interface Second

{

 void pink();

}

interface Third extends First,Second

{

 public static final int i=9;

 public abstract void yellow();

}

public class TestInterface implements Third

 {

  public void red()

 {

 System.out.println("this is red()");

 }

 public void blue()

 {

 System.out.println("this is blue()");

 }

 public void pink()

 {

 System.out.println("this is pink ");

 }

 public void yellow()

 {

 System.out.println("yellow method");

 }

 void xyz()

 {

 System.out.println("this is xyz()");

 }

 public static void main(String[] args)

 {

 TestInterface t=new TestInterface();

 t.red();

 t.blue();

 t.pink();

 t.yellow();

 t.xyz();

 First f;

 f=new TestInterface();

 f.red();

 f.blue();

 //	f.xyz(); error

 //f.pink();

 Second s=t;

 s.pink();

 //s.red(); error

 // s.xyz() ; error

 Third th=new TestInterface();

 th.red();

 th.pink();

 th.yellow();

//	th.xyz();

 }

 }















Use the same class names and member variable names.

Follow the naming conventions mentioned for getters / setters / properties

Create 4 separate classes in 4 separate files.

In C#, dont create the classes within namespaces]

Create a class named Student.Include the following protected member variables.

Java	C#

Data type	Member Variable Name	Data type	Member Variable Name

String	name	string	_name

String	id	string	_id

Int	age	int	_age

Double	grade	double	_grade

String	address	string	_address

Include appropriate getters and setters (in Java) or properties(in C#).

Naming Convention:

Java :

Getters : getName, getAge ...

Setters : setName, setAge ...

C#:

Properties:

Name, Age ...

Include a default constructor and a 5-argument constructor. The order of arguments in the 5-argument constructor is name, id, age, grade and address.

Include the following public methods in the Student class.

Method Prototype

Method Description

Java	C#

void display()	void Display()	Display the details of the student in the format as specified in the output.

boolean isPassed()	bool IsPassed()	A student is said to have passed if his/her grade is above 50. This method returns true if the student has passed.

Create a subclass of Student named UGStudent .

Include the following private member variables.

Java	C#

Data type	Member Variable Name	Data type	Member Variable Name

String	degree	string	_degree

String	stream	string	_stream

Include appropriate getters / setters (in Java) or properties (in C#).

Include a default constructor and a 7-argument constructor. The order of arguments in the 7-argument constructor is name, id, age, grade, address, degree and stream.

Include the following public methods in the UGStudent class.

Method Prototype

Method Description

Java	C#

void display()	void Display()	Display the details of the ug student in the format as specified in the output.

boolean isPassed()	bool IsPassed()	A ug student is said to have passed if his/her grade is above 70. This method returns true if the student has passed.

Create another subclass of Student named PGStudent .

Include the following private member variables.

Java	C#

Data type	Member Variable Name	Data type	Member Variable Name

String	specialization	string	_specialization

int	noOfPapersPublished	int	_noOfPapersPublished

Include appropriate getters / setters (in Java) or properties (in C#).

Include a default constructor and a 7-argument constructor. The order of arguments in the 7-argument constructor is name, id, age, grade, address, specialization and number of papers published.

Include the following public methods in the PGStudent class.

Method Prototype

Method Description

Java	C#

void display()	void Display()	Display the details of the pg student in the format as specified in the output.

boolean isPassed()	bool IsPassed()	A pg student is said to have passed if his/her grade is above 70 and if he/she has published atleast 2 papers.This method returns true if the student has passed.

Create a class called Main (in Java) or Program (in C#) to test the above classes.

Input and Output Format:

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

Print Grade values with one decimal places

Sample Input and Output 1:

Menu

1) Create a Student

2) Create a UG Student

3) Create a PG Student

Enter your choice

1

Enter name

Ananthi

Enter id

88989

Enter age

21

Enter grade

70

Enter address

Coimbatore

Student Details

Name : Ananthi

Id : 88989

Age : 21

Grade : 70.0

Address : Coimbatore

Result : Pass

Sample Input and Output 2:

Menu

1) Create a Student

2) Create a UG Student

3) Create a PG Student

Enter your choice

3

Enter name

Madhu

Enter id

3556

Enter age

23

Enter grade

75

Enter address

cbe

Enter specialization

Web development

Enter number of papers published

5

PG Student Details

Name : Madhu

Id : 3556

Age : 23

Grade : 75.0

Address : cbe

Specialization : Web development

No. of papers published : 5

Result : Pass

Sample Input and Output 3:

Menu

1) Create a Student

2) Create a UG Student

3) Create a PG Student

Enter your choice

2

Enter name

Praveen

Enter id

22435

Enter age

22

Enter grade

71

Enter address

Tirupur

Enter degree

BE

Enter stream

ECE

UG Student Details

Name : Praveen

Id : 22435

Age : 22

Grade : 71.0

Address : Tirupur

Degree : BE

Stream : ECE

Result : Pass





*******************************************************************************/
class Box{
    float h,w,d;
    Box(float w,float h,float d){
        this.w=w;
        this.h=h;
        this.d=d;
        
    }
    public float vo()
    {
        return w*h*d;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Box ab=new Box(2.0f,1.0f,1.0f);
	    
		System.out.println("Volume of box = "+ab.vo());
	}
}

*******************************************************************************/

public class Main
{
  static int powInt (int x, int y)
  {
    int a=(int)Math.pow(x,y);
    return a;
  }
  static double powDou(double x,double y)
     {
         return Math.pow(x,y);
     }

  public static void main (String[]args)
  {
    System.out.println ("Power Int "+Main.powInt(2,4));
    System.out.println ("Power double "+Main.powDou(2.5,4.0));
  }
}






















































