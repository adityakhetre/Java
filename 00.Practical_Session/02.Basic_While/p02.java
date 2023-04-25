//Write a program to calculate the factorial of the given number.
//Input: 6
//Output: factorial 6 is 720

class Demo{

	public static void main(String[] args){

		int x=6,y=x;
		int fact=1;

		while(x!=0)
		{
			fact= fact*x;
			
			x--;
		}
		System.out.println("factorial of "+y+" is "+fact);
	}
}
