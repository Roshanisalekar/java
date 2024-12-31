import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int a[][]=new int[2][2];
		int b[][]=new int[2][2];	int c[][]=new int[2][2];
	Scanner r =new Scanner(System.in);
	
	System.out.println("Enter  first array element :");
    for(int i=0;i<2;i++){ //row 
      for(int j=0;j<2;j++){ //column
            
     a[i][j]=r.nextInt();	
      }
  }
  
  	System.out.println("Enter  second array element :");
  for(int i=0;i<2;i++){ //row 
      for(int j=0;j<2;j++){ //column
            
     b[i][j]=r.nextInt();	
      }
  }
  
   System.out.println("matrix :");	
   System.out.println("first array element :");
  for(int i=0;i<2;i++){  //row 
      for(int j=0;j<2;j++){ //column
            System.out.print(a[i][j]+" ");
      } System.out.printf("\n");
    
  }
  System.out.println("second array element :");
    for(int i=0;i<2;i++){  //row 
      for(int j=0;j<2;j++){ //column
            System.out.print(b[i][j]+" ");
      } System.out.printf("\n");
     
  }
  System.out.println("sum of two matrix :");
  for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
          c[i][j]=a[i][j]+b[i][j];
             System.out.print(c[i][j]+" ");
          
      }
      System.out.printf("\n");
  }
  
	    
	}
}