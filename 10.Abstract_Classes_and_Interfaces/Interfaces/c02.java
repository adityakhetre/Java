//we can't create object of interface as well as abstract class only use their referances to create object

interface Parent{

	void fun();		//public abstract void fun()

	void gun();		//public abstract void gun()

}

abstract class Child1 implements Parent{

	public void fun(){				//gives body to one method therefore makes class as abstract

		System.out.println("child1 fun");
	}

	//public abstract void gun();			//no need to write this otherwise valid
	
}

class Child2 extends Child1{

	public void gun(){				//need to give body to gun because body to fun given by Child1

		System.out.println("child2 gun");
	}
}

class User{

	public static void main(String[] args){

		Parent obj = new Child2();		//only create object of concrete class

		obj.fun();

		obj.gun();
	}
}

