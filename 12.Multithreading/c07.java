abstract class Demo{

	public void gun(){
	}

}

class Demo1 extends Demo implements Runnable{

	public void run(){

	}

	public void gun(){
	}
}
class User{

	public static void main(String[] args){

		Demo1 obj = new Demo1();

		System.out.println("in main");
	
	}
}
