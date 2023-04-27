//WAP to reverse each element in an array.
//Take size and elements from the user
//Input: 10 25 252 36 564
//Output: 01 52 252 63 465

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

                System.out.print("reverse of elements: ");

                for(int i=0;i<arr.length;i++)
                {
                        int rev=0;

                        while(arr[i]!=0)
                        {
                                int x=arr[i]%10;

				rev=rev*10+x;

                                arr[i]=arr[i]/10;
                        }

                        System.out.print(rev+" ");
                }
		System.out.println();
	}
}
