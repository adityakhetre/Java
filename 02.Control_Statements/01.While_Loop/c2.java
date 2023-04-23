//while loop

class Demo{

	public static void main(String[] args){

		{
			//print 1 to 10 numbers
			System.out.println("1 to 10 numbers");
			int i=1;				//initialization

			while(i<=10)				//condition
			{
				System.out.println(i++);	//body with increment/decrement
			}
		}
		{
			//print 8 to 1 numbers
			System.out.println("8 to 1 numbers");
			int i=8;

			while(i>=1)
			{
				System.out.println(i--);
			}
		}
		{
			//print odd integers from 1 to n
			System.out.println("1 to n odd numbers");
			int n=12;
			int i=1;

			while(i<=n)
			{
				System.out.println(i);

				i=i+2;

				/* or
				 * if(i%2==1)
				 * {
				 * 	System.out.println(i);
				 * }*/
			}
		}
		{
			//print multiple of 4 upto n
			System.out.println("multiple of 4 upto n");
			int n=25;
			int i=4;

			while(i<=n)
			{
				System.out.println(i);
				i=i+4;
			}
		
		}
		{
			//print perfect square till n
			System.out.println("print perfect square till n");
			int i=1;
			int n=50;

			while(i<=n)
			{
				if(i*i<=n)
				{
					System.out.println(i*i);
				}
				i++;
			}
			/* or
			 * while(i*i<=n)
			 * {
			 * 	System.out.println(i*i);
			 * 	i++;
			 * }*/
		}

	}
}
