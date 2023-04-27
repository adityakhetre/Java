/*write a program to print the following pattern
 *1A 2B 3C
 *1A 2B 3C
 *1A 2B 3C
 */

class Demo{

	public static void main(String[] args){

		int row=3;

		for(int i=1;i<=row;i++){

			char ch='A';

			for(int j=1;j<=row;j++){

				System.out.print(j+""+ch+" ");

				ch++;
			}
			System.out.println();
		}
	}
}
