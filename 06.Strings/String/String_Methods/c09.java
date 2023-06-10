/* 
 * method9- public boolean endsWith(String suffix);
 *
 * description- 
 * -predicate which determines if the string ends with given suffix
 * -if the suffix is an empty String, true is returned
 * -throws NullPointerException if suffix is null 
 *
 * parameters- prefix String to compare
 * return Type- boolean
 */

class Demo {

	public static void main(String[] args){

		String s1 = "Shashi";

		System.out.println(s1.endsWith("shi"));		//prints true if string end with argument string
	}
}
