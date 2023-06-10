//changing private variable in other class using constructor

class Player {

	private int jerNo = 18;					//private variable didn't visible in bytecode (declaration)

	private String pName = "virat";

	Player(int jNo, String name){				//Player(Player this,int jNo,String name)

		jerNo = jNo;					//changing private variable
								//here local variable and instance has different names
		pName = name;					//therefore no need of this keyword before instance variable
								//as this.jerNo = jNo;
								//but jerNo & jNo both name should same because they both indicate same thing
	}

	void info(){

		System.out.println(this);

		System.out.println("jersy no: "+jerNo);

		System.out.println("player name: "+pName);

		System.out.println(System.identityHashCode(pName));

	}
}

class Client{

	public static void main(String[] args){

		Player p1 = new Player(18,"virat");

		p1.info();

		Player p2 = new Player(45,"rohit");

		p2.info();

		String s1 = "rohit";

		System.out.println(System.identityHashCode(s1));

		s1 = "virat";

		System.out.println(System.identityHashCode(s1));
	}
}


