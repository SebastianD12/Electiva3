/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivaiii;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Operaciones {
    
    public static void main (String []args){
        int vInt;
        float vFloat;
        String vStr;
        boolean b1, b2;
        
        Scanner sc = new Scanner(System.in);
        
        
        vInt=5+2;
        System.out.println("vInt=5+2="+vInt);
        
        vInt=5-2;
        System.out.println("vInt=5-2="+vInt);
        
        vInt=5*2;
        System.out.println("vInt=5*2="+vInt);
        
        vInt=5%2;
        System.out.println("vInt=5%2="+vInt);
        
        vInt=5^2;
        System.out.println("vInt=5^2="+vInt);
        
        
        vFloat=5+2;
        System.out.println("vInt=5+2="+vFloat);
        
        vFloat=5-2;
        System.out.println("vInt=5-2="+vFloat);
        
        vFloat=5*2;
        System.out.println("vInt=5*2="+vFloat);
        
        vFloat=5%2;
        System.out.println("vInt=5%2="+vFloat);
        
        vFloat=5^2;
        System.out.println("vInt=5^2="+vFloat);
        
        vStr="hola";
        System.out.println("string "+vStr);
        
        b1=true;
        b2=false;
        System.out.println("b1 and b2:"+(b1 && b2));
        System.out.println("b1 || b2:"+(b1 || b2));
        System.out.println("!b1 and b2:"+(!b1));
        System.out.println("!b2:"+(!b2));
        
        System.out.println("sot"+sc.nextLine());
        
        for (int i=0; i<5; i++){
        System.out.println(i);
    }
            int i=0;
            while (b2=true && i<5){
                System.out.println("congratz");
                i++;
            }
        
    

    }
    
    
}
