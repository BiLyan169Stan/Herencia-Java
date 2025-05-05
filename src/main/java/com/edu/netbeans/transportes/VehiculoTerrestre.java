/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.netbeans.transportes;

/**
 *
 * @author brian
 */
public class VehiculoTerrestre extends Vehiculo{
    private int numRuedas;
    
    public VehiculoTerrestre(String marca, String modelo, int numRuedas){
        super(marca,modelo);
        this.numRuedas = numRuedas;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de ruedas: "+ numRuedas);
    }
}

