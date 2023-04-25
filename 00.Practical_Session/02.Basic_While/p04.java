//Write a program to count the Odd digits of the given number.
//Input: 942111423
//Output: count of odd digits = 5

class Demo{

	public static void main(String[] args){

		int x= 942111423;

		int count=0;

		while(x!=0)
		{
			int digit=x%10;

			if(digit%2==1)
			{
				count++;
			}
			x= x/10;
		}
		System.out.println("count of odd digits = "+count);
	}
}
