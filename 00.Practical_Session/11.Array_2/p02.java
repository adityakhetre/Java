//WAP to find the number of even and odd integers in a given array of integers
//Input: 1 2 5 4 6 7 8
//Output:
//Number of Even Elements: 4
//Number of Odd Elements : 3

import java.io.*;

class Demo{

        public static void main(String[] args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter size of array: ");

		int size= Integer.parseInt(br.readLine());

		int[] arr= new int[size];

		int ecount=0,ocount=0;

		System.out.println("enter integer elements in array");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]= Integer.parseInt(br.readLine());

			if(arr[i]%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		System.out.println("number of even elements: "+ecount);
										
		System.out.println("number of odd elements: "+ocount);
										

	}
}




