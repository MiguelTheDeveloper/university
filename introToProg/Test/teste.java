public class teste {
    public static void main(String[] args) {
        int numAluno = 63762;
        int k=numAluno% 100;
        System.out.println(k);
        int n = 5;

        
        
        for(int i=0;i<k;i++){
            System.out.print(i+" ");
            for(int j=0;j<n;j++){

                if (j == 0||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
      
    }

    
}