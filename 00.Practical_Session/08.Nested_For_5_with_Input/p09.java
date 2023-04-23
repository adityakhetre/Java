//write a program take input as no. & print addition of factorials of its each digits
//input:1234
//output:addition of factorials of each digit=33

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the integer element");

		int x= Integer.parseInt(br.readLine());

		int sum=0;

		for(int i=x;i!=0;i=i/10)
		{
			int y=i%10;
			int mult=1;

			for(int j=1;j<=y;j++)
			{
				mult=mult*j;
			}
			sum=sum+mult;
		}
		System.out.println("addition of factorials of each digit= "+sum);
	}
}
