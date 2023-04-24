//WAP to find a Strong number from an array and return its index.
//Take size and elements from the user
//Input: 10 25 252 36 564 145
//Output: Strong no 145 found at index: 5

import java.io.*;

class Demo{

        public static void main(String[] args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.print("enter size of array: ");

                int size= Integer.parseInt(br.readLine());

                int[] arr= new int[size];

                System.out.println("enter integer elements in array");

                for(int i=0;i<arr.length;i++)
                {
                        arr[i]= Integer.parseInt(br.readLine());
                }

		for(int i=0;i<arr.length;i++)
		{
			int sum=0;

			for(int j=arr[i];j!=0;j=j/10)
			{
				int digit=j%10;

				int mult=1;

				for(int k=1;k<=digit;k++)
				{
					mult=mult*k;
				}
				sum=sum+mult;
			}
			if(sum==arr[i])
			{
			System.out.println("Strong no. " +arr[i]+ " found at index: "+i);
			}
		}
	}
}



