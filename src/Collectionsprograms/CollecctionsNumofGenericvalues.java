package Collectionsprograms;
class Gp<p,s,f>{

	
			void pandu(p  a,s b,f c  ) {
				System.out.println("This is the ############### "+a);
				System.out.println("This is the$$$$$$$$$$$$$$$$$$$$  "+b);
				System.out.println("This is the %%%%%%%%%%%%%%%%%%%%%   "+c);
				
			}
		}
	public class CollecctionsNumofGenericvalues {

			public static void main(String[] args) {
				 Gp<String,Integer,Float> omg=new Gp<String,Integer,Float>();
				omg.pandu("kola",12,8.5f);
				System.out.println("______________________");
				omg.pandu("my roll number", 209, 3f);

				Gp<Character,Integer,Double> insta=new Gp<Character,Integer,Double>();
				insta.pandu('k', 12, 3.5);
				System.out.println(insta);
			}

		}


	


