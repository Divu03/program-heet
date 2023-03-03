import java.util.Scanner;
class Perfect
{
    Scanner sc=new Scanner(System.in);
    String name;
    int age;

void getdata()
{   
  System.out.println("Enter your name and age");
name=sc.next();
age=sc.nextInt();

}
void putdata()
{
 System.out.println("name:" +name+ " age: " +age);
}
}

class Proper extends Perfect
{
        Scanner sc=new Scanner(System.in);
    int Enrol_no;
    String city;

    void getdata()
    {
    super.getdata();
    System.out.println(" Enter your enrolment no and city");
    Enrol_no=sc.nextInt();
    city=sc.next();
    }
    void putdata()
    {

        super.putdata();
        System.out.println("Enrol_no: "+Enrol_no+ " City: "+city);
    }
}

class Classic
{
public static void main(String args[])
{
     Proper p1=new Proper();
     p1.getdata();
     p1.putdata();
}

}