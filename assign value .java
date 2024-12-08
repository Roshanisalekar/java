// A program that uses the box class
// call this file Boxdemo .java


class Box{
    double width;
    double height;
    double depth;
}
// this class declares an Object of type box.
public class Main
{
	public static void main(String[] args) {
	    Box mybox =new Box();
	    double vol;
	    
// assign values to mybox's instance variables
mybox.width=10;
mybox.height=20;
mybox.depth=15;

//compute volume of Box

vol=mybox.width * mybox.height * mybox.depth;

System.out.println("volume is : " + vol);
	
	}
}