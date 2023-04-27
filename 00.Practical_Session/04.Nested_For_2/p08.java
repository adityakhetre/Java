/*write a program to print the following pattern
 *A b C d
 *E f G h
 *I j K l
 *M n O p
 */

class Demo{

	public static void main(String[] args){

		int row= 4;
		char ch1='A',ch2='a';

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(j%2==0){
					System.out.print(ch2+" ");
				}
				else{
					System.out.print(ch1+" ");
				}
				ch1++;
				ch2++;
			}
			System.out.println();
		}
	}
}
