

class Parent{

	Parent(){

		System.out.println("Parent Constructor");

	}

	void fun(){

		System.out.println("Parent fun");
	}
}

class Child extends Parent{

	Child(){

		System.out.println("Child Constructor");
	}

	void fun(){

		System.out.println("Child fun");
	}
}

class User{

	public static void main(String[] args){

		Child obj = new Child();

		obj.fun();
	}
}
