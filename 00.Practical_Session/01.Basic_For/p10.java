//Write a program to print the product of the first 10 numbers

class Demo{

	public static void main(String[] args){

		int x=10,mult=1;

		for(int i=1;i<=x;i++)
		{
			mult=mult*i;
		}
		System.out.println("product of the first 10 numbers is "+mult);
	}
}
