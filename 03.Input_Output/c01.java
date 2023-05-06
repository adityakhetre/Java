//buffered reader needs argument as obj of inputstreamreader

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{				//readLine() gives exception

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	//obj of BufferedReader

		System.out.println("enter integer:");

		int x= Integer.parseInt(br.readLine());						//bufferedreader only take string :. rapper class of int used

		System.out.println("enter character:");

		char y= (char)br.read();
		br.skip(1);

		System.out.println("enter float:");

		float z= Float.parseFloat(br.readLine());					//:. rapper class of float use

		System.out.println("enter double:");

		double a= Double.parseDouble(br.readLine());					//:. rapper class of double use

		System.out.println("enter long:");

		long b= Long.parseLong(br.readLine());						//:. rapper class of long use

		System.out.println("enter string:");

		String c= br.readLine();

		System.out.println("entered integer: "+x);

		System.out.println("entered character: "+y);

		System.out.println("entered float: "+z);

		System.out.println("entered double: "+a);

		System.out.println("entered long: "+b);

		System.out.println("entered string: "+c);

	}
}
