//same functionality different forms

class Demo{

	private int x = 10;

	Demo(){						//Demo()

		System.out.println(x);
	}
	Demo(int x){					//Demo(int)

		this.x = x;

		System.out.println(x);
	}
}

class User{

	public static void main(String[] args){

		Demo obj = new Demo();			//call Demo() according to method signuature

		Demo obj1 = new Demo(50);		//call Demo(int) according to method signuature

	}
}
