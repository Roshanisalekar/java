import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int n ;
	 System.out.println("Enter any number  :");
	 Scanner r = new Scanner(System.in);
	 n = r.nextInt();
	 if(n>=0){
	     System.out.println("positive number");
	 }
     else{
             System.out.println("negative number");
     }
	}
}