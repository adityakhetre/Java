//realtime example
//

class IPL{

	int seasonNo = 16;

	void seasonInfo(){

		System.out.println("point table in season "+seasonNo);
		System.out.println("1.GT");
		System.out.println("2.CSK");
		System.out.println("3.LSG");
		System.out.println("4.MI");
	}
	public static void main(String[] args){

		IPL ops = new IPL();

		ops.seasonInfo();
	}
}


