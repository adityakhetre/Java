// 0 to 100 % abstract method can write

abstract class Parent{					//if even single method is abstract then need to declare it as abstract class

	void carrer(){					//if declare it as abstract then gives error because no body to abstract method

		System.out.println("doctor");
	}

		abstract void marry();			//if method has no body then need to declare it as abstract

}

class Child extends Parent{

	void marry(){					//need to give body to marry or declare class as abstract class 

		System.out.println("----");
	}
}

class User{

	public static void main(String[] args){

//		Parent obj = new Parent();		//we can't create abstract class Object

		Parent obj = new Child();		//can create object with abstract class referance

		obj.carrer();

		obj.marry();
	}
}

