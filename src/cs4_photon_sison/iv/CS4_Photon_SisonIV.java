/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_photon_sison.iv;

/**
 *
 * @author PHOTON
 */
public class CS4_Photon_SisonIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1 = "First Number";
                String romnum1 = "L";
                String numname1 = "Fifty";
                String numnum1 = "50";
                
        String num2 = "Second Number";
        String romnum2 = "LX";
        String numname2 = "Sixty";
        String numnum2 = "60";
        
        String num3 = "Third Number";
        String romnum3 = "LXX";
        String numname3 = "Seventy";
        String numnum3 = "70";
        
        
                boolean same = numname1.equals(numname2) && numname2.equals(numname3);
                int three = Integer.parseInt(numnum1) + Integer.parseInt(numnum2) + Integer.parseInt(numnum3);
                boolean big = Integer.parseInt(numnum1) > Integer.parseInt(numnum2);
                        
        
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
               System.out.println(num1);
               System.out.println("Number Name: " + numname1);
               System.out.println("Alphanumerical Form: " + numname1);
               System.out.println("Roman Numeral Form: " + romnum1);
               System.out.println(num2);
               System.out.println("Number Name: " + numname2);
               System.out.println("Alphanumerical Form: " + numname2);
               System.out.println("Roman Numeral Form: " + romnum2);
               System.out.println(num3);
               System.out.println("Number Name: " + numname3);
               System.out.println("Alphanumerical Form: " + numname3);
               System.out.println("Roman Numeral Form: " + romnum3);
               System.out.println("The first three numbers are the same: " + same);
               System.out.println("The sum of the three numbers: " + three);
               System.out.println("The first number is bigger than the second number: " + big);
               
                
    }
    
}
