import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) {
    int a , b ;
    System.out.println("Enter two number ...");
    Scanner obj = new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    System.out.println("Logical  operator result  is true or false  ");
    System.out.println("Logical AND");
    System.out.println((a>b)&&(a>b));  // true
    System.out.println((a<b)&&(a<b));   //false
    System.out.println((a<b)&&(a>b));  // false
    
     System.out.println("Logical OR");
    System.out.println((a>b)||(a>b));  // true
    System.out.println((a<b)||(a<b));   //false
    System.out.println((a<b)||(a>b));  // true
    
     System.out.println("Logical NOT");
     System.out.println(!(a>b));  //false
        System.out.println(!(a<b)); //true
	}
}