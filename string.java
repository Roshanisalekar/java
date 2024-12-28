
public class Main
{
	public static void main(String[] args) {
	    // String literal
	    
		String a= "roshani"; //literal
		System.out.println(a);
	    String b= "roshani"; //literal
		System.out.println(b);
		a.concat("salekar");  // String is immutable 
		System.out.println(a);
		a=a.concat(" salekar"); 
		System.out.println(a);
		
		// new keyword
		 String c = new String("savita");
		 System.out.println(c);
		 String d = new String("savita");
		 System.out.println(d);
         c=c.concat(" salekar");// String is immutable 
		 System.out.println(c);
		
	}
}