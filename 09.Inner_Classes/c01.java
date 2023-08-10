//normal inner class 


class Outer{

	int x = 10;

	static int y = 20;

	static void gun(){

		System.out.println("Outer-gun");
	}
	void outerInfo(){

		System.out.println(x);
                         
		System.out.println(y);
		
		gun();
	}
	
	class Inner{

		int a = 10;

		final static int b = 20;	//static variables allows only if it is final

/*		final static void run(){	//static methods not allowed in inner class

			System.out.println("Inner-run");
		}*/
		void innerInfo(){

			 System.out.println(a);
			 
			 System.out.println(b);
			 
			 //run();
		}
	}
}

class User{

	public static void main(String[] args){

		Outer obj = new Outer();

		obj.outerInfo();

		Outer.Inner obj1 = obj.new Inner();

		obj1.innerInfo();
	}
}

