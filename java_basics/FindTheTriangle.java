public class FindTheTriangle {
    public static String CheckTriangle(int a,int b,int c){
        if(a==b && b==c && c==a){
            return "Equilateral";
        }
        else if(a==b||b==c||c==a){
            return "Isosceles";
        }
        else if(a!=b&&b!=c&&c!=a){
            return "Scalene";
        }
        else{
            return "Error";
        }
    }
}
