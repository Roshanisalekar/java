import java.util.Scanner;
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
    System.out.println("descending order array :");
    for(int i=0;i<5;i++){
        for(int j=i+1;j<5;j++){
            if(a[j]>a[i]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
for(int i=0;i<5;i++){
    System.out.print(a[i]+" ");
}
	
	}
}