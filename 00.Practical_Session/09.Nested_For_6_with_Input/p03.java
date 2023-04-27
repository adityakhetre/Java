/*Write a program to take a range as input from the user and print perfect squares between that range.
 *Input: Enter start: 1
 *Enter end: 100
 *Output: perfect squares between 1 and 100
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter start: ");

		int start= Integer.parseInt(br.readLine());
			
		System.out.print("enter end: ");

		int end= Integer.parseInt(br.readLine());

		System.out.println("perfect squares between "+start+" and "+end+": ");

		for(int i=start;i<=end;i++){

			if(i*i<=end && i*i>=start){
				System.out.print(i*i+" ");
			}
		}
		System.out.println();
	}
}


		
