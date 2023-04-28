/*write a program to print the following pattern
 *10
 *10 9
 *9 8 7
 *7 6 5 4
 */

class Demo{

	public static void main(String[] args){

		int row= 4,x= 10;

		for(int i=1;i<=row;i++,x++){

			for(int j=1;j<=i;j++,x--){

				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}



