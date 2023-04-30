/*write a program to print the following pattern
 *
 *10
 *I H
 *7 6 5
 *D C B A
 */

class Demo{

	public static void main(String[] args){

		int row= 4,x= row*(row+1)/2;

		char ch= 'A';

		for(int i=1;i<x;ch++,i++);

		for(int i=1;i<=row;i++){

			if(row%2==0){

				for(int j=1;j<=i;j++,x--,ch--){

					if(i%2==0){
						System.out.print(ch+" ");
					}
					else{
						System.out.print(x+" ");
					}
				}
			}
			else{
				for(int j=1;j<=i;j++,x--,ch--){

                                        if(i%2==1){
                                                System.out.print(ch+" ");
                                        }
                                        else{
                                                System.out.print(x+" ");
                                        }
                                }
			}
			System.out.println();
		}
	}
}



