//here , box uses a constructor to initialize the dimension of a box 
class BOX {
    double width ;
    double height ;
    double depth ;
    
    //this is constructor BOX
BOX(double w ,double h , double d){
    width = w;
    height= h;
    depth =d;
  
}
    
// compute  and return  volume 
double volume(){
    return width * height * depth;
}

 }
 
public class Main
{
	public static void main(String[] args) {
	BOX mybox1 = new BOX(10,10,10); 
		BOX mybox2 = new BOX( 12,12,12);
		double vol ;

	//get volume of first box 
	vol = mybox1.volume();
	System.out.println("volume is :" + vol);
	
		//get volume of second  box 
	vol = mybox2.volume();
	System.out.println("volume is :" + vol);
	
}
}