/*write a program to print the following pattern
 *4 5 6 7
 *4 5 6 7
 *4 5 6 7
 *4 5 6 7
 */

class Demo{

	public static void main(String[] args){

		int row= 4;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				System.out.print(j+3+"  ");
			}
			System.out.println();
		}
	}
}
