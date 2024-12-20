import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) {
    int a , b ;
    System.out.println("Enter two number ...");
    Scanner obj = new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    System.out.println("Relational  operator  result is true or false ");
    System.out.println(a>b);
        System.out.println(a<b);
            System.out.println(a<=b);
                System.out.println(a>=b);
                    System.out.println(a==b);
                        System.out.println(a!=b);
    
	}
}
