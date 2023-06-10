/*
 * method5- public int compareToIgnoreCase(String str);
 *
 * description- 
 * -It compares str1 and str2(case insensitive).
 *
 * parameters: String
 * return Type: Integer
 */

class Demo{

	public static void main(String[] args){

		String s1 = "Aditya";

                String s2 = "Aditya";

                String s3 = new String("Aditya");

                System.out.println(s1.compareToIgnoreCase(s2));                   //compare strings if equals print 0 	//ignore case

                System.out.println(s1.compareToIgnoreCase(s3));

                System.out.println(s1.compareToIgnoreCase("aditya"));             //if diff then print diff in char ASCII value where first diff char appeared

                System.out.println(s1.compareToIgnoreCase("Ac"));
        }
}
