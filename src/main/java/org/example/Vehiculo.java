package org.example;

public class Vehiculo {
    private String marca;
    private int año;
    private double precio;
    private int capacidadEstanque;
    private int nivelEstanque;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getNivelEstanque() {
        return nivelEstanque;
    }

    public void setNivelEstanque(int nivelEstanque) {
        this.nivelEstanque = nivelEstanque;
    }

    public Vehiculo(String marca, int año, double precio, int capacidadEstanque, int nivelEstanque){
        this.marca = marca;
        this.año = año;
        this.precio = precio;
        this.capacidadEstanque = capacidadEstanque;
        this.nivelEstanque = nivelEstanque;
    }

    public void ImprimirDatos(){
        System.out.println("Marca: " + this.marca + "\nAño: " + this.año + "\nPrecio: " + this.precio + "\nCapacidad del estanque: " + this.capacidadEstanque + " lts." + "\nNivel del estanque: " + this.nivelEstanque + " lts.");
    }
    public void CargarEstanque(int litros){
        setNivelEstanque(this.nivelEstanque + litros);
    }
    public void VaciarEstanque(int litros){
        if (litros > this.nivelEstanque){
            try {
                throw new Error("El estanque no puede quedar vacio!");
            } catch (Error e) {
                System.out.println(e.getMessage());
            }
        } else {
            setNivelEstanque(this.nivelEstanque - litros);
        };
    }
    public void calcularImpuesto(){
        double impuesto = this.precio * 0.15;
        System.out.println("El impuesto del Vehiculo equivale a: " + impuesto);
    }

}
