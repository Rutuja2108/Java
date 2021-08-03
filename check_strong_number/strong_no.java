// accept no from user and check whether the number is strong number or not
// strong number is such a number whose summation of factorial of its digit is same as the number itself

import java.util.*;

class strong_no
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");

		int value = sobj.nextInt();

		boolean bret = false;

		Number nobj = new Number();

		bret = nobj.check_strong(value);

		if(bret == true)
		{
			System.out.println("The given number is a strong number");
		}
		else 
		if(bret == false)
		{
			System.out.println("The given number is not a strong number");
		}
	}
}

class Number
{
	public boolean check_strong(int no)
	{
		if(no<0)
		{
			no = -no;
		}
		if(no==0)
		{
			return false;
		}

		int sum = 0,digit = 0,value = no,fact = 1,i = 0;

		while(no!=0)
		{
			digit = no%10;
			fact = 1;

			for(i=digit;i>0;i--)
			{
				fact = fact*i;
			}

			sum = sum + fact;
			
			if(sum>value)
			{
				break;
			}
			
			no = no/10;
		}

		if((no==0)&&(sum==value))
		{
			return true;
		}
		else
		{
			return false;		
		}
	}
}




















