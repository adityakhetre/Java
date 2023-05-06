//

class Demo{

	void fun(int x){					//no. of parameter should equal to no. of agument
								//and both of same type
		System.out.println("in fun");

		System.out.println(x);
	}

	public static void main(String[] args){

		Demo obj= new Demo();

		obj.fun(10);					//passing argument 10 to parameter x
		
	}
}




