import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int size,loc,i;
		System.out.println("Enter size element :");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();//5
		
		int a[]=new int [size]; a[5]
		System.out.println("Enter a element :");
		for(i=0;i<size;i++){
		    
		    a[i]=r.nextInt();//1,2,3,4,5
		}
		System.out.println("Enter a location :");
	    loc=r.nextInt();//3
	    
		for(i=loc;i<size-1;i++){ //i=3  //3<5-1 3<4
        a[i]=a[i+1]; //
        }
        size--;
        System.out.println("array element :");
        for(i=0;i<size;i++){
            System.out.println(a[i]);
        }
	}
}