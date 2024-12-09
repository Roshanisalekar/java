class A
{
     void input(){
       
        System.out.println("Enter your name :");
    }
}

class B extends A{
    void show(){
        System.out.println("my name is roshani");
 
    }
}
class C extends A{
      void show(){
        System.out.println("my name is ankush");
 
    }
}
public class Main
{
	public static void main(String[] args) {
	B r = new B();
	C r2 = new C();
    r.input(); r.show();
    r2.input(); r2.show();
    
	}
}