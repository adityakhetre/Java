//if_else ladder

class Demo{

	public static void main(String[] args){

		{
			//input: x & y
			//print max between x & y
			//if x==y print both are equal

			int x=10;
			int y=20;

			if(x==y)
			{
				System.out.println(x+" & "+y+"both are equal");
			}
			else if(x>y)
			{
				System.out.println(x +" is greater");
			}
			else
			{
				System.out.println(y +" is greater");
			}
		}
		{
			//input: temperature in f
			//print
			//temp>98.6 high
			//98.0<=temp<=98.6 normal
			//temp<98.0 low

			float temp=92.6f;

			if(temp>98.6)
			{
				System.out.println("high temperature");
			}
			else if(temp<98.0)
			{
				System.out.println("low temperature");
			}
			else
			{
				System.out.println("normal tempereture");
			}
		}
		{
			//input: x
			//print
			//x divisible by 3 & 5 print: fizz-buzz
			//x divisible by 3 print: fizz
			//x divisible by 5 print: buzz

			int x=15;

			if(x%3==0 && x%5==0)                    //sequance matters in this example 
			{
				System.out.println("fizz-buzz");
			}
			else if(x%3==0)
			{
				System.out.println("fizz");
			}
			else if(x%5==0)
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println("invalid");
			}
		}
	}
}


