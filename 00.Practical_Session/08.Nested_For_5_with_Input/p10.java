//write a program to print prime number take input as start no. and end no.

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter start no.");

		int start= Integer.parseInt(br.readLine());

		System.out.println("enter end no.");

		int end= Integer.parseInt(br.readLine());

		System.out.print("series= ");

		for(int i=start; i<=end; i++)
		{
			int count=0;

			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				if(count==2)
				{
					break;
				}
			}
			if(count==1)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}
}
