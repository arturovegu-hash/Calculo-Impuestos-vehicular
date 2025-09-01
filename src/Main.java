
import com.calculoimpuestos.controlador.ControladorImpuestos;
import com.calculoimpuestos.modelo.CalculadoraImpuestos;
import com.calculoimpuestos.vista.VistaImpuestos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arturo_Velásquez_G
 */
public class Main {
    public static void main(String[] args) {
        // Instanciar la vista, el modelo y el controlador
        VistaImpuestos vista = new VistaImpuestos();
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();
        
        // El controlador une la vista y el modelo
        ControladorImpuestos controlador = new ControladorImpuestos(vista, calculadora);
        
        // Hacer visible la interfaz de usuario
        vista.setVisible(true);
    }
}
