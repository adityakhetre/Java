class Demo{

	int x = 100;

	static int y = 100;

	public static void main(String[] args){

		Demo ob = new Demo();

		System.out.println(ob.x);

		System.out.println(y);

		int a = 100;

		Integer z = 100;

		System.out.println(a);

		System.out.println(z);

		System.out.println(System.identityHashCode(ob.x));

		System.out.println(System.identityHashCode(y));

		System.out.println(System.identityHashCode(a));

		System.out.println(System.identityHashCode(z));

	}
}


