class A{
    A(){
        System.out.println("constructor A");
    }
    
}
class B extends A {
   
    B(){ 
        //defualt  : super();
        System.out.println("constructor B");
    }
    
}
public class Main
{
	public static void main(String[] args) {
		B r = new B();
	
	}
}