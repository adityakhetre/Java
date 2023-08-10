//
import java.io.*;

class StarDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("enter odd integer number: ");

		int x = Integer.parseInt(br.readLine());

		int y = x/2;

		for(int i= 1;i<= x;i++){

			for(int j= 1;j<= x;j++){

				if((x/2)+1 == j){

					System.out.print("* ");
				}
				else if((x/2)+1 == i){

                                                System.out.print("* ");
                                        }
				else if(i<= y && j<= y){
					if((j<= y-i+1)){

						System.out.print("  ");
					}
					else{
						System.out.print("* ");
					}
				}
				else if(i<= y && j>= y+2){
					
					int m= i,n= j-(y+1);

					if(m<=n){
						System.out.print("  ");
					}
					else{
                                                System.out.print("* ");
                                        }
				}
				else if(i>= y+2 && j<=y){

					int m= i-(y+1),n= j;

					if(n<=m){
						System.out.print("  ");
                                        }
                                        else{
                                                System.out.print("* ");
                                        }
				}
				else if(i>= y+2 && j>= y+2){

					int m= i-(y+2),n= j-(y+2);
					
					if(n< y-m-1){

						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}

			}
			System.out.println();
		}
	}
}
