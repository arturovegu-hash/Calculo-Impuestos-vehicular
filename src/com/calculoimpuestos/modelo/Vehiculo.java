/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculoimpuestos.modelo;

/**
 *
 * @author Arturo_Velásquez_G
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int cilindraje;
    private double avaluoComercial;
    private String tipoUso; // "particular" o "publico"

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.cilindraje = cilindraje;
        this.avaluoComercial = avaluoComercial;
        this.tipoUso = tipoUso;
    }

    // Getters y setters (se pueden generar automáticamente en NetBeans)
    public double getAvaluoComercial() {
        return avaluoComercial;
    }
}
