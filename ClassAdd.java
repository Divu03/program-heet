//Demo of class and object
import java.util.Scanner;
class demo
{
    int a,b;
    void getdata()
    {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }

void putdata()
{
    System.out.println("Addition of " +a+ " and " +b+ " is " +(a+b));
} 
}

class  ClassAdd
{
   public static void main(String args[])
   {
      demo d1=new demo();
      d1.getdata();
      d1.putdata();


   }

}