package CollectionMapPrograms;

import java.util.TreeMap;

public class CollectionsMapEntryPrograms {

	public static void main(String[] args) {
		TreeMap<Integer,String> k=new TreeMap<Integer,String>();
		k.put(22, "Roll number");
		k.put(33, "Roll number");
		k.put(44, "Roll number");
		k.put(55, "Roll number");
		k.put(66, "Roll number");
		System.out.println(k);
		Set<Entry>Integer,String>> s=new k.entrySet();
		Integer<Entry<Integer,String>> i=new s.iterator();
		
		while (i.hashNext()) {
		Entry<Integer,String> ee=i.next();
		System.out.println(ee.getKey()+" "+ee.getValue());
	}

}
}