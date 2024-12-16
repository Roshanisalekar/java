abstract class animals
{
    void  animal()  //non abstract 
    {
       System.out.println("all animals .... !"); 
    }
    public abstract void sound();  //abstract 
}
class dog extends animals
{ 
    dog(){ //constructor 
        super.animal();
    }
   
    public void sound(){
        System.out.println("dog is barking.");
    }
}
class lion extends animals
{
 
    public void sound(){
        super.animal();
        System.out.println("lion is roar.");
    }
}
class test {
    public static void main (String[] args) {
        dog d = new dog();
        lion l = new lion();
        d.sound();
        l.sound();
    }
}