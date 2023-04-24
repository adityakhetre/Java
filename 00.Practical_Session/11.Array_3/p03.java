//WAP to find a composite number from an array and return its index.
//Take size and elements from the user
//Input: 1 2 3 5 6 7
//Output: composite 6 found at index: 4

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

		for(int i=0;i<arr.length;i++)
		{
			int count=0;

			for(int j=1;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
				if(count>1)
				{
					break;
				}
			}
			
			if(count>1)
			{
				System.out.println("composite no. "+arr[i]+" found at index: "+i);
			}
		}
	}
}

