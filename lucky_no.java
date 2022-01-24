//accept no. from user and check whether no is lucky no or not
//lucky number is such a no which contains every unique digit in it 
import java.util.*;

class Number
{
	public boolean check_lucky(int no)
	{
		if(no<0)
		{
			no = -no;
		}
		
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		int digit = 0;
		
		while(no!=0)
		{
			digit = no%10;
			arr[digit]++;

			if(arr[digit]>1)
			{
				break;
			}
			no=no/10;
		}
	
		if(no==0)
		{
			return true;	
		}
		else
		{
			return false;
		}
	}
}

class lucky_no
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int no = sobj.nextInt();

		Number nobj = new Number();

		boolean bret = false;
		bret = nobj.check_lucky(no);
		
		if(bret == true)
		{
			System.out.println("the given number " + no + " is a Lucky number");
		}
		else if(bret == false)
		{
			System.out.println("the given number " + no + " is not a Lucky number");
		}
	}
}