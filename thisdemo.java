
//Java code for using 'this' keyword to
//refer current class instance variables
class Test
{
    int a;
    int b;
     
  
    Test(int a, int b)                // Parameterized constructor
    {
        this.a = a;                               //using this we can reference a with itself
        this.b = b;
    }
 
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);   //Displaying value of variables a and b
    }
}

class thisdemo
{
    public static void main(String[] args)
    {
        Test object = new Test(10, 20);
        object.display();
    }
}
