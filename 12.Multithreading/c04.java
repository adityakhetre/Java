

class Parent extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());

	}
}

class Child extends Parent{

	public void run(){

		System.out.println(Thread.currentThread().getName());

		Parent obj = new Parent();

		obj.start();	
	}

}

class User{

	public static void main(String[] args){

		Child obj = new Child();

		obj.start();

		System.out.println(Thread.currentThread().getName());
	}
}
