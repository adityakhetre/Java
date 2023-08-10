//ArrayList constructors

import java.util.*;

class ArrayListD{

	public static void main(String[] args){

		ArrayList al1 = new ArrayList();

		al1.add(10);
		al1.add(29);
		al1.add("fun");
		al1.add(true);

		System.out.println(al1);

		ArrayList al2 = new ArrayList(10);	//ensures that the size of ArrayList 10
							
		System.out.println(al2);

		ArrayList al3 = new ArrayList(al1);	//copy al1 to al3	

		System.out.println(al3);
	}
}
