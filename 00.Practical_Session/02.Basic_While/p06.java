//Write a program to print the sum of all even numbers and multiplication of odd numbers between 1 to 10.
//Output:
//sum of even numbers between 1 to 10 = 30
//Multiplication of odd numbers between 1 to 10 = 945

class Demo{

	public static void main(String[] args){

		int i=1,x=10;

		int sum=0,mult=1;

		while(i<=10)
		{
			if(i%2==0)
			{
				sum= sum+i;
			}
			else
			{
				mult= mult*i;
			}
			i++;
		}
		System.out.println("sum of even numbers between 1 to 10 = "+sum);

		System.out.println("Multiplication of odd numbers between 1 to 10 = "+mult);
	}
}

