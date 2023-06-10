/*
 * method4- public int compareTo(String str2);
 *
 * description- 
 * -it compares the str1 and str2 (case sensitive), if both the strings are equal, it returns 0 otherwise returns the comparison.
 * -ex. str1.compareTo(str2).
 *
 * parameters- String (second string)
 * return Type- integer 
 * -If Both strings are equal = 0
 * -If Both strings are not equal = difference
 */

class Demo{

	public static void main(String[] args){

		String s1 = "Aditya";

		String s2 = "Aditya";

		String s3 = new String("Aditya");

		System.out.println(s1.compareTo(s2));			//compare strings if equals print 0

		System.out.println(s1.compareTo(s3));
		
		System.out.println(s1.compareTo("aditya"));		//if diff then print diff in char ASCII value where first diff char appeared

		System.out.println(s1.compareTo("Ac"));
	}
}


