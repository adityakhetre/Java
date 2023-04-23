/*write a program to print following pattern take no. of rows as input
 * D4 C3 B2 A1
 * A1 B2 C3 D4
 * D4 C3 B2 A1
 * A1 B2 C3 D4
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter no. of rows");

		int row= Integer.parseInt(br.readLine());

		char ch1='A';
		int x=1;

		for(int i=1;i<row;i++)
		{

			ch1++;
			x++;
		}



		for(int i=1;i<=row;i++)
		{
			char ch2='A';
			char ch3=ch1;
			int y=x;


			for(int j=1;j<=row;j++)
			{
				if(i%2==1)
				{
					System.out.print(ch3+""+y+" ");
					ch3--;
					y--;
				}
				else
				{
					System.out.print(ch2+""+j+" ");
					ch2++;
				}
			}
			System.out.println();
		}
	}
}


