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

//compute volume of Box

vol=mybox1.width * mybox1.height * mybox1.depth;
System.out.println("volume is : " + vol);

vol=mybox2.width * mybox2.height * mybox2.depth;
System.out.println("volume is : " + vol);
	
	}
}