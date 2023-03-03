//demo of single level inheritance

class Animal
{
   public void eating()
   {
    System.out.println("Eating");
   }
   
}
class Dog extends Animal                  //Dog class inherits properties of Animal class
{
    public void barking()
    {
        System.out.println("Barking");
    }
}

class SingleInheritance
{
    public static void main(String args[])
    {
        Dog d1=new Dog();
        d1.eating();
        d1.barking();
    }
}