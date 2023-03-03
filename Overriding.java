
// demo of overiding

class Sample
{
    void show()
    {
        System.out.println("In sample class");
    }
}

class Final extends Sample
{
    void show()
    {
        super.show();
        System.out.println("In Final class");
        
    }
    
}

class Overriding
{
    public static void main(String args[])
    {
       Final f1=new Final();
       f1.show();
    }
}