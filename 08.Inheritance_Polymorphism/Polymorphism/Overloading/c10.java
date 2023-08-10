

class Demo{

	void fun(Object obj){

		System.out.println("fun(Object)");

	}

	void fun(String str){

		System.out.println("fun(String)");

	}
}

class User{

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun("adi");				//checks perfect match fun(String)

		obj.fun(new StringBuffer("adi"));	//checks perfect match fun(StringBuffer) if not found checks parent i.e. fun(Object)
	}
}
