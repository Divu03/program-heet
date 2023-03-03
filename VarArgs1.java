class VarArgs1
{  
    static void display(String... values)     //syntax of varargs
    {  
     System.out.println("display method invoked ");  
    }  
     
    public static void main(String args[])
    {  
     
    display();//zero argument   
    display("my","name","is","varargs");//four arguments  
    }   
   }  