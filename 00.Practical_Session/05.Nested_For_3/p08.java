/*write a program to print the following pattern
 *J
 *I H
 *G F E
 *D C B A
 */

class Demo{

	public static void main(String[] args){

		int row= 4,x= row*(row+1)/2;
		char ch= 'A';

		for(int i=1;i<x;i++,ch++);

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}
