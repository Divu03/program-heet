
		class Cmd
	{
		
		public static void main(String args[])
	{
		System.out.print("Enter the operation");
		System.out.print("enter a,b");

		int a,b,c;
		 
		
		a= Integer.parseInt(args[0]);
		 String op=args[1];
		b=Integer.parseInt(args[2]);
		
		switch(op)
	{
	
		case "+":
	
		c=a+b;
		System.out.println("Adiition is"+c);
	
		case "-":
	
		c=a-b;
		System.out.println("Subtraction is"+c);
	
		case "*":
	
		c=a*b;
		System.out.println("Multiplication is"+c);
	
		case "/":
	
		c=a/b;
		System.out.println("Division is"+c);
}
	}
	}