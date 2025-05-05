/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edu.netbeans.transportes;

/**
 *
 * @author brian
 */
public class Transportes {

    public static void main(String[] args) {
        VehiculoTerrestre vehiculoTerrestre = new VehiculoTerrestre("BMW", "M8 Competition", 4);
        VehiculoAcuatico vehiculoAcuatico= new VehiculoAcuatico("Boatmobile", "Bob", "Combustion Marino");
        VehiculoAereo vehiculoAereo = new VehiculoAereo("Raptor", "T-50", 2);
        VehiculoEspacial vehiculoEspacial = new VehiculoEspacial("Raptor", "Space X", 8);
        
        //Mostrar informacion de vehiculos
        System.out.println("Informacion del Vehiculo Terrestre: ");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("Informacion del Vehiculo Acuatico: ");
        vehiculoAcuatico.mostrarInfo();
        
        System.out.println("Informacion del Vehiculo Aereo: ");
        vehiculoAereo.mostrarInfo();
        
        System.out.println("Informacion del Vehiculo Aereo: ");
        vehiculoEspacial.mostrarInfo();
    }
}
