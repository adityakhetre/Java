//the call goes to that perticular constructor depends on how you create obj

class Demo{

	Demo(){										//Demo(Demo this)	//hidden parameter of type Demo

		System.out.println("hidden parameter");

	}

	Demo(int x){									//Demo(Demo this,int x)

                System.out.println("hidden parameter with integer parameter");

        }

	Demo(Demo x){									//Demo(Demo this,Demo x)

                System.out.println("hidden parameter with Demo parameter");

        }

	public static void main(String[] args){

		Demo obj1 = new Demo();							//Demo(obj1)

		Demo obj2 = new Demo(10);						//Demo(obj2,10)

		Demo obj3 = new Demo(obj1);						//Demo(obj3,obj1)

	}
}
