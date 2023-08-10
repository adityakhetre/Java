class Parent extends Thread{

	public void run(){

		System.out.println("In parent run"); 

		System.out.println(Thread.currentThread().getName());
	}
}

class Child extends Parent implements Runnable{

	public void run(){

		System.out.println("In Child run"); 

		System.out.println(Thread.currentThread().getName());

		Parent obj=new Parent();

		obj.start();
	}

}

class ThreadDemo{

	public static void main(String[] krish) {

		System.out.println(Thread.currentThread().getName());

		Child obj=new Child(); 

		Thread t = new Thread(obj);

		t.start();
	}

}
