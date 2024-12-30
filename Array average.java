import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int a[]=new int [5];
		int sum=0 ; double avg=0 ;
		int n , count=0;
		Scanner r = new Scanner(System.in);
		System.out.println("enter an element :");
		for(int i=0;i<a.length;i++){
		    a[i]=r.nextInt();
		}
			System.out.println("array an element :");
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		    
		}
		System.out.println("average of array an element :");
		for(int i=0;i<a.length;i++){
		    sum =  a[i] + sum;
		    avg =sum/5.0;
		}
		System.out.println(avg);
}
}