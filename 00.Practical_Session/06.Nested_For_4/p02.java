/*write a program to print the following pattern
 *1
 *3 4
 *6 7 8
 *10 11 12 13
 *15 16 17 18 19
 */

class Demo{

	public static void main(String[] args){

		int row= 5,x= 1;

		for(int i=1;i<=row;i++,x++){

			for(int j=1;j<=i;j++,x++){

				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
