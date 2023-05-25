/* A 1 B 2
 * A 3 B 4
 * A 5 B 6
 */

class Demo{

	public static void main(String[] args){

		int a = 1;

		for(int i=1;i<=3;i++){

			char ch = 'A';

			for(int j=1;j<=4;j++){

				if(j%2==1){

					System.out.print(ch++ +" ");
				}
				else{
					System.out.print(a++ +" ");
				}
			}
			System.out.println();
		}
	}
}
