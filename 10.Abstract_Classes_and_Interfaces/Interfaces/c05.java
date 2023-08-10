//static keyword in interface

interface Demo1{

	static void fun(){

		System.out.println("Demo1-fun");
	}
}
interface Demo2{

	static void fun(){

		System.out.println("Demo2-fun");
	}
}

interface Demo3 extends Demo1,Demo2{	//interface can extends multiple interfaces

}

class Child implements Demo3{		//class can implements multiple interfaces

	public static void main(String[] args){

		Demo1 obj = new Child();	//referace interface object concrete class

		//obj.fun();		//error: illegal static interface method call	//static method only access throw interface referance

		Child obj1 = new Child();	//referace concrete class object concrete class

		//obj1.fun();		//error: cannot find symbol	//static method only access throw interface referance it can't inherit to its child 

		Demo1.fun();

		Demo2.fun();

	}
}


