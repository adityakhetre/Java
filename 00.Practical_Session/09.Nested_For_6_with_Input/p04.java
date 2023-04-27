/*Write a program to take a range as input from the user and print perfect cubes between that range.
 *Input: Enter start: 1
 *Enter end: 100
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter start: ");

		int start= Integer.parseInt(br.readLine());

		System.out.print("enter end: ");

		int end= Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){

			if(i*i*i<=end){

				System.out.print(i*i*i+", ");
			}
		}
		System.out.println();
	}
}


