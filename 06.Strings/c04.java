//Strings

class Demo{

	public static void main(String[] args){

		String s1= "Core";					//new obj at scp

		String s2= s1;						//s1 & s2 refers same obj in scp

		String s3= new String(s2);				//new obj create

		String s4= "2Web";

		String s5= "Core2Web";					//new obj at scp

		String s6= s1 + s4;					//append method internally call new String on heap
									//append method of class stringbuilder

		System.out.println(s1);

		System.out.println(s4);

		System.out.println(s6);


		s1.concat(s4);						//only create new object not save to variable

		System.out.println(s1);

		System.out.println(s5);


		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(System.identityHashCode(s4));
	
		System.out.println(System.identityHashCode(s5));
		
		System.out.println(System.identityHashCode(s6));
	}
}
