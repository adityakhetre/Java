/*write a program to print the following pattern
 *1 2 9
 *4 25 6
 *49 8 81
 */

class Demo{

	public static void main(String[] args){

		int row= 3,x= 1;
		
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(x%2==0){
					System.out.print(x+" ");
				}
				else{
					System.out.print(x*x+" ");
				}
				x++;
			}
			System.out.println();
		}
	}
}
