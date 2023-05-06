//hashcode		//always same for same string

class Demo{

	public static void main(String[] args){

		String s1= "Shashi";

		String s2= new String("Shashi");

		String s3= "Shashi";

		String s4= new String("Shashi");

		System.out.println(System.identityHashCode(s1));

		System.out.println(System.identityHashCode(s2));

		System.out.println(System.identityHashCode(s3));

		System.out.println(System.identityHashCode(s4));


		System.out.println(s1.hashCode());

		System.out.println(s2.hashCode());

		System.out.println(s3.hashCode());

		System.out.println(s4.hashCode());


	}
}


