//Write a program to print the second max element in the array
//Input: Enter array elements: 2 255 2 1554 15 65
//Output: 255

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

		int x=arr[0],y=-999999999;
                for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>x)
			{
				x= arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
                {
                        if(arr[i]>y)
                        {
				if(arr[i]!=x)
				{
					y= arr[i];
				}
                        }
                }
		System.out.println("second max element in array: "+y);
	}
}


