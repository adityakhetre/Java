//overloading in same class	//it checks only method table need different method signuature 
//return type doesn't matter

class Demo{

	void fun(int x){		//fun(int)

		System.out.println(x);
	}
/*	void fun(int y){		//fun(int)	//error same method signuature	//fun(int) already defined in class Demo

	}*/

/*	float fun(int z){		//fun(int)      //error same method signuature  //fun(int) already defined in class Demo

		return 5.5f;
	}*/

	void fun(float x){		//fun(float)

		System.out.println(x);
	}

	void fun(Demo x){		//fun(Demo)

		System.out.println(x);
	}

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun(10);

		obj.fun(10.5f);

		Demo obj1 = new Demo();

		obj1.fun(obj);
	}
}

