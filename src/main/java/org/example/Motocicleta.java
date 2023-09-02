package org.example;

public class Motocicleta extends Vehiculo{
    private int cilindrada;


    public Motocicleta(String marca, int año, double precio, int capacidadEstanque, int nivelEstanque, int cilindrada) {
        super(marca, año, precio, capacidadEstanque, nivelEstanque);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void obtenerCilindrada(){
        System.out.println(this.cilindrada + "cc");
    }
@Override
    public void ImprimirDatos(){
    System.out.println("Marca: " + this.getMarca() + "\nAño: " + this.getAño() + "\nPrecio: " + this.getPrecio() + "\nCapacidad del estanque: " + this.getCapacidadEstanque() + " lts." + "\nNivel del estanque: " + this.getNivelEstanque() + " lts. " + "\nCilindrada: " + this.cilindrada + "cc");

}
    @Override
    public void VaciarEstanque(int litros){
        if ((this.getNivelEstanque() - litros) < 5){
            try{
                throw new Error("No queda suficiente combustible para arrancar!");
            } catch (Error e){
                System.out.println(e.getMessage());
            }
        } else {
            setNivelEstanque(getNivelEstanque() - litros);
        }
    }
}
