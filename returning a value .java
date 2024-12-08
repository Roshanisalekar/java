// now , volume () returns the volume of a box 
class Box{
    double width;
    double height;
    double depth;
// compute and return volume

double volume(){
    return width * height * depth;
    
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
 
 // get  volume of first box 
vol = mybox1.volume();
System.out.println("volume is :"+ vol);

// get  volume of second  box 
vol = mybox2.volume();
System.out.println("volume is :"+ vol);
}
}