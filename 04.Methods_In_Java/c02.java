//static &non-static variables & methods

class Demo{

	int x= 10;								//non-static variable		//global

	static int y=20;							//static variable		//global

	static Demo ob= new Demo();                                             //we can make object static

	void fun(){								//non-static method

		System.out.println("in fun");

		gun();								//access static method in non-static method is valid

		System.out.println(x);						//access non-static variable in non-static method is valid

		System.out.println(y);						//access static variable in non-static method is valid

		y++;
	}
	static void gun(){							//static method

		//Demo ob= new Demo();						//creating obj

		System.out.println("in gun");

                System.out.println(ob.x);					//access non-static variable in static method need obj

		ob.x++;

		System.out.println(ob.x);

                System.out.println(y);						//access static variable in static method is valid
	}
	public static void main(String[] args){

		//Demo ob= new Demo();						//obj created

		Demo obj= new Demo();

		ob.fun();							//access non-static method in static method using obj is only option

		ob.gun();							//access non-static method in static method using obj also valid

                System.out.println(ob.x);					//access non-static variable in static method need obj

		ob.x++;

		System.out.println(ob.x);

		System.out.println(obj.x);

                System.out.println(y);						//access static variable in static method need obj
	}
}


