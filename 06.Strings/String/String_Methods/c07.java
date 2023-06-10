/* 
 * method7- public boolean equalsIgnoreCase(String anotherString); 
 *
 * description- 
 * -compares a String to this String ignoring case.
 *
 * parameters: String (str2)
 * return Type: boolean
 */

class Demo{

	public static void main(String[] args){

		String s1 = "aditya";

		String s2 = "Aditya";

		boolean op = s1.equalsIgnoreCase(s2);

		System.out.println(op);

		System.out.println(s1.equalsIgnoreCase("ADITYA"));	//prints true if strings are equal ignore case

	}
}	


