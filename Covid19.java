/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

import java.util.Scanner;

/**
 *
 * @author Programmer Imran
 */
public class Covid19 {

    
    public static void main(String[] args) {
        
        try{
            System.out.print("Enter Your Age: ");
            Scanner age = new Scanner(System.in);
            int s = age.nextInt();
            Experiment.solution(s);
            
        }catch(VaccineException i){
            System.out.println("Sorry!! You are not available for vaccine" +i);
        }
         
    }
    
}
