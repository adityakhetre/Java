//wap to take a size of array and elements in array from user print sum of odd element only
//input: enter size: 5
//       enter array elements: 1 2 3 4 5
//output:9

import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter size of array: ");

		int size= Integer.parseInt(br.readLine());

		int[] arr= new int[size];

		System.out.println("enter array elements: ");

		int sum=0;

		for(int i=0;i<arr.length;i++)
		{
			arr[i]= Integer.parseInt(br.readLine());

			if(arr[i]%2==1)
			{
				sum= sum+arr[i];
			}
		}

		System.out.println("sum of odd elements in array: "+sum);
	}
}




