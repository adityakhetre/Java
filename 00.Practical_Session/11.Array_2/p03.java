//Write a Java program to find the sum of even and odd numbers in an array and print.
//Input: 11 12 13 14 15
//Output
//Odd numbers sum = 39
//Even numbers sum = 26

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter size of array: ");

		int size= Integer.parseInt(br.readLine());

		int[] arr= new int[size];

		int esum=0,osum=0;

		System.out.println("enter integer elements in array:");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]= Integer.parseInt(br.readLine());

			if(arr[i]%2==0)
			{
				esum= esum+arr[i];
			}
			else
			{
				osum= osum+arr[i];
			}
		}
		System.out.println("even integer sum: "+esum);
		System.out.println("odd integer sum: "+osum);
	}
}

