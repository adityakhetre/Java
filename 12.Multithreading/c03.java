//multithreading using interface

class Demo implements Runnable{

	public void run(){

		System.out.println("in run");

		System.out.println(Thread.currentThread().getName());
	}
}

class User{

	public static void main(String[] args){

		Demo obj = new Demo();

		Thread t = new Thread(obj);

		t.start();

		System.out.println("in main");

		System.out.println(Thread.currentThread().getName());
	}
}

