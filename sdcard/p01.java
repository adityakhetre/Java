//method local inner class 	

class Demo{

	void fun(){

		class Inner{

			void m1(){
				System.out.println("in m1");
			}
		}
		Inner obj = new Inner();
		obj.m1();
	}
}

class User{

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun();
	}
}

