/*write program for following pattern take input as no. of rows
 * 0
 * 1 1
 * 2 3 5
 * 8 13 21 34
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter no. of rows");

		int row= Integer.parseInt(br.readLine());

		int x=0;
		int y=1;

		for(int i=1;i<=row;i++)
		{

			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				int z=x;
				x=y;
				y=y+z;
			}
			System.out.println();
		}
	}
}


