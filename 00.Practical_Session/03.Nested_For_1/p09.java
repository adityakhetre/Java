/*write a program to print the following pattern
 *C B A
 *C B A
 *C B A
 */

class Demo{

	public static void main(String[] args){

		int row= 3;

		char ch='A';
		for(int i=1;i<row;i++){
			ch++;
		}

		for(int i=1;i<=row;i++){

			char ch1=ch;

			for(int j=1;j<=row;j++){

				System.out.print(ch1+" ");
				ch1--;
			}
			System.out.println();
		}
	}
}
