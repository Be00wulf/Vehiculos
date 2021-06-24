package edu.cunoc.vehiculos;


public class ArregloVehiculo {
    private Vehiculo vehiculos[];
    
    //constructor
    public ArregloVehiculo(){
        vehiculos = new Vehiculo[20];
        veh(vehiculos);
    }
    
    //metodos
    //llamar diferentes vehiculos xd random de vehiculos
    public void veh(Vehiculo carros[]){
        for (int i = 0; i < vehiculos.length; i++) {
            int x;
            x = (int)(Math.random() * (1 + 3));
            
            if (x == 1) {
                Camioneta c2 = new Camioneta("Mem", 0, 0, 0, 0, true);
                System.out.println(c2);
            }
            
            else if (x == 2) {
                Deportivo d2 = new Deportivo("Lom", 0, 0, 0, 0, true);
                System.out.println(d2);
            }
            
            else if (x == 3) {
                Camion cm2 = new Camion("sew", 0, 0, 0, 0, true);
                System.out.println(cm2);
            }

            System.out.print("\n\n");

        }
   
    }

    
}
