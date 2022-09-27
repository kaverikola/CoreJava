package Collectionsprograms;
class Sample<k>{
	void show(k a) {
		System.out.println(a);
	}
}


public class CollectionsGenericdemo {

	public static void main(String[] args) {
		Sample <Integer>i=new Sample<Integer>();
		i.show(200);
		i.show(20);
		
		Sample <Double>p=new Sample<Double>();
		p.show(20.9);
		p.show(2.0);
		
		Sample <Character>l=new Sample<Character>();
		l.show('o');
		l.show('m');
		
		Sample <String>q=new Sample<>();
		q.show("kaveri");
		q.show("kola");

		Sample <Float>r=new Sample<Float>();
		r.show(0.2f);
		r.show(20f);

	}

}
