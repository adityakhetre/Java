//
class NewDemo{

	int y = 100;
	
	static int z = 30;

	Funy op = new Funy();

	class Funy{

		void fun(){

			System.out.println(z);
		}
	}	
}
class MainDemo{

	static int x = 10;

	public static void main(String[] args){

		NewDemo nd = new NewDemo();

		System.out.println(x);

		System.out.println(NewDemo.z);

		nd.op.fun();
	}
}

