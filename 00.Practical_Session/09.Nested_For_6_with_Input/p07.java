/*Write a program to take range as input from the user and print the reverse of all numbers. ( Take a start and end number from a user )
 *Input: Enter start: 100
 *Enter end: 200
 *Output: reverse numbers between 100 and 250
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter start: ");

		int start= Integer.parseInt(br.readLine());

		System.out.print("enter end: ");

		int end= Integer.parseInt(br.readLine());

		System.out.println("reverse numbers between "+start+" and "+end);

		for(int i=start;i<=end;i++){

			int rev= 0;

			for(int j=i;j!=0;j=j/10){

				int d= j%10;

				rev=rev*10+d;
			}
			System.out.print(rev+" ");
		}
		System.out.println();
	}
}




