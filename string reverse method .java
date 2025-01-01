
public class Main
{
	public static void main(String[] args) {
    int length;
    //method 1 
    StringBuffer r = new StringBuffer("java coding");
    System.out.println(r.reverse());
    
    // method 2
    StringBuilder ref = new StringBuilder("coding");
    System.out.println(ref.reverse());
    
    //method 3
    String a="python coding";
    String b="";
    length= a.length();
    for(int i=length-1;i>=0;i--){
        b=b+a.charAt(i);
    }
    System.out.println(b);
	}
}