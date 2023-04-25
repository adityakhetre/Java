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
		
		for(int i=day;i>=0;i--)
		{
			if(i>0)
                        {
                                System.out.println(i+" days remaining");
                        }
                        else
                        {
                                System.out.println(i+" days Assignment is Overdue");
                        }
		}
	}
}
