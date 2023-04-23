/*take input start and end numbers and print odd no. in straight even no. in reverse
 *start:2 end:8
 *8 6 4 2
 *3 5 7
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter start number");
		
		int start= Integer.parseInt(br.readLine());

		System.out.println("enter end number");

                int end= Integer.parseInt(br.readLine());

		int x=start;
		int y=end;

		for(int i=1;i<=2;i++)
		{

			for(int j=start;j<=end;j++)
			{
				if(i==1)
				{       
					if(y%2==0)
					{
						System.out.print(y+" ");
					}
					y--;
				}
				if(i==2)
				{	
					if(x%2==1)
					{
						System.out.print(x+" ");
					}
					x++;
				}
				
			}
			System.out.println();
		}
	}
}
