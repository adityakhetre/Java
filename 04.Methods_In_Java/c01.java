//methods

class Demo{

	void fun(){									//non-static method

		System.out.println("in fun method");
	}

	static void gun(){								//static method


		System.out.println("in gun method");
	}

	public static void main(String[] args){

		//fun();								//directly call to non-static method from static method is invalid

		gun();									//directly call to static method from static method is valid
	
		Demo obj= new Demo();
		
		obj.fun();								//access non-static method by creating obj is valid	
	}
}
