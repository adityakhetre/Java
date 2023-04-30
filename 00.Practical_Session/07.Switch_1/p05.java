/*Write a real-time example that shows an nested switch*/

import java.io.*;

class Demo{

        public static void main(String[] args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.println("What's your interest?");
                System.out.println("1.In India");
                System.out.println("2.Foriegn");

                int choice1= Integer.parseInt(br.readLine());

                switch(choice1){

                        case 1:{
                                       System.out.println("popular destinations");
                                       System.out.println("1.New Delhi");
                                       System.out.println("2.Kedarnath");
                                       System.out.println("3.Rishikesh");
                                       System.out.println("4.Manali");
                                       System.out.println("5.Goa");
                                       System.out.println("6.Pune");

                                       int choice2= Integer.parseInt(br.readLine());

                                       switch(choice2){

                                               case 1:{
                                                              System.out.println("Exploring New Delhi");
                                                              break;
                                               }
                                               case 2:{
                                                              System.out.println("Exploring Kedarnath");
                                                              break;
                                               }
                                               case 3:{
							      System.out.println("Exploring Rishikesh");
                                                              break;
                                               }
                                               case 4:{
                                                              System.out.println("Exploring Manali");
                                                              break;
                                               }
                                               case 5:{
                                                              System.out.println("Exploring Goa");
                                                              break;
                                               }
                                               case 6:{
                                                              System.out.println("Exploring Pune");
                                                              break;
                                               }

                                               default :{
                                                                System.out.println("Invalid Choice");

                                                                main(null);

                                                                break;
                                               }
                                       }
                                       break;
                        }
                        case 2:{
                                       System.out.println("popular destimations");
                                       System.out.println("1.Las Vegas");
                                       System.out.println("2.Singapore");
                                       System.out.println("3.Hong Kong");
                                       System.out.println("4.Tokyo");
                                       System.out.println("5.Maldives");
                                       System.out.println("6.Bali");

				       int choice2= Integer.parseInt(br.readLine());

                                       switch(choice2){

                                               case 1:{
                                                              System.out.println("Exploring Las Vegas");
                                                              break;
                                               }
                                               case 2:{
                                                              System.out.println("Exploring Singapore");
                                                              break;
                                               }
                                               case 3:{
                                                              System.out.println("Exploring Hong Kong");
                                                              break;
                                               }
                                               case 4:{
                                                              System.out.println("Exploring Tokyo");
                                                              break;
                                               }
                                               case 5:{
                                                              System.out.println("Exploring Maldives");
                                                              break;
                                               }
                                               case 6:{
                                                              System.out.println("Exploring Bali");
                                                              break;
					       }
                                               default :{
                                                                System.out.println("Invalid Choice");

                                                                main(null);

                                                                break;
							}
				       }	
				       break;
                        }
                        default :{

					 System.out.println("Invalid Choice");
					 
					 main(null);

                                         break;
                        }
                }
        }
}




