/*write a program to print the following pattern
 *1
 *8 9
 *9 64 25
 *64 25 216 49
 */

class Demo{

        public static void main(String[] args){

                int row= 4,x1= 1;

                for(int i=1;i<=row;i++,x1++){

                        int x= x1;

                        for(int j=1;j<=i;j++,x++){

                                if(x%2==0){

                                        System.out.print(x*x*x+" ");
                                }
                                else{
                                        System.out.print(x*x+" ");
                                }
                        }
                        System.out.println();
                }
        }
}
