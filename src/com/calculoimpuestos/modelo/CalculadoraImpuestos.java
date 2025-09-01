/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculoimpuestos.modelo;

/**
 *
 * @author Arturo_Velásquez_G
 */
public class CalculadoraImpuestos {
    
    public double calcularImpuesto(Vehiculo vehiculo) {
        double avaluo = vehiculo.getAvaluoComercial();
        double impuesto = 0.0;

        // Lógica de cálculo simplificada.
        // En una aplicación real, estas tarifas se obtendrían de una base de datos o archivo de configuración.
        if (avaluo < 30000000) {
            impuesto = avaluo * 0.015; // 1.5%
        } else if (avaluo >= 30000000 && avaluo < 50000000) {
            impuesto = avaluo * 0.025; // 2.5%
        } else {
            impuesto = avaluo * 0.035; // 3.5%
        }
        
        return impuesto;
    }
}
