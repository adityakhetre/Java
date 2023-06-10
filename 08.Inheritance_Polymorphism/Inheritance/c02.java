class Parent{

	Parent(int x){

		super();

	}
}

class Child extends Parent{

	Child(){

		//super();		//error: constructor Parent in class Parent cannot be applied to given types; 
		this(10);
	}
	Child(int x){

		super(10);
	}
}

class User{

	public static void main(String[] args){

		Child ob = new Child();
	}
}

		
