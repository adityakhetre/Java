// relational operators (<,>,<=,>=,==,!=)

class Demo{

	public static void main(String[] args){

		int x=10;
		int y=20;

		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x==y);
		System.out.println(x!=y);

		if(x<y)                            // in if statement block only condition or true,false keyword valid (boolean value)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Hii");
		}
	}
}
