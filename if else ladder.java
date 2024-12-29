import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int marks ;
	 System.out.println("Enter marks :");
	 Scanner r = new Scanner(System.in);
	 marks = r.nextInt();
	 if(marks>=80){
	     System.out.println("you are topper");
	 }
	 else if(marks<=80 && marks>=60){
	     System.out.println("you are second");
	 }
	else if(marks<=60 && marks>=50){
	     System.out.println("you are third");
	 }
	 else if(marks<=50 && marks>=35){
	     System.out.println("you are pass");
	 }
     else{
             System.out.println("you are Fail");
     }
	}
}