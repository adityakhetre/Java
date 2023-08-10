
import java.io.*;
import java.util.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter address as societyname.wing.flatno");

		String str = br.readLine();

		System.out.println(str);

		StringTokenizer st = new StringTokenizer(str,".");

		String s1 = st.nextToken();

		char s2 = st.nextToken().charAt(0);

		int s3 = Integer.parseInt(st.nextToken());
		
		System.out.println("society name: "+ s1);

		System.out.println("wing: "+ s2);

		System.out.println("flat no: "+ s3);

	}
}
