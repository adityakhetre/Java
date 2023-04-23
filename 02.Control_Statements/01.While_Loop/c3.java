//while loop extraction of digits from number n

class Demo{

	public static void main(String[] args){

		{
			//extraction of digits
			System.out.println("extraction of digits");
			int n=4532;
			
			while(n!=0)
			{
				int x=n%10;
				System.out.println(x);			//2/n3/n5/n4/n
				n=n/10;
			}
		
		}
		{
			//sum of extracted digits
			System.out.println("sum of extracted digits");
			int n=653;
			int sum=0;

			while(n!=0)
			{
				int x=n%10;
				sum=sum+x;
				n=n/10;
			}
			System.out.println(sum);			//15
		}
		{
			//multiply of extracted digits
			System.out.println("multiply of extracted digits");
			int n=135;
			int mult=1;

			while(n!=0)
			{
				int x=n%10;
				mult=mult*x;
				n=n/10;
			}
			System.out.println(mult);			//15
		}
		{
			//reverse the number
			System.out.println("reverse the number");
			int n=123;
			int rev=0;

			while(n!=0)
			{
				int x=n%10;
				rev=rev*10+x;
				n=n/10;
			}
			System.out.println(rev);			//321
		}

	}
}
