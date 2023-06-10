/* 
 * method11- public int lastIndexOf(int ch, int toIndex); 
 *
 * description- 
 * -finds the last instance of the character in the given String 
 *
 * parameters: character (ch to find), Integer (index to upto the search). 
 * return Type: Integer
 */

class Demo {

	public static void main(String[] args){

		String s1 = new String("Shashi");

		System.out.println(s1.lastIndexOf('s',0));		//prints last appearance of char upto index

		System.out.println(s1.lastIndexOf('s',5));
	}
}
