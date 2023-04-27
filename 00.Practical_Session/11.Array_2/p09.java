//Write a Java program to merge two given arrays.
//Array1 = [10, 20, 30, 40, 50]
//Array2 = [9, 18, 27, 36, 45]
//Output :Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
//Hint: you can take 3rd array

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter array1 size: ");

		int size1= Integer.parseInt(br.readLine());

		int[] arr1= new int[size1];

		System.out.println("enter integer elements in array1:");

		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]= Integer.parseInt(br.readLine());
		}

		System.out.print("enter array2 size: ");

                int size2= Integer.parseInt(br.readLine());

                int[] arr2= new int[size2];

                System.out.println("enter integer elements in array2:");

                for(int i=0;i<arr2.length;i++)
                {
                        arr2[i]= Integer.parseInt(br.readLine());
                }

		int size3= size1+size2;

		int[] arr3= new int[size3];

		System.out.println("merged array: ");

		for(int i=0;i<arr3.length;i++)
		{
			if(i<arr1.length)
			{
				arr3[i]=arr1[i];
			}
			else
			{
				arr3[i]=arr2[i-arr1.length];
			}
			
			System.out.println(arr3[i]);
		}
	}
}
		

