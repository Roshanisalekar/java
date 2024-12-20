import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) {
    int a , b ;
    System.out.println("Enter two number ...");
    Scanner obj = new Scanner(System.in);
    a=obj.nextInt();
    b=obj.nextInt();
    System.out.println("addition : "+(a+b));
    System.out.println("subtraction : "+(a-b));
    System.out.println("multiplication : "+(a*b));
    System.out.println("division : "+(a/b));
    System.out.println("moduls : "+(a%b));
	}
} 