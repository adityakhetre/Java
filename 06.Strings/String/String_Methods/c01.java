/* 
 * method1- public String concat(String s);
 *
 * description-
 * -concat String to this String i.e. another String is concatinated with the first String
 * -implements new Array of character whose length is sum of str1.length & str2.length
 *
 * -parameter- String
 * -returntype- String
 */

class Demo{

        public static void main(String[] args){

                String s1= "Core2";

                String s2= "Web";

                String s3= s1.concat(s2);		//adds two string to create new string

                System.out.println(s3);
        }
}
