//Write a program which take’s number from user’s if number is even print that number in reverse order or if number is odd print that number in reverse order by difference two?
//Input:6
//output:6 5 4 3 2 1
//Input:7
//output:7 5 3 1

class Demo{

	public static void main(String[] args){

		int x= 7,y=x;

		while(x>0)
		{
			if(y%2==0)
			{
				System.out.print(x+" ");
			}
			else
			{
				System.out.print(x+" ");
				x--;
			}
			x--;
		}
		System.out.println();
	}
}

