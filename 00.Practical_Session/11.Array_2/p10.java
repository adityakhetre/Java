//WAP to print the elements whose addition of digits is even.
//Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
//Input :
//Enter array : 1 2 3 5 15 16 14 28 17 29 123
//Output: 2 15 28 17 123

import java.io.*;

class Demo{

        public static void main(String[] args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.print("enter array size: ");

                int size= Integer.parseInt(br.readLine());

                int[] arr= new int[size];

                System.out.println("enter integer elements in array:");

                for(int i=0;i<arr.length;i++)
                {
                        arr[i]= Integer.parseInt(br.readLine());
                }

		System.out.println("elements whose digits sum is even:");

                for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=arr[i];j!=0;j=j/10)
			{
				int x= j%10;
				
				if(x%2==1)
				{
					count++;
				}
			}
			if(count%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}

