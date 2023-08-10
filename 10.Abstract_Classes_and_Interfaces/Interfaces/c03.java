//need of interface- multiple inheritance


interface Parent1{

	void fun();			//public abstact void fun()
}

interface Parent2{

	void fun();			//public abstact void fun()

	void gun();			//public abstact void gun()
}

class Child implements Parent1,Parent2{

	public void fun(){		//fun method in parent1 as well as parent2 but need to implement once

		System.out.println("child fun");
	}

	public void gun(){

		System.out.println("child gun");
	}
}

class User{

	public static void main(String[] args){

		Parent1 ob1 = new Child();

		ob1.fun();

		Parent2 ob2 = new Child();

		ob2.gun();
	}
}

