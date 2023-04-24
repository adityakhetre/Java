//Write a program to print count of digits in elements of array.
//Input: Enter array elements : 02 255 2 1554
//Output: 2 3 1 4

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter size of array:");

		int size= Integer.parseInt(br.readLine());

		int[] arr= new int[size];

		System.out.println("enter integer elements in array");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]= Integer.parseInt(br.readLine());
		}
		
		System.out.print("count of digits: ");

		for(int i=0;i<arr.length;i++)
		{
			int count=0;

			while(arr[i]!=0)
			{
				count++;

				arr[i]=arr[i]/10;
			}

			System.out.print(count+" ");
		}
		System.out.println();
	}
}


