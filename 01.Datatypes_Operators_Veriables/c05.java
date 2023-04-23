// logical operators (&&,||)

class Demo{

	public static void main(String[] args){

		int x=5;
		int y=7;

		//int ans= x && y;             //error: bad operand types for binary operator '&&'
		
		boolean ans1= x<y && x>y;
		boolean ans2= x<y || x>y;

		//System.out.println(ans);

		System.out.println(ans1);
		System.out.println(ans2);
	}
}
