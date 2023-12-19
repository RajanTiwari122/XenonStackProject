public class Inheritance {
    
    public static void main(String[] args) {
        dog D1= new dog();
        D1.drinks();
        
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
        
        
    }
    void drinks(){
    System.out.println("drinks water");
     }

}
class dog extends Animal{
    String breed;
    void bark(){
        System.out.println("barks");
    }
}

    

