import java.util.Arrays;
class Array
{
int data[];

Array()
{
data=new int[10];
}
Array(int size)
{
data=new int[size];
}

Array(int data[])
{
this.data=data;
}

void reverse()
{
int temp;
System.out.println("Reversed array is: ");
for(int i=0; i<data.length/2; i++)
{
temp=data[i];
data[i]=data[data.length-i-1];
data[data.length-i-1]=temp;
}
}
int maximum()
{
int max=data[0];
for(int i=1; i<data.length; i++)
{
if(data[i]>max)
{
max=data[i];
}
}
return max;
}
int average()
{
  int sum=0;
for(int i=0; i<data.length;i++)
{
sum=data[i]+sum;
}
int avg=sum/data.length;
return avg;
}

int size()
{
return data.length;
}

int search(int no)
{
for(int i=0; i<data.length; i++)
{
if(data[i]==no)
{
return i;
}
}
return -1;
}

void display()
{
for(int i=0; i<data.length; i++)
{
System.out.print(data[i]+" ");
    }
System.out.println();
  }
void sorting()
{
Arrays.sort(data);
}
}
class ArrayOperations
{
public static void main(String[] args)
{
int array1[]={1,2,3,4,5};
Array a1=new Array(array1);
a1.display();
a1.reverse();
System.out.println("Maximum number is: "+a1.maximum());
System.out.println("Average is: "+a1.average());
System.out.println("Size of array is: "+a1.size());
}
}