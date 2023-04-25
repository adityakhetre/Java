//Write a program to print the square of even digits of the given number.
//Input: 942111423
//Output: 4 16 4 16

class Demo{

	public static void main(String[] args){

		int x= 942111423;

		for(int i=x;i!=0;i=i/10)
		{
			int digit= i%10;

			if(digit%2==0)
			{
				System.out.print(digit*digit+" ");
			}
		}
		System.out.println();
	}
}
