// use of abstract class

abstract class Animal
{
    abstract void show();                 //if we make method as abstract then we have to make class as abstract
    
}

class Dog extends Animal
{
    void show()                                       //method which we make abstract should be compulsory use in the class which extends abstract class
    {
        System.out.println("Dog barks");
    }
}

class Abstractclass
{
    public static void main(String args[])
    {
        Dog d1=new Dog();                     //object odf dog
        d1.show();
    }
}