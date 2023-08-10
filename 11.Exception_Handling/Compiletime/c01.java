//IOException

import java.io.*;

class Demo{

	void m1()throws IOException{		//exception can be thrown

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter integer number");

		int num = Integer.parseInt(br.readLine());

		System.out.println(num);
	}

	void m2()throws IOException{		//exception can be thrown

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter integer number");

		br.close();

		int num = Integer.parseInt(br.readLine());

		System.out.println(num);
	}
	public static void main(String[] args){

		Demo obj = new Demo();

		try{				//or exception can be handled
			obj.m1();

			obj.m2();
		}
		catch(IOException ob){
			System.out.println(ob.getMessage());

			System.out.println(ob);

			System.out.println(ob.toString());

			ob.printStackTrace();
		}
		System.out.println("end main");
	}
}
