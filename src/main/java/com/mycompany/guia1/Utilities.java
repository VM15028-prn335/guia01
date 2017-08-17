/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guia1;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Utilities {
    
    public String getResume (String texto){
        
        String Resumen = "";
        
        
        for(int inicio=0; inicio != texto.length() && inicio<30  ;inicio++){
            Resumen = Resumen + texto.charAt(inicio);     
            
        }
        
        return Resumen;
           
        
        
    }
    
    
        
}
