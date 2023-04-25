//Write a program to print the square of even digits of the given number.
//Input: 942111423
//Output: 4 16 4 16

class Demo{

	public static void main(String[] args){

		int x= 942111423;

		while(x!=0)
		{
			int digit= x%10;

			if(digit%2==0)
			{
				System.out.print(digit*digit+" ");
			}
			x= x/10;
		}
		System.out.println();
	}
}
