//linear search in string

class Demo{

	static boolean lSearch1(String str,char sEle){

		if(str.length() == 0)
			return false;

		for(int i=0;i<str.length();i++){

			if(str.charAt(i) == sEle)
				return true;

		}
		return false;
	}

	static boolean lSearch2(String str,char sEle){

		if(str.length() == 0)
                        return false;

		for(char ch: str.toCharArray()){
			
			if(ch == sEle)
				return true;
		}
		return false;
	}

	public static void main(String[] args){

		String st = "Aditya";

		System.out.println(lSearch1(st,'a'));
		System.out.println(lSearch1(st,'x'));
	}
}
