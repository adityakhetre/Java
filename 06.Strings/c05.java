

class Demo{

	public static void main(String[] args){

		String s1= "Shashi";

		String s2= new String("Shashi");

		System.out.println(s1 == s2);				//compares idhashcode of s1 & s2 ( == )

		System.out.println(s1.equals(s2));			//compares text in string
	}
}
