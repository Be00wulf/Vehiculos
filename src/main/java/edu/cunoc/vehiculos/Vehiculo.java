package edu.cunoc.vehiculos;

public class Vehiculo {
    //variables
    protected String nombre;
    protected int  galonesCombustible, pasajeros, velocidadMax;
    protected double aceleracionBase;
    protected boolean esDiesel;
    
    //constructor
    public Vehiculo(String nombre, int galonesCombustible, int pasajeros, int velocidadMax, double aceleracionBase, boolean esDiesel) {
        this.nombre = nombre;
        this.galonesCombustible = galonesCombustible;
        this.pasajeros = pasajeros;
        this.velocidadMax = velocidadMax;
        this.aceleracionBase = aceleracionBase;
        this.esDiesel = esDiesel;
    }
    
    
    //metodos
    public void presentarVeh(){
        System.out.println("Auto: " + this.nombre);
    }
    
    public void tipoGasolina(){
        System.out.println("Usa Combustible");
    }
    
    //get set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGalonesCombustible() {
        return galonesCombustible;
    }

    public void setGalonesCombustible(int galonesCombustible) {
        this.galonesCombustible = galonesCombustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getAceleracionBase() {
        return aceleracionBase;
    }

    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }

    public boolean isEsDiesel() {
        return esDiesel;
    }

    public void setEsDiesel(boolean esDiesel) {
        this.esDiesel = esDiesel;
    }
    
}
