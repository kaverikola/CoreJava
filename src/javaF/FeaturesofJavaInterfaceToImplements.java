package javaF;

public interface  FeaturesofJavaInterfaceToImplements {
		public void m();
		static void m2() {
			System.out.println("this is the static method");
		
	}
		default void m3() {
			System.out.println("this is the default method..");
		}
	

	}
	

	