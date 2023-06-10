//perfect example of this

class Player{

	private String pType = "cricketer";

	private int jerNo = 0;

	private String pName = null;

	Player(String pType,int jerNo,String pName){	//seter method 


		pType = pType;				//here pType is local variable therefore no change in instance variable

		this.jerNo = jerNo;			//here this.jerNo is instance variable therefore instance variable change in every object

		this.pName = pName;			//here this.pName is instance variable therefore instance variable change in every object
	}

	void pInfo(){					//geter method

		System.out.println("player type: "+pType);

		System.out.println("jersy no: "+jerNo);

		System.out.println("player name: "+pName);
	}
}

class Demo{

	public static void main(String[] args){

		Player p1 = new Player("indian cricketer",18,"virat");

		p1.pInfo();

		Player p2 = new Player("S.A. cricketer",17,"ABD");

		p2.pInfo();

	}
}
