/*write a program to print the following pattern
 *14 15 16 17
 *15 16 17 18
 *16 17 18 19
 *17 18 19 20
 */

class Demo{

	public static void main(String[] args){

		int row= 4;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				System.out.print(12+i+j+" ");
			}
			System.out.println();
		}
	}
}	
