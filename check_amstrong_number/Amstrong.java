//accept number from user and check whether that number is amstrong or not
//amstrong number is a no whose summation of digits with the power is same as the no where power is no of digits in the number
//eg: if input is 153 then : 1^3 + 5^3 + 3^3 = 153

import java.util.*;

class Amstrong
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int value = sobj.nextInt();

		Number nobj = new Number();

		boolean bret = false;

		bret = nobj.check_amstrong(value);

		if(bret == true)
		{
			System.out.println("The given number is an Amstrong");
		}
		else if(bret == false)
		{
			System.out.println("The given number is not an Amstrong number");
		}
	}

}

class Number
{
	public boolean check_amstrong(int no)
	{
		int digit = 0,i = 0,value = no;
		int count = 0,mult = 1, sum = 0;
		
		if(no<0)
		{
			no = -no;
		}
		if(no==0)
		{
			return false;
		}

		while(no!=0)
		{
			no = no/10;
			count ++;
		}

		no = value;

		while(no!=0)
		{
			digit = no%10;
			
			for(i = 1;i<=count; i++)
			{
				mult = mult*digit;
			}
			sum = sum + mult;
			mult = 1;

			if(sum>value)
			{
				break;
			}

			no = no/10;
		}
		
		if((sum == value)&&(no == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}




























