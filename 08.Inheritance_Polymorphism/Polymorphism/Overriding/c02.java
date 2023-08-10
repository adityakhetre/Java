

class Parent{

	Parent(){

		System.out.println("Parent constructor");

	}
}

class Child extends Parent{

	Child(){

		System.out.println("Child Constructor");
	}
	Parent(){

                System.out.println("Parent constructor in Child");

        }
}

class User{

	public static void main(String[] args){

		Child obj = new Child();

	}
}
