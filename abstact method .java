 abstract class programming {
    public abstract void developer();
     public abstract void rank();
    
    public static void main(String[] args) {
	html h = new html();
	h.developer(); h.rank();
	java j = new java();
	j.developer(); j.rank();
}
}
class html extends programming{
    @Override
   public void developer(){
        System.out.println("tim berner lee");
   }
      @Override
   public void rank(){
        System.out.println("3rd");
   }
}
class java extends programming{
    @Override
   public void developer(){
        System.out.println("jame gosling");
   }
        @Override
   public void rank(){
        System.out.println("2rd");
   }
}


//method 2
/*
 abstract class programming {
    public abstract void developer();
     public abstract void rank();
    
    public static void main(String[] args) {
	programming h = new java();
	h.developer(); h.rank();

}
}
 abstract class html extends programming{
    @Override
   public void developer(){
        System.out.println("tim berner lee");
   }

}
class java extends html{
 
        @Override
   public void rank(){
        System.out.println("2rd");
   }
}
*/