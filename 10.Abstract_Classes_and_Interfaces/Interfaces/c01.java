//100% abstraction

interface Demo{

	void fun();		//public abstract void fun() 	//public abstract add by compiler

	void gun();		//public abstract void gun()

}

class Child implements Demo{

	//need to give body to all method present in interface or declare class as abstract class
	
	public void fun(){			//need to declare as public else gives error

		System.out.println("in fun");
	}

	public void gun(){                      //need to declare as public else gives error

                System.out.println("in gun");
        }
}

class User{

	public static void main(String[] args){

		Demo obj = new Child();		//we can create obj of class using interface referance

		obj.fun();

		obj.gun();
	}
}






