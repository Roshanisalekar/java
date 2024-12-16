class A{
    private int value ;
    void setValue(int x){
        value = x ;
    }
    int getValue(){
        return value+2 ;
    }
}

public class Main
{
	public static void main(String[] args) {
		A r = new A();
		r.setValue(100);
		System.out.println(r.getValue());
		}
}