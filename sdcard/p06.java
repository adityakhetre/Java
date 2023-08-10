//linear search

class Demo{

	static int lSearch1(int[] ar,int sEle){

		if(ar.length == 0)
			return -1;

		for(int i=0;i<ar.length;i++){

			if(ar[i] == sEle)
				return i;

		}
		return -1;
	}

	static int lSearch2(int[]arr,int sEle){

		if(arr.length == 0)
			return Integer.MIN_VALUE;
	
		for(int i=0;i<arr.length;i++){

			if(arr[i] == sEle)
				return arr[i];
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args){

		int[] arr = new int[]{12,43,27,33,82,01};

		System.out.println(lSearch1(arr,01));
		System.out.println(lSearch2(arr,11));
	}
}



