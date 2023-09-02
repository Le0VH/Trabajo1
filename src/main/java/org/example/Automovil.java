package org.example;

public class Automovil extends Vehiculo{
    private int cantidadPuertas;
    public Automovil(String marca, int año, double precio, int capacidadEstanque, int nivelEstanque, int cantidadPuertas) {
        super(marca, año, precio, capacidadEstanque, nivelEstanque);
        if(cantidadPuertas %2 != 0){
            try {
                throw new Error("Cantidad de puertas invalida!");
            }catch (Error e) {
                System.out.println(e.getMessage());
            }
            ;}
    }

   @Override
    public void CargarEstanque(int litros){
        if ((this.getCapacidadEstanque() - this.getNivelEstanque()) < litros){
            try{
                throw new Error("La carga no puede superar la capacidad del estanque!");
            } catch (Error e){
                System.out.println(e.getMessage());
            }

        }else{
            this.setNivelEstanque(this.getNivelEstanque() + litros);
        }
    }
    @Override
    public void VaciarEstanque(int litros){
        if ((this.getNivelEstanque() - litros) < 15){
            try{
                throw new Error("No queda suficiente combustible para arrancar!");
            } catch (Error e){
                System.out.println(e.getMessage());
            }
        } else {
            setNivelEstanque(getNivelEstanque() - litros);
        }
    }
    @Override
    public void calcularImpuesto(){
        if (this.getAño() < 2010){
            System.out.println("EL vehiculo no paga impuestos!");
        }else{
            double impuesto = this.getPrecio() * 0.15;
            System.out.println("El impuesto del Vehiculo equivale a: " + impuesto);
        }
    }

    public void ModificarAño(int nuevoaño){
        this.setAño(nuevoaño);
    }
}
