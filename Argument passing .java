//simple types are  passed by value .
class test {
    
    void meth (int i ,int j){
        i *= 2 ;
        j /= 2;
    }
 
    }


public class Main
{
	public static void main(String[] args) {
	test ob = new test();
	int a =15 ;  int b = 20 ;
	System.out.println( "a  and b before call :"+ a +" "+b);
	ob .meth(a,b);
		System.out.println( "a  and b after  call :"+ a +" "+b);
	
		}
	}