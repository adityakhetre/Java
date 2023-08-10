//handling exception using try-catch

class Demo{

	public static void main(String[] args{


		System.out.println("start main");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException obj){

			System.out.println("exception ahe");
		}

		System.out.println("end main");
	}
}
