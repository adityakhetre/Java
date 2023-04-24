//WAP to find a palindrome number from an array and return its index.
//Take size and elements from the user
//Input: 10 25 252 36 564
//Output: Palindrome no 252 found at index: 2

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
			int rev=0;

			for(int j=arr[i];j!=0;j=j/10)
			{
				int digit= j%10;

				rev= rev*10+digit;
			}
			if(arr[i]==rev)
			{
				System.out.println("Palindrome no. "+arr[i]+" found at index: "+i);
			}
		}
	}
}
