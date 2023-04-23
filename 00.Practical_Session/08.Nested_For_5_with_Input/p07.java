/*write program to print following pattern
 * row=5					row=4
 * O						10
 * 14 13					I H
 * L K J					7 6 5
 * 9 8 7 6					D C B A
 * E D C B A
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter no. of rows");

		int row= Integer.parseInt(br.readLine());

		char ch='A';

		int x= row*(row+1)/2;

		for(int i=1;i<x;i++)
		{
			ch++;
		}

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(row%2==1)
				{	
					if(i%2==1)
                        		{
                                		System.out.print(ch+" ");
                        		}
                        		else
                        		{
                                		System.out.print(x+" ");
                        		}
				}
				else
				{
					if(i%2==1)
                                        {
                                                System.out.print(x+" ");
                                        }
                                        else
                                        {
                                                System.out.print(ch+" ");
                                        }
				}
				x--;
				ch--;
			}
			System.out.println();
		}
	}
}
