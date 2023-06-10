class Demo{

        public static void main(String[] args){

                String s1= "Core2Web";                          //stores at String constant pool(scp)

                String s2= new String("Core2Web");              //stores at heap section

                char[] s3= {'C','2','W'};                       //stores at heap section

                System.out.println(System.identityHashCode(s1));
                System.out.println(System.identityHashCode(s2));
                System.out.println(System.identityHashCode(s3));

		s2 = s1;

		System.out.println(System.identityHashCode(s2));

		s2 = "Core2Web";

		System.out.println(System.identityHashCode(s2));
        }
}
