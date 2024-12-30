import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	int a[]=new int [5];
	int temp;
    Scanner r = new Scanner(System.in);
    System.out.println("Enter array element :");
    for(int i=0;i<5;i++){
        a[i]=r.nextInt();
    }
    System.out.println("Arrays sort method :");
   Arrays.sort(a);
for(int i=0;i<5;i++){
    System.out.print(a[i]+" ");
}
	
	}
}