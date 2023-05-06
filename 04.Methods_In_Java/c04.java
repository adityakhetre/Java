//passing values to method

import java.util.*;

class Demo{

	void add(int x,int y){

		int ans= x+y;

		System.out.println("addition of integers is:");

		System.out.println(ans);
	}
	void sub(int x,int y){

                int ans= x-y;

                System.out.println("subtraction of integers is:");

                System.out.println(ans);
        }
	void mult(int x,int y){

                int ans= x*y;

                System.out.println("multiplication of integers is:");

                System.out.println(ans);
        }
	void div(int x,int y){

                double ans= x/y;

                System.out.println("division of integers is:");

                System.out.println(ans);
        }

	public static void main(String[] args){

		Demo obj= new Demo();

		Scanner sc= new Scanner(System.in);

		int x= sc.nextInt();

		int y= sc.nextInt();

		obj.add(x,y);

		obj.sub(x,y);

		obj.mult(x,y);

		obj.div(x,y);
	}
}

