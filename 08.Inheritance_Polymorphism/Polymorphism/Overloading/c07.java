

class Demo{


	void fun(int x,float y){

		System.out.println("fun(int,float)");
	}

	void fun(float x,int y){

		System.out.println("fun(float,int)");
	}
}

class User{

	public static void main(String[] args){

		Demo obj = new Demo();

//		obj.fun(10,10);			//error: reference to fun is ambiguous	//both methods match 

		obj.fun(10f,10);		//match to fun(float,int)

		obj.fun(10,10f);		//match to fun(int.float)
	}
}	
