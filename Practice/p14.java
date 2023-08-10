//star design

import java.io.*;

class StarDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("enter odd integer number: ");

                int x = Integer.parseInt(br.readLine());

                int y = x/2;

                for(int i= 1;i<= x;i++){

                        for(int j= 1;j<= x;j++){

                                if(i == j){
                                        System.out.print("* ");
                                }
				else if(i+j == x+1){
					System.out.print("* ");
				}

                                else if((x/2)+1 == j){
                                        System.out.print("* ");
                                }
                                else if((x/2)+1 == i){
                                        System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
