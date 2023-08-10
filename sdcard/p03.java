//max element in array

class Demo{

	static int maxEle(int[] arr){

		int max = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){

			if(arr[i]>max){

				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args){

		int[] arr = {10,43,27,49,81};

		System.out.println("max ele is "+maxEle(arr));
	}
}
