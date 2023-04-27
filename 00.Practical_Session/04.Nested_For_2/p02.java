/*write a program to print the following pattern
 *4 4 4 4
 *5 5 5 5
 *6 6 6 6
 *7 7 7 7
 */

class Demo{

	public static void main(String[] args){

		int row= 4;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				System.out.print(i+3+" ");
			}
			System.out.println();
		}
	}
}
