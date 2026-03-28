package org.example.OOPS;

import static java.lang.System.out;

class Base
{
    public static void m1()
    {
        System.out.println("Static method of super class..");
    }
}
class Derived extends Base
{
    public static void m1()  //sub class method can't hide super
    {                        //class method

		System.out.println("Static method of sub class..");
        //return 0 ;
    }
}
public class StaticDemo1
{
    public static void main(String[] args)
    {
        Base b = new Derived();
        b.m1();
    }
}

