//Java Program to demonstrate the use of a static method.  
class Student
{  
    int rollno;  
    String name;  
    static String college = "ITS";  

    static void change()         //static method to change the value of static variable  
                                                   
    {  
    college = "BBDIT";            //now ITS is change to BBDIT
    }  
                                  
    Student(int r, String n)           //constructor to initialize the variable  
    {  
    rollno = r;  
    name = n;  
    }  
                        
    void display()                  //method to display values  
    {
        System.out.println(rollno+" "+name+" "+college);
    }  
}  
                                    
public class StaticMethod     //Test class to create and display the values of object  
{  
   public static void main(String args[])
   {  
   Student.change();        //calling change method  
                           
   Student s1 = new Student(111,"Karan");  
   Student s2 = new Student(222,"Aryan");     //creating objects  
   Student s3 = new Student(333,"Sonoo");  
                                                      
   s1.display();        //calling display method  
   s2.display();  
   s3.display();  
   }  
}