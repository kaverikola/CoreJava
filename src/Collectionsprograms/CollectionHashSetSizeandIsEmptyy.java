package Collectionsprograms;

import java.util.HashSet;

public class CollectionHashSetSizeandIsEmptyy {

	public static void main(String[] args) {
		HashSet <String> hs=new HashSet<String>();
		hs.add("f");
		hs.add("p");
		hs.add("k");
		hs.add("r");
		hs.add("d");
		hs.add("t");
		hs.add("a");
		hs.add("g");
		hs.add("s");
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		HashSet<Integer> k=new HashSet<Integer>();
		k.add(111);
		k.add(2222);
		k.add(33333);
		k.add(444444);
		System.out.println(k);
		
		System.out.println(hs);
	}

}
