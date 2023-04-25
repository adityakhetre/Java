//Write a program to reverse the given number.
//Input: 942111423
//Output: 324111249

class Demo{

	public static void main(String[] args){

		int x= 942111423;
		
		int rev=0;

		while(x!=0)
		{
			int digit= x%10;

			rev= rev*10+digit;

			x=x/10;
		}
		System.out.println(rev);
	}
}

