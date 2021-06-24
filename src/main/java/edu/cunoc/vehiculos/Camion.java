package edu.cunoc.vehiculos;

import edu.cunoc.interfaces.Novimiento;
import edu.cunoc.interfaces.Transporte;

public class Camion extends Vehiculo implements Transporte, Novimiento{

    public Camion(String nombre, int galonesCombustible, int pasajeros, int velocidadMax, double aceleracionBase, boolean esDiesel) {
        super("Niña", 15, 2, 60, 35, esDiesel);
        datos();
        tipoGasolina();
        transportar();
        moverDerecha();
        moverIzquierda();
    }
    
    public void datos(){
        System.out.println("CAMION");
        System.out.println("Nombre: " + nombre + ", Galones de Combustible: " + galonesCombustible + ", Pasajeros: " + pasajeros + ", Velocidad Maxima: " + velocidadMax + ", Aceleracion: " + aceleracionBase);
    }

    @Override
    public void tipoGasolina(){
        if (esDiesel) {
            System.out.println("USA GASOLINA");
        }
    }
    
    @Override
    public void transportar() {
        System.out.println("TRANSPORTE DE CARGA DE MERCADERIA Y OTROS");
    }

    @Override
    public void moverDerecha() {
        System.out.println("GIRO SUAVEMENTE A LA DERECHA");
    }

    @Override
    public void moverIzquierda() {
        System.out.println("GIRO SUAVEMENTE A LA IZQUIERDA");
    }
    
}
