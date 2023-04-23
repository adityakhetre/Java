/*write a program to print following pattern take input as no. of rows
 * row=8
 * $
 * @ @
 * & & &
 * # # # #
 * $ $ $ $ $
 * @ @ @ @ @ @
 * & & & & & & &
 * # # # # # # # #
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter no. of rows");

		int row= Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%4==0)
					System.out.print("# ");
				else if(i%4==1)
					System.out.print("$ ");
				else if(i%4==2)
					System.out.print("@ ");
				else
					System.out.print("& ");
			}
			System.out.println();
		}
	}
}
