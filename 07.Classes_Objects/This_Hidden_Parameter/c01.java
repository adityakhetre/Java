//x get declared in all constructors but initialized in only one constructor by which we are creating object


class Demo{

	int x = 10;

	static int y = 20;


	Demo(){								//Demo(Demo this)

		/* here there is no local variable present 
		 * therefore we can directiy access instance variable as x
		 */

		System.out.println("One hidden parameter");

		System.out.println(x);					//this.x internaly 

	}

	Demo(int x,int y){							//Demo(Demo this, int x,int y)

		/* here int x is local variable as well as instance variable 
		 * to access instance variable need to access as this.x
		 * to access local variable it can directly as x
		 */ 
		

		System.out.println("one hidden + int x + int y parameter");

		System.out.println(x);					//accessing local variable

		System.out.println(this.x);				//accessing instance variable
									
		System.out.println(y);					//accessing local variable

		System.out.println(this.y);				//accessing static variable

		System.out.println(Demo.y);				//accessing static variable

	}

	public static void main(String[] args){

		Demo obj1 = new Demo();					//x initialized in Demo()

		Demo obj2 = new Demo(100,200);				//x initialized in Demo(int x)

	}
}



