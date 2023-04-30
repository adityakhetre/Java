/*write a program to print the following pattern
 *
 *F
 *E 1
 *D 2 E
 *C 3 D 4
 *B 5 C 6 D
 *A 7 B 8 C 9
 */

class Demo{

	public static void main(String[] args){

		int row= 6,x= 1;

		char ch= 'A';

		for(int i=1;i<row;i++,ch++);

		for(int i=1;i<=row;i++,ch--){

			char ch1= ch;

			for(int j=1;j<=i;j++){

				if(j%2==0){

					System.out.print(x+" ");
					x++;
				}
				else{
					System.out.print(ch1+" ");
					ch1++;
				}
			}
			System.out.println();
		}
	}
}



