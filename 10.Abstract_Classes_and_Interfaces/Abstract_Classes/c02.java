

abstract class Parent{		//we can declare class as abstract even if niether method is abstract in class

	void fun(){

		System.out.println("parent fun");
	}

	void gun(){

		System.out.println("parent gun");
	}
}

class Child extends Parent{

}

class User{

	public static void main(String[] args){

		Parent obj = new Child();

		obj.fun();

		obj.gun();
	}
}
