/*write a program to print the following pattern
 *d d d d
 *c c c c
 *b b b b
 *a a a a
 */

class Demo{

	public static void main(String[] args){

		int row=4;
		char ch='a';

		for(int i=1;i<row;i++){
			ch++;
		}

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				System.out.print(ch+" ");
			}
			System.out.println();
			ch--;
		}
	}
}
