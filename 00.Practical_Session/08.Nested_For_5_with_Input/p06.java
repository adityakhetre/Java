//write a program take input 2 characters if they are equal print as it is if different print difference

import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter first letter");
		char ch1= (char)br.read();

		char enter= (char)br.read();

		System.out.println("enter second letter");
		char ch2= (char)br.read();

		{
			int x=ch2-ch1;
	
			if(ch1==ch2)
			{
				System.out.println(ch1+","+ch2+" both are equal");
			}
			else
			{
				System.out.println("difference is: "+x);
			}
		}
		/*{
			//or
			int count=0;
			for(char a=ch1;a<ch2;a++)
			{
				count++;
			}
			if(count==0)
                        {
                                System.out.println(ch1+","+ch2+" both are equal");
                        }
                        else
                        {
                                System.out.println("difference is: "+count);
                        }
		}*/
	}
}
