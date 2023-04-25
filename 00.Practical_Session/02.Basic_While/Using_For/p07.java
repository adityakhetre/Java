//Write a program which take’s number from user’s if number is even print that number in reverse order or if number is odd print that number in reverse order by difference two?
//Input:6
//output:6 5 4 3 2 1
//Input:7
//output:7 5 3 1

class Demo{

        public static void main(String[] args){

                int x= 6;
		
		if(x%2==0)
		{
			for(int i=x;i>0;i--)
			{
				System.out.print(i+" ");
			}
		}
		else
		{
			for(int i=x;i>0;i=i-2)
                        {
                                System.out.print(i+" ");
                        }
		}
		System.out.println();
	}
}


