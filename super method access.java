class A{
    void show(){
        System.out.println("method access super class ");
    }
    
}
class B extends A {
   
    void show(){
        super.show();
        System.out.println("method access sub class ");
    }
    
}
public class Main
{
	public static void main(String[] args) {
		B r = new B();
		r.show();
	}
}