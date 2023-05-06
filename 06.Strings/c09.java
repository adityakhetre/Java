//compare two strings

import java.util.*;

class Demo{

	static int stringLen(String str){

		char[] arr = str.toCharArray();

		int count = 0;

			for(int i=0;i<arr.length;i++,count++);

			return count;
	}

	static int stringCom(String str1, String str2,int count){

		int x = 0;

		for(int i=0;i<count;i++){

			if(str1.charAt(i) != str2.charAt(i)){

				x= str1.charAt(i) - str2.charAt(i);

				break;
			}
		}
		return x;
	}

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.println("enter two string to compare:");

		String s1= sc.next();

		String s2= sc.next();

		if(stringLen(s1) == stringLen(s2)){

			int count = stringLen(s1);

			System.out.println(stringCom(s1,s2,count));
		}
		else{
			System.out.println(stringLen(s1) - stringLen(s2));
		}
		main(null);
	}
}

