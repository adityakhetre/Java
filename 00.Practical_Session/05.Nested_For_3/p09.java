/*write a program to print the following pattern
 *1
 *8 27
 *64 125 216
 */

class Demo{

	public static void main(String[] args){

		int row= 3,x= 1;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++,x++){

				System.out.print(x*x*x+" ");
			}
			System.out.println();
		}
	}
}
