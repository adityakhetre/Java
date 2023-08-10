// char -> int -> long -> float -> double

class Demo{

	void fun(int x){

		System.out.println("fun(int)");
	}

	void fun(float x){

		System.out.println("fun(float)");
	}

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun('A');				//checks perfect match if not found checks big datatype
							//here char parametered method not found then call to int parametered method

	}
}
