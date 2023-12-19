public class FindShortestPath {
    public static float findShortest(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            if(str.charAt(i)=='W'){
                x--;
            }
            if(str.charAt(i)=='N'){
                y++;
            }
            if(str.charAt(i)=='S'){
                y--;
            }
        }
        return (float) Math.sqrt((x*x)+(y*y));
    }

    public static void main(String[] args) {
        String dir="WNEENESENNN";
        System.out.println(findShortest(dir));
    }
}
