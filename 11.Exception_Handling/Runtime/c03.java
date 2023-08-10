//NullPointerException

class Demo{

	void m1(){

		System.out.println("start m1");
	}

	public static void main(String[] args){

		System.out.println("start main");

		Demo obj = new Demo();

		obj.m1();

		obj = null;

		obj.m1();

		System.out.println("end main");
	}
}
