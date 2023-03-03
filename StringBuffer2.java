//demo of string buffer class 

import java.util.Scanner;
class StringBuffer2
{
    public static void main(String args[])
{
    StringBuffer str=new StringBuffer();  //Stringbuffer syntax
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the string");
    str.append(sc.nextLine());                      //append function will store the entered string in variable(Here str);
    str.setCharAt(2,'g');                            //setCharAt will insert a character at index declared in function
    System.out.println(str);

    str.insert(3,"Hello");                   //insert fun will insert the string at stored  index
    System.out.println(str);
    
    str.setLength(5);                              //it will set length =5(here it is 5) and prints the string in adjustable length entered in fun
    System.out.println(str);

    System.out.println("All functions executed");

}


}   
