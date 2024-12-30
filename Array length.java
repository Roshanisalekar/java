import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a[]=new int[3];
	    int size ,i;
	    Scanner r = new Scanner(System.in);
	    System.out.println("Enter array element :");
	    for(i=0;i<3;i++){
	  
	        a[i]=r.nextInt();
	    }
	    System.out.println("Array element");
	    for( i=0;i<3;i++){
	        System.out.println(a[i]);
	    }
	    System.out.println("Array length "+a.length);
		}
	}