

class Parent{

	Parent(){						//Parent(Parent this)

		System.out.println("in parent constructor");

		System.out.println(this);			//this of type Child as argument stored by type (Parent this)

	}

}

class Child extends Parent{

	Child(){						//Child(Child this)

		System.out.println("in child constructor");

		System.out.println(this);			//this of type Child as argument stored by type (Childthis)
	}
}

class User{

	public static void main(String[] args){

		Child op = new Child();
	}
}
