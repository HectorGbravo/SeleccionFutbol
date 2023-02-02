package oop.java.SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }
    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("El jugador esta jugando el partido");
    }
    public void entrenar() {
        System.out.println("El jugador está entrenando");
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
}
