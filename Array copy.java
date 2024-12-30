
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    int a[]=new int [5];
    int b[]=new int[5];
    Scanner r=new Scanner(System.in);
    System.out.println("Enter a array :");
    for(int i=0;i<5;i++){
        a[i]=r.nextInt();
    }
    System.out.println("First array element :");
    for(int i =0;i<a.length;i++){
        System.out.println(a[i]);
    }
       System.out.println("Second array element :");
    for(int i =0;i<a.length;i++){
        b[i]=a[i];
        System.out.println(b[i]);
    }
    
	}
	}