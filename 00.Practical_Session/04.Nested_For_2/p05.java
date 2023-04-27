/*write a program to print the following pattern
 *26 Z 25 Y
 *24 X 23 W
 *22 V 21 U
 *20 T 19 S
 */

class Demo{

	public static void main(String[] args){

		int row= 4,x= 26;
		char ch= 'Z';

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(j%2==0){
					System.out.print(ch+" ");
					ch--;
				}
				else{
					System.out.print(x+" ");
					x--;
				}
			}
			System.out.println();
		}
	}
}
