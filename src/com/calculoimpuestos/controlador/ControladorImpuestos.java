/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculoimpuestos.controlador;

import com.calculoimpuestos.modelo.CalculadoraImpuestos;
import com.calculoimpuestos.modelo.Vehiculo;
import com.calculoimpuestos.vista.VistaImpuestos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo_Velásquez_G
 */
public class ControladorImpuestos implements ActionListener {
    
    private VistaImpuestos vista;
    private CalculadoraImpuestos calculadora;

    public ControladorImpuestos(VistaImpuestos vista, CalculadoraImpuestos calculadora) {
        this.vista = vista;
        this.calculadora = calculadora;
        this.vista.btnCalcular.addActionListener(this); // Asignar el listener al botón
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCalcular) {
            try {
                // 1. Obtener datos de la vista
                String marca = vista.txtMarca.getText();
                String modelo = vista.txtModelo.getText();
                int anio = Integer.parseInt(vista.txtAnio.getText());
                int cilindraje = Integer.parseInt(vista.txtCilindraje.getText());
                double avaluo = Double.parseDouble(vista.txtAvaluo.getText());
                String tipoUso = (String) vista.comboTipoUso.getSelectedItem();

                // 2. Crear objeto Vehiculo (Modelo)
                Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, cilindraje, avaluo, tipoUso);

                // 3. Llamar a la lógica de cálculo (Modelo)
                double impuestoCalculado = calculadora.calcularImpuesto(vehiculo);

                // 4. Mostrar el resultado en la vista
                vista.lblResultado.setText("Impuesto a pagar: $" + String.format("%,.2f", impuestoCalculado));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(vista, "Por favor, ingrese valores numéricos válidos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
