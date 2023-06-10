/*method signature    //method table is create by compiler which didnt allow methods with duplicate name & parameters ignoring return type
 *
 * |----------------------------|
 * | Method Table               |
 * |----------------------------|
 * | Demo()                     |
 * |----------------------------|
 * | Demo()                     |	//error
 * |----------------------------|
 * | fun(int)                   |
 * |----------------------------|
 * | fun(int)                   |	//error
 * |----------------------------|
 */

class Demo{


	Demo(){

		System.out.println("Cnstructor 1");
	}

	/*Demo(){							//error: constructor Demo() is already defined in class Demo

		System.out.println("Cnstructor 2");
	}*/

	int fun(int x){

		System.out.println("fun 1");

		return x;
	}

	/*void fun(int y){					//error: method fun(int) is already defined in class Demo

		System.out.println("fun 2");
	}*/
}



