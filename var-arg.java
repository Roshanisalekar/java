class A{
    void add (int ...a){
        int sum = 0;
        for(int x : a){
            sum = sum + x ;
        }
        System.out.println("sum of number : "+ sum);
    }
}
class demo{
    public static void main (String[] args)
    {
        A r = new A();
        r.add();
        r.add(10);
        r.add(12,56);
        r.add(45,56,23);
        r.add(10,25,45,45);
    }
}