//print the sum of array

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[5];

		int sum = 0;

		for(int i=0;i<arr.length;i++){

			arr[i] = Integer.parseInt(br.readLine());

			sum = sum + arr[i];
		}
		System.out.println("sum of array elements is: "+sum);
	}
}

