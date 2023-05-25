//identity hash code 		//identity hash code is same for integer -128 to 127


import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter arr1 size: ");

		int size1 = Integer.parseInt(br.readLine());

		System.out.println("enter arr2 size: ");

                int size2 = Integer.parseInt(br.readLine());

		int[] arr1 = new int[size1], arr2 = new int[size2];

		for(int i=0;i<arr1.length;i++){

			System.out.println("enter arr1 "+i+" index element: ");

			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println();
		System.out.println();

		for(int i=0;i<arr2.length;i++){

			System.out.println("enter arr2 "+i+" index element: ");

			arr2[i] = Integer.parseInt(br.readLine());

		}

		System.out.println();
                System.out.println();

		System.out.println(arr1);									//prints referance of obj of array

		System.out.println(arr2);									//prints referance of obj of array

		for(int i=0;i<arr1.length;i++){

			System.out.print("identityHashCode of "+i+" index element in arr1: ");

			System.out.println(System.identityHashCode(arr1[i]));
		
		}

		System.out.println();
                System.out.println();

		for(int i=0;i<arr2.length;i++){

			System.out.print("identityHashCode of "+i+" index element in arr2: ");

                        System.out.println(System.identityHashCode(arr2[i]));
                }


	}
}





