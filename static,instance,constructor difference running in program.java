class A {
    // default constructor block
    A(){
        System.out.println("all");
    }
    //instance block
    {
        System.out.println("take care");
    }
    // static block
    static {
        	System.out.println("Hello World");
        	
    }
    //call to  constructor
         void show (){
       
        System.out.println("guy's");
        
    }
    
	public static void main(String[] args) {
	    A r = new A();
		r.show();
	}
}