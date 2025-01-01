
public class Main
{
    static String a="salekar"; 
    static String b="ROSHANI";
    
	public static void main(String[] args) {
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		System.out.println(b.concat(a));
		System.out.println(b.length());
		
		String c="     ANKUSH    ";
		String d="savi";
		
		System.out.println(c.trim());
		System.out.println(d.isEmpty());
		
		System.out.println(d.replace('s','r'));
		System.out.println(a.equals(b));
		
		System.out.println(d.charAt(2));
		System.out.println(d.indexOf('v'));
	}
}