//Write a program to count the digits of the given number.
//Input: 942111423
//Output: count of digits = 9

class Demo{

	public static void main(String[] args){

		int x= 942111423;

		int count=0;

		for(int i=x;i!=0;i=i/10)
		{
			count++;
		}
		System.out.println("count of digits = "+count);
	}
}
