//accept number from user and display that number of elements of fibonacci series
// eg: input = 9 , output = 0 1 1 2 3 5 8 13 21

import java.util.*;

class fibonacci_series
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number of elements you need of fibonacci series : ");

		int value = sobj.nextInt();

		Numbers nobj = new Numbers();

		nobj.Fibonacci(value);
	}
}

class Numbers
{
	public void Fibonacci(int count)
	{
		int first = 0;
		int second = 1, third = 0;

		System.out.println("The Fibonacci Series is : ");

		for(int i = 1; i<=count ; i++)
		{
			
			System.out.println(third);
			first = second;		
			second = third;
			third = first + second;
			
		}		
	}
}




		







		