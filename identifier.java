/* in java , an identifier is a name of a variable , method , class,package or interface that is used for the purpose os identification 

note :
1> keyword can not used as a identifier 
2> identifier is case sensitive 
3>we can not use whitespace in  between identifier 
4> identifier always start with letter , underscope _ ,$
*/

class A { // class  A is identifier 
    int a =10 ;   // variable a is identifier
    void  m1(){   // method  m1 is identifier
        System.out.println(a);
    }
}
public class Main  // main is identifier
{
	public static void main(String[] args) {
		A ref = new A();
		ref.m1();
	}
}