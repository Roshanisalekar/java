import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int n;
	 System.out.println("Enter any value : ");
	 Scanner r = new Scanner(System.in);
	 n=r.nextInt();
     do{
         System.out.print(n+" ");
         n++;
     }while(n<=10);
	 System.out.println("Thank you");
	}
}