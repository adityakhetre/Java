//Inheritance


class Parent{

	Parent(){				//Parent(Parent this)

		super();			//Object(this)

		System.out.println("in parent constructor");

	}

	void parentProperty(){

		System.out.println("ethics");

	}
}

class Child extends Parent{


	Child(){				//Child(Child this)

		super();			//Parent(this)

		System.out.println("in child constructor");

	}
}

class User{

	public static void main(String[] args){

		//way of creating obj in inheritance

		Parent obj1 = new Parent();	//valid	//only access parent class things
						//Parent(obj1)

		Parent obj2 = new Child();	//valid		//can access parent & child class things 	//
						//Child(obj2)							//
														//both are same
		Child obj3 = new Child();	//valid 	//can access parent & child class things	//
						//Child(obj3)							//

		//Child obj4 = new Parent();	//invalid	//error: incompatible types: Parent cannot be converted to Child
						//Parent(obj4)

	}
}


