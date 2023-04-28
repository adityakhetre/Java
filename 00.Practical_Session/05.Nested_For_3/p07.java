/*write a program to print the following pattern
 *F
 *E F
 *D E F
 *C D E F
 *B C D E F
 *A B C D E F
 */

class Demo{
	
	public static void main(String[] args){

		int row= 6;
                
		char ch= 'A';

		for(int i=1;i<row;i++,ch++);

		for(int i=1;i<=row;i++){

			char ch1= ch;

			for(int j=1;j<i;j++,ch1--);

			for(int j=1;j<=i;j++){

				System.out.print(ch1+++" ");
			}
			System.out.println();
		}
	}
}

