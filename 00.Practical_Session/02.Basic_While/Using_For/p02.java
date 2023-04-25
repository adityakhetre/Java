//Write a program to calculate the factorial of the given number.
//Input: 6
//Output: factorial 6 is 720

class Demo{

	public static void main(String[] args){

		int x=6;
		int fact=1;

		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+x+" is "+fact);
	}
}
