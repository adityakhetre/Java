/*Take choice from user
Show this to user
What's your interest?
1.movies
2.Series
Enter your choice 1 or 2 :
If user enters 1 :
Movie you wish to watch today
1.Founder
2. Snowden
3.Jobs
4.Her
5.Social Network
6.Wall-E
7.AI

Enter your choice :
2 : Snowden

If user enters 2 :
Best series to watch
1.Silicon valley
2.Devs
3.the IT crowd
4.Mr Robot
Print users choice*/


import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What's your interest?");
		System.out.println("1.movies");
		System.out.println("2.series");

		int c1= Integer.parseInt(br.readLine());

		switch(c1){

			case 1:{
				       System.out.println("Movie you wish to watch today");
				       System.out.println("1.Sir");
				       System.out.println("2.Kantara");
				       System.out.println("3.Bramhashtra");
				       System.out.println("4.Pathan");
				       System.out.println("5.Ved");
				       System.out.println("6.Mulshi Pattern");
				       System.out.println("7.Avengers");
				       
				       int c2= Integer.parseInt(br.readLine());

				       switch(c2){

					       case 1:{
							      System.out.println("Sir Loading..");
							      break;
					       }
					       case 2:{
                                                              System.out.println("Kantara Loading..");
                                                              break;
                                               }
					       case 3:{
                                                              System.out.println("Bramhashtra Loading..");
                                                              break;
                                               }
					       case 4:{
                                                              System.out.println("Pathan Loading..");
                                                              break;
                                               }
					       case 5:{
                                                              System.out.println("Ved Loading..");
                                                              break;
                                               }
					       case 6:{
                                                              System.out.println("Mulshi Pattern Loading..");
                                                              break;
                                               }
					       case 7:{
                                                              System.out.println("Avengers Loading..");
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
				       System.out.println("Best series to watch");
                                       System.out.println("1.Deman Slayer");
                                       System.out.println("2.Sacred Games");
                                       System.out.println("3.Squid Game");
                                       System.out.println("4.Death Note");
                                       System.out.println("5.Money Hiest");
                                       System.out.println("6.Lucifer");
                                       System.out.println("7.Asur");

				       int c2= Integer.parseInt(br.readLine());

				       switch(c2){

                                               case 1:{
                                                              System.out.println("Deman Slayer Loading..");
                                                              break;
                                               }
                                               case 2:{
                                                              System.out.println("Sacred Games Loading..");
                                                              break;
                                               }
                                               case 3:{
                                                              System.out.println("Squid Game Loading..");
                                                              break;
                                               }
                                               case 4:{
                                                              System.out.println("Death Note Loading..");
                                                              break;
                                               }
                                               case 5:{
                                                              System.out.println("Money Hiest Loading..");
                                                              break;
                                               }
                                               case 6:{
                                                              System.out.println("Lucifer Loading..");
                                                              break;
                                               }
                                               case 7:{
                                                              System.out.println("Asur Loading..");
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






