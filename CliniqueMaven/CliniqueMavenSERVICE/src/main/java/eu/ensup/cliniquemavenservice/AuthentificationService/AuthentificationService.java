/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.cliniquemavenservice.AuthentificationService;

import eu.ensup.cliniqueservicebo.Medecin;

/**
 *
 * @author lorris
 */
public class AuthentificationService {
    
    public boolean identification(String identifiant, String password,Medecin bo)
    {
        boolean b = false; 
        
        if(identifiant.equalsIgnoreCase(bo.getEmail()) == true && password.equalsIgnoreCase(bo.getPassword()))
        {
           b = true;
        }
        
        
        return b;
    }
    
}
