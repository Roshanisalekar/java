class A
{
    int a, b , c;
    void add(){
        a = 10; b= 40;
        c = a + b ;
        System.out.println("addition of two number :"+ c);
    }
    
    void sub(){
        a = 100; b= 40;
        c =a-b;
        System.out.println("subtraction of  two number :"+c);
    }
}

class B extends A{
    void multi(){
        a = 100; b= 4;
        c=a*b;
        System.out.println("multiplication of two number :"+c);
    }
    void division(){
        a = 100; b= 2;
        c = a/b;
        System.out.println("division of  two number :"+c);
    }
}
class C extends B{
    void rem(){
        a = 100; b= 3;
        c = a%b;
        System.out.println("reminder of  two number :"+c);
    }
}
public class Main
{
	public static void main(String[] args) {
	 C r = new C();
	 r.add();
	 r.sub();
	 r.multi();
	 r.division();
	 r.rem();
	}
}