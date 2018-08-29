/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccilist;
/**
 * @author Feedt
 */
import java.util.ArrayList;
import java.util.Scanner;
public class FibonacciList {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        ArrayList fibList;
        Scanner scanner = new Scanner(System.in);
        if(args.length < 1){
            fibList = fibAdd(scanner.nextInt());
        }
        else{
            fibList = fibAdd(Integer.valueOf(args[0]));
        }
        for(int i = 0; i< fibList.size(); i++){
        System.out.println( i +"th Fibonnacci number is: " + fibList.get(i));
        }
    }
    
    private static ArrayList fibAdd(int limit){
        //if(limit < 3){return new int[]{1,1};}
        //if(limit < 4){return new int[]{1,1,2};}
        if(limit <= 0){System.err.print("Please enter a positive integer"); }
        ArrayList fibList = new ArrayList();
        int a=1, b=1, count = 0;
        fibList.add(count);
        fibList.add(a);
        fibList.add(b);
        
        for(int i = 2; a+b < limit && i < limit; i++){
            fibList.add(a+b);
            a = a+b;
            b = a-b;
        }
        return fibList;
    }
    
}
