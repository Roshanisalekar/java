// this program includes a method inside the box class
class Box{
    double width;
    double height;
    double depth;


// display  volume of a box 
void volume(){
    System.out.print("volume is : ");
    System.out.println(width * height * depth);
    
}
}

public class Main
{
	public static void main(String[] args) {
	    Box mybox1 =new Box();
	    Box mybox2 =new Box();
	    double vol;
	    
// assign values to mybox's instance variables
mybox1.width=10;
mybox1.height=20;
mybox1.depth=15;

mybox2.width=1;
mybox2.height=2;
mybox2.depth=15;
 
// display volume of first box 
mybox1.volume();

// display volume of second  box 
mybox2.volume();

	}
}