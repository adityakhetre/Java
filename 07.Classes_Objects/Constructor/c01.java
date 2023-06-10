
class Demo{

	int x = 10;

	Demo(){							//Demo(Demo this)

		System.out.println("in Constructor");
	}

	void fun(){

		System.out.println("in fun");
	}

	public static void main(String[] args){

		Demo obj = new Demo();				//internally calls as

		obj.fun();					//fun(obj);
	}
}
