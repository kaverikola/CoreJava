package JavaFeaturesPrograms;

import java.util.Optional;



public class OptionalClassProgram {

	public static void main(String[] args) {
		String[] str=new String[5];
		str[0]="core";
		Optional<String> c=Optional.ofNullable(str[0]);
		if(c.isPresent()) {
			System.out.println(str[0].length());
			
		}else {
			System.out.println("this is null");
		}
		System.out.println(" first Statement-1");
		System.out.println("second Statement-2");
		
		System.out.println(" third Statement-3");
		System.out.println(" four Statement-4");
		System.out.println(" five Statement-5");
		
		System.out.println(" six Statement-6");
	    System.out.println(" seven Statement-7");
		
	    
	    
	}

}
