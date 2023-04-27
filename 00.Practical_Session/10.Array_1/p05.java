//write a program, take 10 input from user and print elements divisibe by 5
//input: 10 2 02 2 1 25 35 3 8 5
//output: 10 25 35 5

import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		//System.out.print("enter size of array: ");

		//int size= sc.nextInt();

		int[] arr= new int[10];

		System.out.println("enter elements in array: ");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.print("elements divisible by 5: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}

