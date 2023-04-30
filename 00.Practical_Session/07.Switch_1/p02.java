/*Write a program in which ask the user to enter a number from 0 to 5 and print it's spelling,if the entered number is greater than 5 print entered number is greater than 5
e.g
Input -Enter a number - 4
Output - four*/

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter positive integer: ");

		int i= Integer.parseInt(br.readLine());

		switch(i){

			case 1:{
				       System.out.println("one");
				       break;
			}
			case 2:{
                                       System.out.println("two");
                                       break;
                        }
			case 3:{
                                       System.out.println("three");
                                       break;
                        }
			case 4:{
                                       System.out.println("four");
                                       break;
                        }
			case 5:{
                                       System.out.println("five");
                                       break;
                        }
			default :{
					 System.out.println(i+" is greater than 5");
			}
		}
	}
}


