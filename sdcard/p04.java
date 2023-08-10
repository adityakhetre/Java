//second max element

class Demo{

	static int secMaxEle(int[] arr){

		int max = Integer.MIN_VALUE;

		int sMax = max;

		for(int i= 0;i<arr.length;i++){

			if(arr[i]>max){

				sMax = max;

				max = arr[i];
			}
			else if(arr[i]>sMax){

				sMax = arr[i];
			}
		}
		return sMax;
	}

	public static void main(String[] args){

		int[] arr = {10,9,6,3};

		System.out.println("second max ele "+secMaxEle(arr));
	}
}
