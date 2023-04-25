/*write a program to print the following pattern
 *1 2 3 4
 *2 3 4 5
 *3 4 5 6
 *4 5 6 7
 */

class Demo{

	public static void main(String[] args){

		int row= 4;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				System.out.print(i+j-1+" ");
			}
			System.out.println();
		}
	}
}
