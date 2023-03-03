//demo of method overloading 

class Pass
{
     public int add(int x,int y)    //having two argument and return type int
     {
        int z=x+y;
        return z;
     }

    public int add(int x,int y,int z)   //having 3 arguments and return type int
    {

      int c=x+y+z;
      return c;
    }
    public double add(double x,double y,double z)  //having 3 arguments and return type double
    {
      double c=x+y+z;
      return c;
    }
}

class MethodOverloading1
{
  public static void main(String args[])
  {
      Pass p1=new Pass();      //object created of class Pass
      int a1=p1.add(4,5);    //p1 will call add(int x, int y) method and result will be stored in a1
      System.out.println(a1);
       
      int a2=p1.add(4,5,6);  //add(int x,int y,int z) will be called and result will be stored in a2
      System.out.println(a2);

      double a3=p1.add(4.5,6.7,8.9);    //add(double x,double y,double z) will be called and result will be stored in a3
      System.out.println(a3);

  }
}
