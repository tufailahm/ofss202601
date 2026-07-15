package com.training.ofss.model;
class W {
    public W() {
        System.out.println("4. W constructor");
    }
    static {
        System.out.println("3. W static block");
    }
}
public class Z {
    W w = new W();
    {
        System.out.println("5. instance block");
    }
    static {
        System.out.println("1. Z static block");
    }
    public Z() {
        System.out.println("6. Z constructor");
    }
    public static void main(String args[]) {
        System.out.println("2. In main");
        new Z();
        new Z();
    }
}
