/*write a program to print the following pattern
 *A B C D
 *B C D
 *C D
 *D
 */

class Demo{

	public static void main(String[] args){

		int row= 4;
		char ch= 'A';

		for(int i=1;i<=row;i++,ch++){

			char ch1= ch;

			for(int j=1;j<=row-i+1;j++,ch1++){

				System.out.print(ch1+" ");
			}
			System.out.println();
		}
	}
}

