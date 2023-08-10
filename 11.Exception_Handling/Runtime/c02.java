//ArithmeticException

class Demo{

	void m1(){
		System.out.println("start m1");
		System.out.println(10/0);
		System.out.println("end m1");
	}

	void m2(){

		System.out.println("start m2");
		m1();
		System.out.println("end m2");
	}

	public static void main(String[] args){


		System.out.println("start main");

		Demo obj = new Demo();

		obj.m2();

		System.out.println("end main");
	}
}
