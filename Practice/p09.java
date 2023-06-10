

class Demo{

	static int x = 10;

	static void fun(){

		System.out.println(x);

	}
}

class MainDemo{

	public static void main(String[] args){

		System.out.println("static");

		System.out.println(Demo.x);

		Demo.fun();

	}
}
