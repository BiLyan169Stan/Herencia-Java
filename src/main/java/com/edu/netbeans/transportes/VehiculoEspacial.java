/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.netbeans.transportes;

/**
 *
 * @author brian
 */
public class VehiculoEspacial extends Vehiculo{
    private int numMotor;
    
    public VehiculoEspacial(String marca, String modelo, int numMotor){
        super(marca, modelo);
        this.numMotor = numMotor;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de motores: "+ numMotor);
    }
}
