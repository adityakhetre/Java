/*write a program to print the following pattern
 *F 5 D 3 B 1
 *F 5 D 3 B 1
 *F 5 D 3 B 1
 *F 5 D 3 B 1
 *F 5 D 3 B 1
 *F 5 D 3 B 1
 */

class Demo{

	public static void main(String[] args){

		int row= 6;
		char ch='A';

		for(int i=1;i<row;i++){
			ch++;
		}

		for(int i=1;i<=row;i++){

			char ch1= ch;
			int x= row;

			for(int j=1;j<=row;j++){

				if(j%2==0){
					System.out.print(x+" ");
				}
				else{
					System.out.print(ch1+" ");
				}
				ch1--;
				x--;
			}
			System.out.println();
		}
	}
}
