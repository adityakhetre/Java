//referances of obj of array


import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		int[] arr1 = new int[]{10,20,30};		//first way of reprensenting array

		char[] arr2 = new char[]{'A','B','C'};		//first way of reprensenting array

		float[] arr3 = {10.0f,20,39.4f};		//second way of reprensenting array

		byte[] arr4 = {10,20,29};			//second way of reprensenting array

		short[] arr5 = new short[3];			//third way of reprensenting array
								//by default 0 value store in arr5 element if values is not given

		arr5[0] = 10;
		arr5[1] = 20;

		boolean[] arr6 = new boolean[2];		//third way of reprensenting array
								//by default false value store in arr6 element if values is not given

		
		System.out.println(arr1);			//prints referance of obj of arr1						
		System.out.println(arr2);			//prints elements in arr2               //diff behaviour in char array
		System.out.println(arr3);			//prints referance of obj of arr3
		System.out.println(arr4);			//prints referance of obj of arr4
		System.out.println(arr5);			//prints referance of obj of arr5
		System.out.println(arr6);			//prints referance of obj of arr6


	}
}

