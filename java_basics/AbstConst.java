public class AbstConst {
    public static void main(String[] args) {
      chicken ch1= new chicken();
      ch1.walk();
    }
    
}
abstract class Animal{
    void eat(){
        System.out.println("ests many things");
    }
    Animal(){
        System.out.println("Animal constructor is called");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    Horse(){
        System.out.println("Horse constructor is called");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
    chicken(){
        System.out.println("Chicken constructor is called ");
        
    }
}
