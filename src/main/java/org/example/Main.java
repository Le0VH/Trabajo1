package org.example;

public class Main {
    public static void main(String[] args) {

        Vehiculo veh1 = new Vehiculo("BMW",1980,5000000,50,25);
        Automovil aut1 = new Automovil("Nissan", 2005,8000000,60,50,3);
        Motocicleta mot1 = new Motocicleta("Yamaha",2015,4500000,10,7,350);
      /*  //imprimir datos
        veh1.ImprimirDatos();
        //cargar estanque
        veh1.CargarEstanque(10);
        veh1.ImprimirDatos();
        //vaciar estanque (mayor a 0)
        veh1.VaciarEstanque(25);
        veh1.ImprimirDatos();
        //vaciar estanque (menor a 0)
        veh1.VaciarEstanque(40);
        //calcular impuestos
        veh1.calcularImpuesto();*/
        System.out.println("-----------------------------------------");
      /*aut1.ImprimirDatos();
        //cargar estanque
        aut1.CargarEstanque(10);
        aut1.ImprimirDatos();
        //vaciar estanque (mayor a 15)
        aut1.VaciarEstanque(35);
        aut1.ImprimirDatos();
        //vaciar estanque (menor a 15)
        aut1.VaciarEstanque(40);
        //calcular impuesto(anterior a 2010)
        aut1.calcularImpuesto();
        //modificar año
        aut1.ModificarAño(2012);
        //calcular impuesto(posterior a 2010)
        aut1.calcularImpuesto();*/
        System.out.println("-----------------------------------------");
        //mostrar cilindrada
        mot1.obtenerCilindrada();
        //imprimir datos
        mot1.ImprimirDatos();
        //vaciar estanque(mayor a 5)
        mot1.VaciarEstanque(1);
        mot1.ImprimirDatos();
        //vaciar estanque(menor a 5)
        mot1.VaciarEstanque(3);
    }
}