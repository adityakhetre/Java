class Demo{

        int x = 10;

        Demo(){                                                         //Demo(Demo this)

                System.out.println("in constructor");

                System.out.println(x);                                  //x goes as this.x

                System.out.println(this);

		System.out.println(this.x);

        }

	void fun(){							//fun(Demo this)

		System.out.println("in fun");

                System.out.println(x);                                  //x goes as this.x

                System.out.println(this);

                System.out.println(this.x);
	}

        public static void main(String[] args){

                Demo obj = new Demo();                                  //Demo(obj)             //where obj is referance of object

		obj.fun();
		
        }
}
