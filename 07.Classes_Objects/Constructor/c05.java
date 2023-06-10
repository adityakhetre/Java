
//ambiguity in methods


class Demo{

	int fun(int x,float y){

		System.out.println(x+y);

		return 0;
	}

	int fun(float x,int y){

		System.out.println(x-y);

		return 0;
	}

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun(10,10f);				//only one method validate argument

		obj.fun(10f,10);				//only one method validate argument
		
		//obj.fun(10,10);				//error: reference to fun is ambiguous	//both methods validate argument
	}
}
