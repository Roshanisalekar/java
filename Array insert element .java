import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int size,loc,item,i;
		Scanner r = new Scanner(System.in);
		System.out.println("enter a size :");
		size=r.nextInt();
		
		int a[]=new int [size+1];
		System.out.println("Enter Array element :");
		for(i=0;i<size;i++){
		    a[i]=r.nextInt();
		}
        System.out.println("Enter Array Location :");
		loc=r.nextInt();

		System.out.println("Enter new item :");
		item=r.nextInt();
		
		for(i=size;i>loc;i--){
		    a[i]=a[i-1];
		}
        a[loc]=item;
		size++;
		
		System.out.println("Array element :");
		for(i=0;i<size;i++){
		    System.out.println(a[i]);
		}
	}
}