// object are passed by reference 
class test {
    int a;
    int b;
    
    test(int i ,int j){
        a = i ;
        b= j;
    }
    //pass an object
        void meth (test o){
        o.a *= 2 ;
        o.b /= 2;
    }
 }


public class Main
{
	public static void main(String[] args) {
	test ob = new test(15,20);

	System.out.println( "o.a  and o.b before call :"+ ob.a +" "+ob.b);
	ob .meth(ob);
    System.out.println( "o.a  and o.b after  call :"+ob.a +" "+ob.b);
	
		}
	}