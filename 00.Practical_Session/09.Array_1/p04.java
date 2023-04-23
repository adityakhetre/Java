//write a program to print only vowels in array
//input:a b c d e
//output: a e

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter size of array: ");

		int size= Integer.parseInt(br.readLine());

		System.out.println("enter elements in array: ");

		char[] arr= new char[size];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]= br.readLine().charAt(0);
		}

		System.out.print("vowels: ");


		for(int i=0;i<arr.length;i++)
		{


			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}




