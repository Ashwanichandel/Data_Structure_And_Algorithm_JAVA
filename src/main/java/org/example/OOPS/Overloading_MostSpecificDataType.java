package org.example.OOPS;

class Test {
    public void accept(double d) {
        System.out.println("double");
    }

    public void accept(float d) {
        System.out.println("float");
        /* here priority will go to the
        float> double
        float > long
        long > int
        int > char
        int > short
        short > byte*/
    }
}
class Base
{
    public static void m1()
    {
        System.out.println("Static method of super class..");
    }
}
class Derived extends Base
{
    /*public static int m1()  //sub class method can't hide super
    {                        //class method

		System.out.println("Static method of sub class..");
        return 0 ;
    }*/
}


public class Overloading_MostSpecificDataType {
    public static void main(String[] args) {
        Base b = new Derived();
        b.m1();
    }
}

