//nested try catch

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{	//only throws compiletime exception is meaningful

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter name");

		String str = br.readLine();

		System.out.println("enter roll no");

		int x = 0;
		try{
			x = Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException obj){

			System.out.println("please enter int input");

			try{
				x = Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException obj2){
			
				System.out.println("please enter int input");
				
				x = Integer.parseInt(br.readLine());
			}
		}
	}
}




			

