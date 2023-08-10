//NumberFormatException

import java.io.*;

class Demo{

	void getData()throws IOException{	//must throws every caller method
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();	//throws IOException

		System.out.println(str);

		int a = Integer.parseInt(br.readLine());

		System.out.println(a);
	}

	public static void main(String[] args)throws IOException{       //must throws every caller method

		System.out.println("start main");

		Demo obj = new Demo();

		obj.getData();

		System.out.println("end main");
	}
}
