package Exceptionprograms;


		class MySql{
			static {
				System.out.println("Mysql static block");
			}
		}
		 
		public class Exceptionfornaemdemoprogram {

			static {
				System.out.println("static class ");
			}
			public static void main(String[] args)  throws ClassNotFoundException{
				System.out.println("static method");
				Class.forName("MySql");
				
			}

		

	}


