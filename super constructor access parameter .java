class A{
    A(int a ){
        System.out.println("constructor A  : "+a);
    }
    
}
class B extends A {
   
    B(){ 
        super(100);
        System.out.println("constructor B");
    }
    
}
public class Main
{
	public static void main(String[] args) {
		B r = new B();
	
	}
}