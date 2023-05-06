//passing values to a function

import java.util.*;

class Demo{

	static void add(int x,int y){							//parameters x & y type integer

		int ans= x + y;

		System.out.println("addition of integers is:");

		System.out.println(ans);
	}

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.println("enter first integer:");

		int x= sc.nextInt();

		System.out.println("enter second integer:");

		int y= sc.nextInt();

		add(x,y);								//argument x & y passing to function
	}
}

