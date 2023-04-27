/*write a program to print the following pattern
 *1 4 9
 *16 25 36
 *49 64 81
 */

class Demo{

	public static void main(String[] args){

		int row= 3;
		int x= 1;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				System.out.print(x*x+" ");

				x++;
			}
			System.out.println();
		}
	}
}
