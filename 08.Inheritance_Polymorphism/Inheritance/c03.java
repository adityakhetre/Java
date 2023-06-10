//real time example

class Defence{

	static String dMinister = "Rajnath singh";

	String field = null;

	private String fieldMarshal = null;

	Defence(){
	}

	Defence(String field,String fieldMarshal){

		this.field = field;

		this.fieldMarshal = fieldMarshal;
	}

	void info(){

		System.out.println("defence minister: "+dMinister);

		System.out.println("field: "+field);

		System.out.println("field marshal: "+fieldMarshal);
	}

}
class Army extends Defence{


	Army(){

		super("army","K.M.Cariappa");
	}
}

class AirForce extends Defence{

	AirForce(){

		super("air force","V.R.Choudhari");
	}
}

class Navy extends Defence{

	Navy(){

		super("navy","Admiral Karambir Singh");
	}
}

class User{

	public static void main(String[] args){

		Defence usr1 = new Army();

		Defence usr2 = new AirForce();

		Defence usr3 = new Navy();

		System.out.println("______"+usr1.field+"______");

		usr1.info();

		System.out.println();

		System.out.println("______"+usr2.field+"______");

		usr2.info();

		System.out.println();

		System.out.println("______"+usr3.field+"______");

		usr3.info();
	}
}




