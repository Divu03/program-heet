// final method 

class Practical
{   
    
    final void display()      //final method 
{
      System.out.println("Hello and welcome to javascript");
}
}

class Pract extends Practical
{
    void display1()
    {   
        System.out.println("Bye ");

    }
}

class Final
{
      public static void main(String args[])
      {
        Pract p1=new Pract();
        p1.display();     //calling the method named to be final
        p1.display1(); 
         }
}