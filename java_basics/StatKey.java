public class StatKey {
    public static void main(String[] args) {
        Student S1=new Student(); 
        System.out.println(S1.name="ABC");
       System.out.println( S1.section="CS32");
       
        Student S2=new Student();
        System.out.println(S2.name="DEF");
        System.out.println( S2.section);
        System.out.println(S2.MarkPercent(40,50,40));
    }
    
}
class Student{
    String name;
    int roll;
    static String section;
    static int MarkPercent(int A,int B,int C){
        return (A+B+C)/3;
    }
}
