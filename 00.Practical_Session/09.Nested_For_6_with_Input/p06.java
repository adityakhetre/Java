/*Write a program to take 5 numbers as input from the user and print the count of digits in those numbers.
 *Input: Enter 5 numbers :
 *5
 *The digit count in 5 is 1
 *25
 *The digit count in 25 is 2
 *225
 *The digit count in 225 is 3
 *6548
 *The digit count in 6548 is 4
 *852347
 *The digit count in 852347 is 6
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 5 numbers : ");

		for(int i=1;i<=5;i++){

			int num= Integer.parseInt(br.readLine());
			int count= 0;

			for(int j=num;j!=0;j=j/10){

				count++;
			}
			System.out.println("The digit count in "+num+" is "+count);
		}
	}
}

