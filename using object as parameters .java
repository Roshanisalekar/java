//object  may be passed to methods
class test {
    int a, b;
    test (int i ,int j){
        a = i ;
        b= j;
    }
    //return true if o is equal to the invoking object 
    boolean equal (test o){
        if (o.a == a && o.b==b ) 
            return true;
            else return false;
        }
    }


public class Main
{
	public static void main(String[] args) {
		//create boxes using the various constructors
		test ob1 = new test (100,22);
		test ob2= new test(100,22);
		test ob3 = new test (-1,-1);
		System.out.println("ob1 == ob2 : "+ ob1.equal(ob2));
			System.out.println("ob2 == ob3 : "+ ob2.equal(ob3));

		 
		}
	}