import java.util.Scanner;

class twodim
{
       Scanner sc=new Scanner(System.in);
       int a[][]=new int[3][3];    //declaring and initializing 2d array
         void getdata()           //getdata method for input
         {
            int i,j;
            for(i=0;i<3;i++)
            for(j=0;j<3;j++)            //two loops one for row and other for column
            {
                System.out.println("Enter no");
                a[i][j]=sc.nextInt();               //taking input
            }
            
         }

         void putdata()                 //putdata method for output
         {
            int i,j;
            for(i=0;i<3;i++)        
            {
                for(j=0;j<3;j++)                //two loops first it will check i condition then enter into j loop and then j condition
                {
                    System.out.print(a[i][j]+ "    ");     // Matrix will be display, space is kept because for displaying matrix 
        
                }
                System.out.println();             //Control will go to newline after Displaying each row
            }
            
         }
}

class ArrayMatrix
{
public static void main(String [] args)
{

    twodim A1=new twodim();     //declaring object and initiliazing it in main class
    A1.getdata();
    A1.putdata();                       // Calling of method ussing object of main class
}

}