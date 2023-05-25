

class Demo{

	static int x = 10;

	static int y = 20;

	static {

		System.out.println(x);


		int z = 30;

		Demo ob = new Demo();

		//ob.z = 500;

		System.out.println(z);

		System.out.println(y);

		System.out.println(ob.x);
	}
	public static void main(String[] args){

		System.out.println(x);

		System.out.println(y);
		
		//System.out.println(z);

	}
}



