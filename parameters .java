// this program uses a parameterized method . 
class Box{
    double width;
    double height;
    double depth;
// compute and return volume

double volume(){
    return width * height * depth;
    
}
// sets dimensions of box 
void setDim(double w ,double h ,double d){
    width = w;
    height = h;
    depth = d ;
}
}
public class Main
{
	public static void main(String[] args) {
	    Box mybox1 =new Box();
	    Box mybox2 =new Box();
	    double vol;
	    
// initialize  each box 

mybox1.setDim(12,14,10);
mybox2.setDim(15,2,12);
 
 // get  volume of first box 
vol = mybox1.volume();
System.out.println("volume is :"+ vol);

// get  volume of second  box 
vol = mybox2.volume();
System.out.println("volume is :"+ vol);
}
}