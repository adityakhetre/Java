/*write a program to print the following pattern
 *14 14 14 14
 *15 15 15 15
 *16 16 16 16
 *17 17 17 17
 */

class Demo{

	public static void main(String[] args){

		int row= 4;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				System.out.print(i+13+" ");
			}
			System.out.println();
		}
	}
}
