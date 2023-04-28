/*write a program to print the following pattern
 *1 2 3 4
 *4 5 6
 *6 7
 *7
 */

class Demo{

	public static void main(String[] args){

		int row= 4,x=1;

		for(int i=1;i<=row;i++,x--){

			for(int j=1;j<=row-i+1;j++,x++){

				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
