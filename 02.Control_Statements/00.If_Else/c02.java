//if_else statements

class Demo{

	public static void main(String[] args){

		{
			//input: x & y where x!=y
			//print max number between x & y

			int x=5;
			int y=7;

			if(x<y)
			{
				System.out.println("Maximum Number is: "+ y);
			}
			else
			{
				System.out.println("Maximum Number is: "+ x);
			}
		}
		{
			//input: x
			//print whether x is divisible by 4 or not

			int x=10;

			if(x%4==0)
			{
				System.out.println(x +" is divisible by 4");
			}
			else
			{
				System.out.println(x +" is not divisible by 4");
			}
		}
		{
			//input: x
			//print whether x is even or odd
			
			int x=7;

			if(x%2==0)
			{
				System.out.println(x +" is even number");
			}
			else
			{
				System.out.println(x +" is odd number");
			}
		}
		{
			//input: unit
			//print bill amount 
			//unit<= 100 : per unit 1rs
			//unit>100 : upto 100 unit per unit 1rs above 100 unit per unit 2rs

			int unit=200;

			if(unit<= 100)
			{
				System.out.println("bill amount is: "+ unit);
			}
			else
			{
				System.out.println("bill amount is: "+ (100+(unit-100)*2));
			}
		}
	}
}

