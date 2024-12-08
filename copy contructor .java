class A {
     int a ;
    String b;
    A()
    {
    int a =10; 
    String b ="roshani";
    System.out.println(a+" "+b);
    }
    A(A ref){
        a = ref.a;
        b = ref.b;
        System.out.println(a+" "+b);
        
    }
}
public class Main
{
	public static void main(String[] args) {
		A r =new A();
	    A r2 = new A(r);
	}
}