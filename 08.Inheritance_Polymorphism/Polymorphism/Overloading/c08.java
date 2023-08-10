

class Demo{

	void fun(String str){

		System.out.println("fun(String)");
	}

	void fun(StringBuffer str){

		System.out.println("fun(StringBuffer)");
	}

}

class User{

	public static void main(String[] args){

		String s1 = null;				//null can assign to String

		StringBuffer s2 = null;				//null can assign to StringBuffer

		Demo obj = new Demo();

		obj.fun("adi");					//match to fun(String)

		obj.fun(new StringBuffer("adi"));		//match to fun(StringBuffer)

//		obj.fun(null);					//error: reference to fun is ambiguous	//both method match
	}
}
