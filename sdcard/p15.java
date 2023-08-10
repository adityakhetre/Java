//ArrayList	-stores duplicate data
//		-stores any type of object
//		-dynamic size
//		-provides predefined methods

import java.util.*;

class ArrayListD extends ArrayList{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(10);					//add(E)
		al.add(10);
		al.add("adi");

		System.out.println(al);				//prints arrayList

		System.out.println(al.size());			//int size();

		System.out.println(al.indexOf(10));		//int indexOf(Object);

		System.out.println(al.lastIndexOf(10));		//int lastIndexOf(Object);

		System.out.println(al.contains("adi"));		//boolean contains(Object);

		System.out.println(al.get(2));			//E get(int);	E= Element

		System.out.println(al.set(2,"aditya"));		//E set(int, Object);	replace it adi replace by aditya

		System.out.println(al);

		al.add(2,"khetre");				//void add(int,E)

		System.out.println(al);

		System.out.println(al.remove(1));		//E remove(int);

		System.out.println(al.remove("khetre"));	//boolean remove(Object);

		System.out.println(al);

		System.out.println(al.toArray());		//Object[] toArray();


		ArrayListD ald = new ArrayListD();

		System.out.println(ald.addAll(al));		//boolean addAll(Collectin);

		System.out.println(ald.addAll(1,al));		//boolean addAll(int, Collectin); add at index provided

		System.out.println(ald);

		ald.removeRange(0,2);				//protected void removeRange(int, int);

		System.out.println(ald);

		ald.clear();					//void clear();

		System.out.println(ald);



	}
}





