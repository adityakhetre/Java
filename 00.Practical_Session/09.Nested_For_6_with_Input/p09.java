/*write a program to print a series of strong numbers from entered range. ( Take a start and end number from a user )
 *Input:-
 *Enter starting number: 1
 *Enter ending number: 150
 *Output: strong numbers between 1 and 150
 *1 2 145
 */

import java.io.*;

class Demo{

        public static void main(String[] args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.print("enter start: ");

                int start= Integer.parseInt(br.readLine());

                System.out.print("enter end: ");

                int end= Integer.parseInt(br.readLine());

                System.out.println("strong numbers between "+start+" and "+end);

                for(int i=start;i<=end;i++){

			int strong= 0;

			for(int j=i;j!=0;j=j/10){

				int d=j%10,fact=1;

				for(int k=1;k<=d;k++){

					fact=fact*k;
				}
				strong=strong+fact;
			}
			if(i==strong){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}




