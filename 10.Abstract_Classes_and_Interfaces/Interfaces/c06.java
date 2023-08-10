

interface Demo{

	void gun();
////in bytecode   //public abstract void gun();

	default void fun(){			//access through object of child class
//in bytecode   //public default void fun();

		System.out.println("Demo-fun");
	}
}

class Child implements Demo{

	public void gun(){

		System.out.println("Child-gun");
	}
}

class User{

	public static void main(String[] args){

		Demo obj = new Child();

		obj.fun();

		obj.gun();
	}
}
