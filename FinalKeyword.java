//final keyword

class FinalKeyword
{
     final int a=20;
     void run()
     {
        a=5;                      //this will give compile time error as we cannot change the value of final variable
     }
    

public static void main(String ghgh[])
{
    FinalKeyword f1=new FinalKeyword();
    f1.run();
}
}




