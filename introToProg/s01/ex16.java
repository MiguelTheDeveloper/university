package s01;
public class ex16 {
    public static void main(String[] args) {
        int n = 11;
        int m = 100;
        int counter = 0;
        
        while (n<=m) {
            m=m-n;
            counter++;
        }

     System.out.println(counter);
        
    }
}
