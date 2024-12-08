 
//here , box uses a constructor to initialize the dimension of a box 
class BOX {
    double width ;
    double height ;
    double depth ;
    
    //this is constructor BOX
BOX(){
    System.out.println("construting BOX");
    width =10;
    height =12;
    depth = 10;
}
    
// compute  and return  volume 
double volume(){
    return width * height * depth;
}

 }
 
public class Main
{
	public static void main(String[] args) {
	BOX mybox1 = new BOX(); 
		BOX mybox2 = new BOX();
		double vol ;

	//get volume of first box 
	vol = mybox1.volume();
	System.out.println("volume is :" + vol);
	
		//get volume of second  box 
	vol = mybox2.volume();
	System.out.println("volume is :" + vol);
	
}
}