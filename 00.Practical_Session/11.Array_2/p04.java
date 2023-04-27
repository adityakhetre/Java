//WAP to search a specific element from an array and return its index.
//Input: 1 2 4 5 6
//Enter element to search: 4
//Output: element found at index: 2

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter size of elements");

		int size= Integer.parseInt(br.readLine());

		int[] arr= new int[size];

		System.out.println("enter integer elements in array: ");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]= Integer.parseInt(br.readLine());
		}
		System.out.print("enter element to search: ");

		int num= Integer.parseInt(br.readLine());

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("element found at index: "+i);
			}
		}
	}
}


