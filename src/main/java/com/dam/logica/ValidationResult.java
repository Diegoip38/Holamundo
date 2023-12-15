/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.logica;

/**
 *
 * @author diegoip
 */
public class ValidationResult {
    private boolean valid = true;
    private String ErrorMessage;

    public ValidationResult(boolean valid,String ErrorMessage) {
        this.valid = valid;
        this.ErrorMessage = ErrorMessage;
    }

    public boolean isValid() {
        return valid;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }
    
    
}
