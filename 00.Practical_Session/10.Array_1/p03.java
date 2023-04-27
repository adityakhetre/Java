//wap to take a size of array and elements in array from user print product of odd index only
//input: enter size: 5
//       enter array elements: 1 2 3 4 5
//output:8

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter size of array: ");

		int size= Integer.parseInt(br.readLine());

		int[] arr= new int[size];

		System.out.println("enter elements in array: ");

		int mult= 1;

		for(int i=0;i<arr.length;i++)
		{
			arr[i]= Integer.parseInt(br.readLine());

			if(i%2==1)
			{
				mult= mult*arr[i];
			}
		}

		System.out.println("product of odd index in array: "+mult);
	}
}



