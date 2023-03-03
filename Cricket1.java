import java.util.Scanner;

class Cricket
{
    Scanner sc=new Scanner(System.in);
    String name;
    int age;                                        //Declaration of name and age
   
    void setdata()
   {
    System.out.println("enter your name and age");  //setdata method for asking name and age
    name=sc.next();
    age=sc.nextInt();
   }
    void display()                                    // Display method for displaying name and age
   {
    System.out.println(" name: "+name+ " age: "+age);
   }
}
class Match extends Cricket                          //Match class Inheriting Criclet class
{
   int no_of_odi;
   int no_of_test;
   
   void setdata()                          //setdata method for asking odi and tests
   {  
      super.setdata();                           //Super keyword firstly calls previous class method i.e setdata and putdata
      System.out.println("enter the number of odi and tests ");
      no_of_odi=sc.nextInt();
      no_of_test=sc.nextInt();
   }
   void display()                  //display method for displaying odi and tests
   {
      super.display();
      System.out.println(" no_of_odi: "+no_of_odi+ " no_of_tests: "+no_of_test);
   }
}

class Cricket1
{                                                  //main class
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
     Match M[];                                    //Declaration of array
     M=new Match[5];                               //Allocation of memory in array i.e 5 as given in question
     for(int i=0;i<5;i++)                      
     {
        M[i]=new Match();                      //M[i] will take input in sequene exp i=0 then i=1..//
         M[i].setdata();                   //Calling of setdata method from Match class for 5 member
     }
     for(int i=0;i<5;i++)
     {  
        M[i].display();                                    //Calling display method for 5 member
     }
}

}