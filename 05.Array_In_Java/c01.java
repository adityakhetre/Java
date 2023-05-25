//array in java

class Demo{

	int a=20;					//global variable or instance variable (non static)

	public static void main(String[] args){

		int x=10;

		System.out.println(x);

		//System.out.println(a);		//error

		{
			int arr[];			//valid only declaration no memory allocate

			//int arr1[5];			//error

			int arr2[]= new int[4];		//valid allocate memory in heap section because of new keyword
							//by default 0 insert in array


			//int arr3[]= new int[];	//error array dimension missing

			int arr4[]= new int[]{1,3,5,2};	//valid  known as initializer list
			
			int arr5[]={4,5,2,7};		//valid  internally calls new array
			arr2[0]= 12;
			arr2[1]= 34;

			System.out.println(arr2[0]+" "+arr2[1]+" "+arr2[2]+" "+arr2[3]);
			System.out.println(arr4[0]+" "+arr4[1]+" "+arr4[2]+" "+arr4[3]);
			System.out.println(arr5[0]+" "+arr5[1]+" "+arr5[2]+" "+arr5[3]);

		}
	}
}


