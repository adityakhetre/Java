/*write a program to print the following pattern
 *12 12 12
 *11 11 11
 *10 10 10
 */

class Demo{

	public static void main(String[] args){

		int row= 3;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				System.out.print(13-i+" ");
			}
			System.out.println();
		}
	}
}
