//Strings

class Demo{

	public static void main(String[] args){

		String s1= "kanha";					//stores at scp 	//s1 & s2 have same obj

		String s2= "kanha";					//stores at scp

		String s3= new String("kanha");				//creates new obj on heap using new

		String s4= new String("balu");				//creates new obj on heap using new

		String s5= new String("balu");				//creates new obj on heap using new

		System.out.println(System.identityHashCode(s1));	
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
	}
}

		
