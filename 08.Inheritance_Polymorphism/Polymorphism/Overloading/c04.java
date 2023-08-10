

class Demo{

	void fun(int x){

		System.out.println("fun(int)");

	}

	void fun(char x){

		System.out.println("fun(char)");

	}

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun('a');					//checks perfect match
	}
}
