//demo of constructor

import java.util.Scanner;

class Add
{
      int a,b,sum;
      Scanner sc=new Scanner(System.in);
      Add()              //default constructor
      {
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();

      }  
      Add(int x,int y)           //parameterized constructor
      {
           a=x;
           b=y;
      }
     void output()
     {
          System.out.println("Addition of " +a+ " and " +b+ " is " +(a+b));
     }
}

class Constructor
{
   public static void main(String args[])
   {  
       Add a1=new Add();              //default constructor will be called
       Add a2=new Add(10,20);        //parameterized constructor will be called
       a1.output();
       a2.output();
       
   }
}
