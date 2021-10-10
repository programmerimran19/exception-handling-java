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
public class VaccineException extends Exception{
    
    private int vaccine;
    VaccineException (int r) {vaccine = r;}
    @Override
    public String toString()
    {
        //return "VaccineException[" +vaccine+"]";
        return "["+vaccine+"]";
    }
    
}
