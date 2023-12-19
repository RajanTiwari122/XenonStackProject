public class Intrface {
    public static void main(String[] args) {
        Bear B1=new Bear();
        B1.eat();
        B1.eat1();
        
    }
    
}
interface Herbivore{
    void eat();
}
interface Cornivore{
    void eat1();
}
class Bear implements Herbivore,Cornivore{
    public void eat(){
        System.out.println("eats grass");
    }
    public void eat1(){
        System.out.println("eats meat");
    }
}