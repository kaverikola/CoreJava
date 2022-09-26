package Stringthemprogram;

public class Stringtthemprogram {

	public static void main(String[] args) {
		String k="kaveri";
		System.out.println(k.equals("kaveri"));
		System.out.println(k.equalsIgnoreCase("kaveri"));
		
		String p="            am kaveri";
		System.out.println(k.trim());
		
		System.out.println(k.charAt(3));
		
		System.out.println(k.contains("kaveri"));
		
		System.out.println(k.toUpperCase());
		System.out.println(k.toLowerCase());
		
		System.out.println(k.equals(",!,@,"));
		
		StringBuffer p1=new StringBuffer("hiiii");
		StringBuilder p2=new StringBuilder("chinni");
		p1.append("how r u");
		p2.append("what u doing");
		System.out.println(p1);
		System.out.println(p2);
	}

}
