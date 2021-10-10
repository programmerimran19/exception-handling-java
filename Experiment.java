/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

/**
 *
 * @author Programmer Imran
 */
public class Experiment {
    
    static void solution (int s) throws VaccineException{
        
        if (s < 18)
        {
            throw new VaccineException(s);
            
        }
        System.out.println("Yes!! You are available for Vaccine");
    }
}
