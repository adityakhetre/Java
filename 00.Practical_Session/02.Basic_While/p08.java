//Write a program to print the countdown of days to submit the assignment
//Input : day = 7
//Output: 
//7 days remaining
//6 days remaining
//.
//.
//1 days remaining
//0 days Assignment is Overdue

class Demo{

	public static void main(String[] args){

		int day= 7;

		while(day>=0)
		{
			if(day>0)
			{
				System.out.println(day+" days remaining");
			}
			else
			{
				System.out.println(day+" days Assignment is Overdue");
			}
			day--;
		}
	}
}
