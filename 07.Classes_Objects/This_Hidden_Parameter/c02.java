

class Demo{

	Demo(){

		this(10);					//calling other coastructor in constructor	//error: recursive constructor invocation

		System.out.println("in constroctor Demo()");

	}

	Demo(int x){

		//this();						//calling other coastructor in constructor

		System.out.println("in constroctor Demo(int x)");

	}

	public static void main(String[] args){

		Demo obj = new Demo();
	}
}






	
