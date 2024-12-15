class A{
    void add(){
        int a , b ,c ;
        a= 10; b = 30;
        c = a + b ;
        System.out.println(c);
    }
      void add(int x , int y){
          int c ;
        c = x + y ;
        System.out.println(c);
    }
       void add(int x , double y){
           double c ;
        c = x + y ;
        System.out.println(c);
    }
}
public class Main
{
	public static void main(String[] args) {
	A r = new A();
	r.add();
	r.add(500,500);
	r.add(45,45.45);
	}
}