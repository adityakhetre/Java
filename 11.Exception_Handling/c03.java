//finally in exception handling

class Demo{

	void m1(){

		System.out.println("in m1");
	}

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.m1();

//		obj = null;

		try{
			obj.m1();
		}
		catch(NullPointerException e){

			System.out.println("exception ahe");
		}
		finally{
			System.out.println("stream closed");

			obj = null;
		}
	}
}




