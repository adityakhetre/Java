//multithreading using thread class 

class Demo extends Thread{

	public void run(){

		for(int i= 0;i<10;i++){

			System.out.println("in run");
		}
	}
}

class User{

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.start();

		for(int i= 0;i<10;i++){

			System.out.println("in main");
		}
	}
}
