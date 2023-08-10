
import java.util.*;

class Demo{

	public static void main(String[] args){

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(10);
		arr.add(12);
		arr.add(13);
		arr.add(15);
		arr.add(17);
		arr.add(11);
		arr.add(19);
		arr.add(18);

		arr.remove(3);

		System.out.println(arr.contains(12));
		System.out.println();
		System.out.println(arr);
		arr.remove(3);
		arr.set(0,50);
		System.out.println(arr);
	}
}
