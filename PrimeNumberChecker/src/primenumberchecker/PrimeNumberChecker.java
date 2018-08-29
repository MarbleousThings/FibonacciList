/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumberchecker;
import java.util.Scanner;
/**
 *
 * @author Feedt
 */
public class PrimeNumberChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        if(args.length <= 0){
            System.out.println(primeCheck(s.nextInt()));
        }
        else{
            System.out.println(primeCheck(Integer.valueOf(args[0])));
        }
    }
    private static boolean primeCheck(int a){
        if(a==2){return true;}
        if(a<=0){return false;}
        for(int i=2; i<Math.sqrt(a); i++){
            if(a%i == 0)
                return false;
        }
        return true;
    }
       
}
