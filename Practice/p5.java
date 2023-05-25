//accessing static & non-static methods in other class with or without object

class Bank{

	static String[] newUpdate = {"RBI","announced","to","ban","2000","notes","from","sept"};

	String bankName = "SBI";

	static void notices(){

		for(int i = 0;i<newUpdate.length;i++){

			System.out.print(newUpdate[i]+" ");
		}
		System.out.println();
	}

	void bankInfo(){

		System.out.println(bankName+" bank exchanges 10 notes of 2000 rs at a time.");
	}
}

class Users{

	public static void main(String[] args){

		Bank SBI = new Bank();

		Bank.notices();

		SBI.bankInfo();
	}
}



