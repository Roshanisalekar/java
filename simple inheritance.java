//A simple example of inheritance :
 // A subclass extends of  superclass is called as simple inheritance. 
// create a superclass

class Student{
    int rollno ; 
    String name ;
    int marks ;
    public void input(){
        System.out.println("enter rollno name &  marks :");
    }
    
}
public class roshani extends Student //create a subclass
{
     void disp(){
    rollno = 101;
    name  = "roshani";
    marks = 99;
   
        System.out.println(rollno +" "+name +" "+ marks);
    }
	public static void main(String[] args) {
	    roshani r = new roshani();
	    r.input();
	    r.disp();
	
	}
}