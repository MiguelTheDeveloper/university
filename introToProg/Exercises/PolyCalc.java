package challenge;
import java.util.Scanner;
public class PolyCalc {

    public static void main (String[] args) {
	
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the degre of your first polynomial:");
        
        int intInput = input.nextInt();
        

        int polinomioA[] = new int[intInput+1];
    
        for (int i = 0; i < polinomioA.length; i++) {
            System.out.print("Value for element with degree "+i+" : ");
            polinomioA[i] = input.nextInt();
        }


        System.out.println("Enter the degre of your second polynomial:");
        
        intInput = input.nextInt();
        
        int polinomioB[] = new int[intInput+1];
        
        for (int i = 0; i < polinomioB.length; i++) {
            System.out.print("Value for element with degree "+i+" : ");
            polinomioB[i] = input.nextInt();
        }

        System.out.println("Enter what operation you desire: \n1-Sum\n2-Subtraction\n3-Multiply\nOption: ");
        
        
        intInput = input.nextInt();

        switch (intInput) {
            
            case 1:
               calculate(polinomioA,polinomioB,true);
            break;
            case 2:
                calculate(polinomioA,polinomioB,false);
            break;
            case 3:
                multi(polinomioA,polinomioB);
            break;
        
            default:
                System.out.println("Invalid Operation");
                break;
        }
		
        
        input.close();
	
    }

    static void calculate(int A[],int B[],boolean isSum){
        
        int bigPoly[] = (A.length>B.length?A:B);
        int smallPoly[] = (A.length<B.length?A:B);

        int C[] = new int[bigPoly.length];
        
        if(isSum){
            for (int i = 0; i < C.length; i++) {
                C[i]=((smallPoly.length-1)<i)?bigPoly[i]:(A[i]+B[i]);
            }
        }else{
            for (int i = 0; i < C.length; i++) {
                C[i]=((smallPoly.length-1)<i)?bigPoly[i]:(A[i]-B[i]);
            }
        }
        

        polyPrint(C);
        
    }

    static void multi(int A[],int B[]){
        int bigPoly[] = (A.length>B.length?A:B);
        int smallPoly[] = (A.length<B.length?A:B);
        

        int C[] = new int[bigPoly.length+smallPoly.length];
        
        for (int i = 0; i < bigPoly.length; i++) {
            for (int j = 0; j < smallPoly.length; j++) {

                C[i+j] += bigPoly[i]*smallPoly[j];
            }
        }
        polyPrint(C);
    }

    static void polyPrint(int poly[]){
        boolean first = true;
        System.err.println("The solution is: ");
        for (int i = poly.length-1; i > -1; i--) {
            if (poly[i]!=0){
                
                if (!first && poly[i] > 0) {
                    System.out.print("+");
                }
                
                if(poly[i]!=1&&poly[i]!=-1){
                    System.out.print(poly[i]);
                }else if (poly[i] == -1) {
                    System.out.print("-");
                }
                
                if(i!=1){
                    System.out.print((i!=0?("x^"+i):""));
                }else{
                    System.out.print("x");
                }
                first=false;

                }
            }
            
            System.out.println();
        }
        
    }


