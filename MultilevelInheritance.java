//demo of multilevelInheritance

class Animal
{
    void eat()
    {
        System.out.println("Eating");
    }
}

class Dog extends Animal                    // Class dog extends Animal class
{
    void bark()
    {
        System.out.println("Barking");
    }
}

class Puppy extends Dog                      //Puppy class extends dog class
{
    void Cute()
    {
        System.out.println("Puppies are cute");
    }

}

class MultilevelInheritance
{
    public static void main(String args[])
    {
        Puppy p1=new Puppy();
        p1.eat();
        p1.bark();
        p1.Cute();
    }
}