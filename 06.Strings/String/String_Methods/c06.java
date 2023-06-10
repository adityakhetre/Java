/*
 * method6- public boolean equals(Object anObject);
 *
 * description- 
 * -Predicate which compares and Object to this. 
 * -This is true only for Strings with the same character sequence. 
 * -returns true if anObject is semantically equal to this.
 *   
 * parameters- Object (anObject) 
 * return Type- boolean
 */

class Demo{

	public static void main(String[] args){

		String s1 = "aditya";

		String s2 = "Aditya";

		String s3 = new String("aditya");

		System.out.println(s1.equals(s1));		//compares two strings case sensitive

		System.out.println(s1.equals(s2));

		System.out.println(s1.equals(s3));

		System.out.println(s1.equals("Aditya"));

	}
}
