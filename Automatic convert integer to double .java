// automatic type conversion apply to overloading.
class overloademo{
    void test (){
        System.out.println("No parameters");
    }
   
      // overload test for two  integer parameter.
    void test (int a,int b){
        System.out.println("a and b : " +a+ " " +b);
    } 
    double test (double a ){
        System.out.println("double a : " +a);
        return a * a ;
     }
    }

public class Main
{
	public static void main(String[] args) {
	    overloademo ob = new overloademo();
	    double result;
	    int i = 88;
	    //call all version of test()
	    ob.test();
        ob.test(5,5);
	    ob.test(i);
	    result = ob.test(123.25);
		System.out.println("Result of ob.test (123.25) :"+result);
	}
}