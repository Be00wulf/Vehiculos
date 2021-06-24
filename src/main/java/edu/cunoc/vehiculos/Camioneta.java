package edu.cunoc.vehiculos;

import edu.cunoc.interfaces.Novimiento;
import edu.cunoc.interfaces.Transporte;

public class Camioneta extends Vehiculo implements Transporte, Novimiento{

    public Camioneta(String nombre, int galonesCombustible, int pasajeros, int velocidadMax, double aceleracionBase, boolean esDiesel) {
        super("Maria Linda", 14, 40, 50, 35, true);
        transportar();
        tipoGasolina();
        datos();
        moverDerecha();
        moverIzquierda();
    }

    @Override
    public void transportar() {
        System.out.println("CAMIONETA");
        System.out.println("TRANSPORTE PUBLICO DE PERSONAS");
    }
    
    @Override
    public void tipoGasolina(){
        if (esDiesel == true) {
            System.out.println("USA DIESEL");
        }
    }
    
    public void datos(){
        System.out.println("Nombre: " + nombre + ", Galones de Combustible: " + galonesCombustible + ", Pasajeros: " + pasajeros + ", Velocidad Maxima: " + velocidadMax + ", Aceleracion: " + aceleracionBase);
    }

    @Override
    public void moverDerecha() {
        System.out.println("Se movio a la derecha");
    }

    @Override
    public void moverIzquierda() {
        System.out.println("Se movio a la izquierda"); 
    }
}