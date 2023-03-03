// demo of inner class

class A
{
    void show()
    {
        System.out.println("In A show");
    }
    static class B
    {
         void display()
         {
            System.out.println("In B show");
         }
    }
}

class Innerclass
{
    public static void main(String args[])
    {
        A obj=new A();
        obj.show();

        A.B obj1=new A.B();
        obj1.display();
    }
}