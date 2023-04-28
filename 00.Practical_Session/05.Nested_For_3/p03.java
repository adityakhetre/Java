/*write a program to print the following pattern
 *10
 *9 8
 *7 6 5
 *4 3 2 1
 */

class Demo{

        public static void main(String[] args){

                int row= 4;
		int d= row*(row+1)/2;

                for(int i=1;i<=row;i++){

                        for(int j=1;j<=i;j++){

                                System.out.print(d+" ");
                                d--;
                        }
                        System.out.println();
                }
        }
}
