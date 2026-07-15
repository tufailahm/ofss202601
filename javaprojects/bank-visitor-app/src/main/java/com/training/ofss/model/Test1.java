package com.training.ofss.model;
class A {
    static {
        System.out.println("4. A Static");
    }

    {
        System.out.println("5. A Instance");
    }

    A() {
        System.out.println("6. A Constructor");
    }
}
public class Test1 {
    static {
        System.out.println("1.   Test1 Static");                   
    }
  
    A a = new A();
    {
        System.out.println("3. Test1 Instance");
    }

    Test1() {
        System.out.println("7. Test1 Constructor");
    }
    public static void main(String args[]) {
        System.out.println("2.   Main");              
        Test1 test = new Test1();
    }
}