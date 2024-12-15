class shape{
    void draw(){
        System.out.println("can not any shape");
    }
} 
class square extends shape{
    @Override
     void draw(){
         
        System.out.println("square is  shape");
    }

}
class Main{
    public static void main (String[] args) {
    shape r = new square();
    r.draw();
 
}
}