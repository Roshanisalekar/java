
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    int a[]=new int [5];
    int n,count=0;
   
    Scanner r=new Scanner(System.in);
    System.out.println("Enter a array :");
    for(int i=0;i<5;i++){
        a[i]=r.nextInt();
    }
    System.out.println("array element :");
    for(int i =0;i<a.length;i++){
      System.out.println(a[i]+" ");
    }
      System.out.println("Enter search element :");{
          n=r.nextInt();
          for(int i = 0;i<a.length;i++){
              if(a[i]==n) {
                  count++;
              }
          }
         if(count>0)
         System.out.println("item found");
         else
         System.out.println("item not found");
          
      }
 
    
	}
	}