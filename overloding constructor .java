// here , box define three constructors to initialize  the dimension of a box various way .
class Box{
    double width ;
    double height ;
    double depth ;
    
    //constructors used when all dimension specified 
    Box(double w , double h, double d){
        width = w;
        height = h;
        depth = d;
    }
        // constructors used when no dimension specified
        Box(){
            width = -1;
            height = -1;
            depth = -1;
        }
        
    // constructors used whencube is created 
    
    Box(double len ){
        width= height= depth=len;
    }
    //compute and return volume
    double volume(){
        return width* height* depth;
    }
}

public class Main
{
	public static void main(String[] args) {
		//create boxes using the various constructors
		Box mybox1 = new Box(10,20,15);
		Box mybox2= new Box();
		Box mycube = new Box(7);
		double vol ;
		//   get value of first box
		 vol = mybox1.volume();
		 System.out.println("volume of mybox1 is :"+vol);
		 	//   get value of second box
		 vol = mybox2.volume();
		 System.out.println("volume of mybox2 is :"+vol);
		 	//   get value of cube  box
		 vol = mycube.volume();
		 System.out.println("volume of mycube is :"+vol);
		 
		}
	}