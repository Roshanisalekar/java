import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int age ;
	 System.out.println("Enter your age :");
	 Scanner r = new Scanner(System.in);
	 age = r.nextInt();
	 if(age>=18){
	     System.out.println("you are eligible for votes...!");
	 }
     System.out.println("Thanks you !");
	}
}