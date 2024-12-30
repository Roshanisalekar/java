import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	int a[]=new int [5];
		int a2[]=new int [5];

    Scanner r = new Scanner(System.in);
    System.out.println("Enter array element :");
    for(int i=0;i<5;i++){
        a[i]=r.nextInt();
    }
    System.out.println("Enter array 2 element :");
    for(int i=0;i<5;i++){
        a2[i]=r.nextInt();
    }
    boolean b = Arrays.equals(a,a2);
    System.out.println("both array are equal : "+b);
	}
}