package s01;
public class ex05 {
    public static void main(String[] args) {
        double x = 3.15432;
        double y = 3.15423;

        if(Math.abs(y-x)<0.001){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
