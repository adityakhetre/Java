class MyThread extends Thread{ 

	MyThread(ThreadGroup tg, String str){ 

		super(tg, str);
	}

	public void run(){

		System.out.println(Thread.currentThread());
	}
}

class ThreadGroupDemo{ 

	static Thread th = Thread.currentThread();

	public static void main(String[] args){

		ThreadGroup pThreadGP=new ThreadGroup ("Core2w"); 

		ThreadGroup tgp = new ThreadGroup(pThreadGP,"adi");

		MyThread obj1=new MyThread (pThreadGP, "c");

		obj1.start();

		System.out.println(pThreadGP.activeCount()); 

		System.out.println(pThreadGP.activeGroupCount());
	}
}
