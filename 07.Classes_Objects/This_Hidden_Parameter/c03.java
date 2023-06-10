//calling one constructor in another constructor is valid but it must be first statement & we can call only one constructor


class Demo{

	Demo(){

		//invokespecial first line to call constructor of class object	//implicitely call

	}

	Demo(int x){

		super();	//invokespecial first line to call constructor of class object	//explicitely call

		this();		//calling constructor Demo() 	//error: must be first statement

	}

	Demo(Demo x){

		this();         //calling constructor Demo()

		super();        //invokespecial first line to call constructor of class object  //explicitely call	//error: must be first statement

	}
}



