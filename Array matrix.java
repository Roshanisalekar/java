import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int a[][]=new int[3][3];
	Scanner r =new Scanner(System.in);
	System.out.println("Enter array element :");
  for(int i=0;i<3;i++){ //row 
      for(int j=0;j<3;j++){ //column
            
     a[i][j]=r.nextInt();	
      }
  }
  System.out.println("matrix :");	

  for(int i=0;i<3;i++){  //row 
      for(int j=0;j<3;j++)
      { //column
        System.out.print(a[i][j]+" ");
      }
      System.out.printf("\n");
  }
	    
	}
}