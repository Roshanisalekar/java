import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a,b,c,max;
	System.out.println("Enter a three number :");
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
		b= obj.nextInt();
			c= obj.nextInt();
	
	max = (a>b) ? (a>c?a : c):(a>b ? a:b);
	System.out.println("greater a number :"+max);
	}
}