//accept string from user and reverse the content of that string without using any inbuilt function

import java.util.*;

class Reverse
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sobj.nextLine();

		Line lobj = new Line();
		String rev = lobj.Rev(str);

		System.out.println("String succesfully reversed as " + rev);
	}
}

class Line 
{
	public String Rev(String input)
	{	
		char arr[] = input.toCharArray();
		int start = 0, end = arr.length-1;
		char temp;

		//for(start = 0,end = arr.length-1 ;start < end; start++,end--)
		//{
		//	temp = arr[start];
		//	arr[start] = arr[end];
		//	arr[end] = temp;
		//}
			
		while(start<end)
		{		
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		String rev = String.valueOf(arr);
		
		return rev;
	}
}
				










		