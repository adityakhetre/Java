//print count of even integer in an array

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter size of array: ");

		int size = Integer.parseInt(br.readLine()),count = 0;

		int[] arr = new int[size];

		System.out.println("enter elements in array: ");

		for(int i=0;i<arr.length;i++){

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i]%2 == 0){

				count++;
			}
		}
		System.out.println("even element count in array: "+count);

	}
}





