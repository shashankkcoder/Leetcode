public class IndexOfExample {
    public static void main(String args[]) {
        String s1 = "Don't Know but I like to stay awake at night";
        int index1 = s1.indexOf("like");
        int index12 = s1.indexOf("Like");
        int index3 = s1.indexOf("q");
        System.out.println(index1 + " " + index12  + "" + index3 );
    }
 }
 