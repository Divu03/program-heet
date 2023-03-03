// program to demonstrate the use of dynamic dispatch

class A
{
    void show()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    void show()                          //show method overridden
    {
        System.out.println("In B show");
    }
}

class C extends A
{
    void show()                                   //show method overridden
    {
        System.out.println("In C show");
    }
}


class Dynamicdispatch
{
    public static void main(String args[])
    {
        A obj=new B();           //we can create refrence of A class and object of B class(Here A class is parent class and B is subclass)
        obj.show();

        obj=new A();
        obj.show();                   // Above concept of is called dynamic method dispatch
    }
}