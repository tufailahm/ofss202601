package com.training;

import hr.*;
import finance.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Good morning from main class" );
        Hello hello = new Hello();
        hello.greet();
        finance.Payslip p = new finance.Payslip();
        p.checkPay();
        finance.Employee e = new finance.Employee();
        e.disburse();
        java.util.Date d = new java.util.Date();
        System.out.println(d);
    }
}
