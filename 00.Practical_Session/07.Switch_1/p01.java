/*Write a program in which students should enter marks of 5 different subjects. If all subject having above passing marks add them and provide to switch case to print grades(first class second class), if student get fail in any subject program should print “You failed in exam”*/

import java.io.*;

class Demo{

	static void switchDemo(double avg){

		char ch;

		if(avg>=90d){
			ch='A';
		}
		else if(avg>=80 && avg<90){
			ch='B';
		}
		else if(avg>=70 && avg<80){
			ch='C';
		}
		else if(avg>=50 && avg<70){
			ch='D';
		}
		else{
			ch='P';
		}

		switch(ch){

			case 'A':{
					 System.out.println("Exceptional, outstanding and excellent performance!");
					 break;
			}
			case 'B':{
                                         System.out.println("Very good, good and solid performance!");
                                         break;
                        }
			case 'C':{
                                         System.out.println("Satisfactory, or minimally satisfactory Performance!");
                                         break;
                        }
			case 'D':{
                                         System.out.println("Marginal Performance!");
                                         break;
                        }
			default :{
                                         System.out.println("Pass!");
                                         break;
                        }
		}
	}


	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter marathi marks: ");

		int mar= Integer.parseInt(br.readLine());
		
		System.out.print("enter english marks: ");

		int eng= Integer.parseInt(br.readLine());

		System.out.print("enter mathemathics marks: ");

		int math= Integer.parseInt(br.readLine());

		System.out.print("enter science marks: ");

		int sci= Integer.parseInt(br.readLine());

		System.out.print("enter social science marks: ");
		
		int sst= Integer.parseInt(br.readLine());

		if(mar<35 || eng<35 || math<35 || sci<35 || sst<35){

			System.out.println("sorry.. you failed in exam");
		}
		else{
			double avg= (mar + eng + math + sci + sst)/5;

			switchDemo(avg);
		}
	}
}









