//call method of method local inner class from outside

class Demo{

	Demo m1(){

		class Inner extends Demo{

			Demo m1(){

				System.out.println("inner m1");

				return new Inner();
			}
		}

		return new Inner();
	}
}

class User{

	public static void main(String[] args){

		Demo obj = new Demo();

		Demo obj1 = obj.m1();

		obj1.m1();
	}
}


	
