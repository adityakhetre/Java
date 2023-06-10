import java.io.*;

class Parent{

	Parent(){

		System.out.println("in parent constructor");

		//System.out.println(super);

	}

}

class Child extends Parent{

	Child(){

		super();

		System.out.println("in child constructor");
	}
}

class User{

	public static void main(String[] args)throws Exception{

		//Child ob = new Child();

		PrintStream op = new PrintStream("adi");

		op.println("adi");

		System.out.println("in");



	}
}


