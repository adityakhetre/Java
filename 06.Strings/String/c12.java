class Demo{

	public static void main(String[] args){

		StringBuffer br= new StringBuffer("Shashi");

		System.out.println(System.identityHashCode(br));

		br= br.append("Bagal");

		System.out.println(br);

		System.out.println(System.identityHashCode(br));

	}
}
