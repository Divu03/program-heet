import java.util.Arrays;
    
    class ArrayClass
{


	public static void main(String[] args)
	{
int Arr[] = { 10, 20, 11, 21, 31 };

Arrays.sort(Arr);

int Key = 31;

System.out.println(Key + " found at index = "	+ Arrays.binarySearch(Arr, Key));
	}
}
