package com.training;
class Oracle
{
	 int i=10;
}
class OFSS
{
	public void d() {
			Oracle o = new Oracle();
			System.out.println(o.i);
	}
}
class OCI extends Oracle
{
	public void d() {
		Oracle o = new Oracle();
		System.out.println(o.i);
		System.out.println(i);
	}
}
public class Hello {
	
	int marks=95;
	float grade=99.9f;
	boolean married=true;
	char vowel = 'P';
	byte b1 = 12;
	short s1 = 1200;
	double d1 = 789.98;
	long l1 = 918181;
	public void greet() {
		
		byte b1 = 2;
		byte b2 = 2;
		byte result = (byte) (b1 + b2);
		System.out.println(Byte.SIZE);
	
		System.out.println("Good morning from Hello class");
		System.out.println("Hi Oracle");
	}
}
