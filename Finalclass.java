 // demo of final class

  final class Animal
 {
    void fun()
    {
        System.out.println("Hello");
    }
 }
  class Dog extends Animal      //this will give error during compile time 
  {
     void display()      
     {
      System.out.println("Javascript");
     }
  
  }

  class Finalclass
  {
   public static void main(String argd[])
   {
      Dog d1=new Dog();
      d1.display();
      d1.fun();      //we cannot inherit 
   }
}