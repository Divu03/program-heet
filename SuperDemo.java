class Animal
{ 
    Animal()
    {
        System.out.println("animal is created");
    } 
    } 
    class Dog extends Animal
    { 
    Dog()
    { 
    super();                                 // here super class the parent class constructor
    System.out.println("dog is created"); 
    } 
    } 
    class SuperDemo
    { 
    public static void main(String args[])
   
    { 
    Dog d=new Dog(); 
    }
    
} 