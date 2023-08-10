//sleep		throws interrupted exception

class TDemo extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());

		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
		}
		gun();

	}
	void gun(){

		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());

		}
	}
}

class User{

	static void gun(){
                for(int i=0;i<10;i++){

                        System.out.println(Thread.currentThread().getName());

                }
	}
	public static void main(String[] args)throws InterruptedException{

		TDemo ob = new TDemo();

		ob.start();

		System.out.println(Thread.currentThread().getName());

		Thread.sleep(4000);

		gun();

	}
}
