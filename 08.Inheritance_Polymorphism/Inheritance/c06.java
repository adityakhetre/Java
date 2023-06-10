

class Parent {

	static int x = 50;

	static{

		System.out.println("in parent static block");

	}
	static void access(){

		System.out.println("in access method");
	}
}

class Child extends Parent{

	static{
		System.out.println("in child static block");

		System.out.println(x);

		access();
	}
}

class User{

	public static void main(String[] args){

		Parent obj1 = new Parent();
		
		Child obj2 = new Child();
	}
}


