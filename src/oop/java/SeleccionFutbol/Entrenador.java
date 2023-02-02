package oop.java.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador() {
        super();
    }
    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido() {
        System.out.println("El entrenador está dirigiendo el partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador está dirigiendo el entrenamiento");
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
}
