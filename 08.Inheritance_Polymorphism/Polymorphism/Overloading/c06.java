

class Demo{

	void fun(byte x){

		System.out.println("fun(byte)");
	}

	void fun(short x){

                System.out.println("fun(short)");
        }

	void fun(char x){

                System.out.println("fun(char)");
        }

	void fun(int x){

                System.out.println("fun(int)");
        }

	void fun(float x){

                System.out.println("fun(float)");
        }

/*	void fun(long x){

                System.out.println("fun(long)");
        }
*/
	void fun(double x){

                System.out.println("fun(double)");
        }

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun(11111111l);
	}
}

