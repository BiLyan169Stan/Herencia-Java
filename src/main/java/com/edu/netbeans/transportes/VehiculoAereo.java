/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.netbeans.transportes;

/**
 *
 * @author brian
 */
public class VehiculoAereo extends Vehiculo{
    private int numTurbinas;
    
    public VehiculoAereo(String marca, String modelo, int numTurbinas){
        super(marca,modelo);
        this.numTurbinas = numTurbinas;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de turbinas: "+ numTurbinas);
    }
}
