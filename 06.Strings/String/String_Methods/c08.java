/* 
 * method8- public boolean startsWith(String prefix, int toffset);
 *
 * description- 
 * -predicate which determines if the given String contains the given prefix beginning comparison at toffset.
 * -The result is false if the toffset is negative or greater than str.length(). 
 *
 * parameters: prefix String to compare, toffset offset for this string where the comparison Starts. 
 * return Type: boolean
 */

class Demo{

	public static void main(String[] args){

		String str = "Shashi";

		
		System.out.println(str.charAt(3));
		System.out.println(str.startsWith("shi",3));		//prints true if argument string is start from argument index
	}
}
