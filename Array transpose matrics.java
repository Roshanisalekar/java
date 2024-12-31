import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int a[][]=new int[2][2];
	Scanner r =new Scanner(System.in);
	System.out.println("Enter  first array element :");
    for(int i=0;i<=1;i++){ //row 
      for(int j=0;j<=1;j++){ //column
            
     a[i][j]=r.nextInt();	
      }
    }
     System.out.println("Array  matrix :");
      for(int i=0;i<=1;i++){ //row 
      for(int j=0;j<=1;j++){ //column
          System.out.print(a[i][j]+" ");    
      }
      System.out.print("\n");
    }
  System.out.println("Transpose matrix :");
      for(int i=0;i<=1;i++){
          //row 
      for(int j=0;j<=1;j++){ //column
          System.out.print(a[j][i]+" ");    

      }
      System.out.print("\n");
  }
	}
}