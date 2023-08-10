//after version 1.8 we can give body to method in interface using keyword 1.default, 2.static

interface Demo{

	default void fun(){			//it can access through only object of child class it inherit to child class	//it can override
//in bytecode 	//public default void fun();

		System.out.println("Demo-fun");
	}

	static void gun(){			//static method can't inherit to child class only access through interface referance //it can't override
//in bytecode   //public default void fun();

		System.out.println("Demo-gun");
	}

	void run();
//in bytecode   //public abstract void run();
}

class Child implements Demo{

	public void run(){

		System.out.println("Child-run");
	}
}

class User{

	public static void main(String[] args){

		Demo obj = new Child();		//referance of interface object of concrete class

		obj.fun();

		Demo.gun();

		obj.run();
	}
}
