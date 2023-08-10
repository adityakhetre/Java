//reverse array	

import java.util.Arrays;

class Demo{

	static void reverse(int[] arr){

		int start = 0;

		int end = arr.length-1;

		for(int i=0;i<arr.length/2;i++){

			swap(arr,start,end);

			start++;
			end--;
		}
	}
	static void swap(int[] arr,int a,int b){

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args){

		int[] arr = {10,43,37,20,11};

		System.out.println(Arrays.toString(arr));

		reverse(arr);

		System.out.println(Arrays.toString(arr));

		swap(arr,0,4);

		System.out.println(Arrays.toString(arr));
	}
}




