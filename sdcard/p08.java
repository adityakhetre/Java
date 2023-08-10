//static in inner class

class Outer{

	class Inner{

		static int y = 10;
	}
}

class User{

	public static void main(String[] args){

		System.out.println(Outer.Inner.y);

	}
}
