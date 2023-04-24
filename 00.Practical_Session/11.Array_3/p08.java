//WAP to find an ArmStong number from an array and return its index.
//Take size and elements from the user
//Input: 10 25 252 36 153 55 89
//Output: Armstrong no 153 found at index: 4

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter size of array: ");

		int size= Integer.parseInt(br.readLine());

		int[] arr= new int[size];

		System.out.println("enter integer elements in array: ");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]= Integer.parseInt(br.readLine());
		}

		for(int i=0;i<arr.length;i++)
		{
			int sum=0,count=0;

			for(int j=arr[i];j!=0;j=j/10)
			{
				count++;
			}
			for(int j=arr[i];j!=0;j=j/10)
			{
				int ex=1;
				int digit=j%10;

				for(int k=1;k<=count;k++)
				{
					ex=ex*digit;
				}
				sum=sum+ex;
			}
			if(sum==arr[i])
			{
				System.out.println("Armstrong no. "+arr[i]+" found at index: "+i);
			}
		}
	}
}


