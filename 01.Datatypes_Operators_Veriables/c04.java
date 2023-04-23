// unary operators (+,-,++,--)

class Demo{

	public static void main(String[] args){

		{
			int x=10;
			int y=20;

			System.out.println(x++);      //10
			System.out.println(y++);      //20
			System.out.println(x--);      //11
			System.out.println(y--);      //21
			System.out.println(x);        //10
			System.out.println(y);        //20
		}

		{
			int x=5;
                	int y=7;

                	System.out.println(++x);      //6
                	System.out.println(++y);      //8
                	System.out.println(--x);      //5
                	System.out.println(--y);      //7
		}

		{
                        int x=8;
                        int y=5;

			int ans1= ++x + x++;
			int ans2= --y + y--;

                        System.out.println(ans1);     //18
                        System.out.println(ans2);     //8
                        System.out.println(x);        //10
                        System.out.println(y);        //3
                }

		{
                        int x=10;
                        int y=20;

			int ans= ++x + y++ + x++;

                        System.out.println(x);        //12
                        System.out.println(y);        //21
                        System.out.println(ans);      //42
                }
	}
}
