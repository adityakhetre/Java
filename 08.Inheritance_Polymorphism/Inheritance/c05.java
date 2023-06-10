

class Parent{


	static{
		System.out.println("in parent static block");

	}

}

class Child extends Parent{

	static{

		System.out.println("in child static block");
	}

}

class User{

	public static void main(String[] args){

		Child obj = new Child();


	}
}


