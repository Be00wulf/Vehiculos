package edu.cunoc.vehiculos;

import edu.cunoc.interfaces.Carrera;
import edu.cunoc.interfaces.Novimiento;

public class Deportivo extends Vehiculo implements Novimiento, Carrera{
    Vehiculo v1 = new Vehiculo(nombre, galonesCombustible, pasajeros, velocidadMax, aceleracionBase, esDiesel);

    public Deportivo(String nombre, int galonesCombustible, int pasajeros, int velocidadMax, double aceleracionBase, boolean esDiesel) {
        super("Mercedes Benz", 8, 2, 160, 50, esDiesel);
        tipoGasolina();
        datos();
        moverDerecha();
        moverIzquierda();
        turbo();
        tripleVelocidad();
    }
    
    public void datos(){
        System.out.println("AUTO DEPORTIVO");
        System.out.println("Nombre: " + nombre + ", Galones de Combustible: " + galonesCombustible + ", Pasajeros: " + pasajeros + ", Velocidad Maxima: " + velocidadMax + ", Aceleracion: " + aceleracionBase);
    }

    @Override
    public void tipoGasolina(){
        if (esDiesel) {
            System.out.println("USA GASOLINA");
        }
    }
    
    @Override
    public void moverDerecha() {
        System.out.println("DERRAPO A LA DERECHA");
    }

    @Override
    public void moverIzquierda() {
        System.out.println("DERRAPO A LA IZQUIERDA");
    }

    @Override
    public void turbo() {
        System.out.println("SE ACTIIVO EL TURBO");
    }

    @Override
    public void tripleVelocidad() {
        v1.setVelocidadMax(velocidadMax*3);
        System.out.println("TRIPLE VELOCIDAD: " + v1);
    }

}
