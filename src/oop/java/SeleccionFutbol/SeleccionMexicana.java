package oop.java.SeleccionFutbol;

import java.util.ArrayList;

public class SeleccionMexicana {
    // ArrayList de objetos SeleccionFutbol. Independientemente de la clase hija o a la que pertenezca el objeto
    public static ArrayList<SeleccionFutbol> integrantesSeleccion = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        Entrenador entrenador = new Entrenador(0,"Hugo", "Sanchez",60,"FEMEXFUT12345");
        Futbolista futbolista = new Futbolista(22,"Irving", "Lozano", 25, 22,"delantero");
        Masajista masajista = new Masajista(99,"Pedro","Lopez",55,"Lic. Fisioterapia",10);

        integrantesSeleccion.add(entrenador);
        integrantesSeleccion.add(futbolista);
        integrantesSeleccion.add(masajista);

        // Método concentracion
        System.out.println("Todos los integrantes de la selección se está concentrando en el Centro de Alto Rendimiento");
        System.out.println("Todos ejecutan el mismo método");
        for(SeleccionFutbol integrantes: integrantesSeleccion) {
            System.out.print(integrantes.getNombre()+" "+integrantes.getApellido()+" -> ");
            integrantes.Concentrarse();
        }
        // Metodo viaje
        System.out.println("Todos los integrantes del equipo está viajando para su siguiente encuentro");
        System.out.println("Todos ejecutan el mismo método");
        for(SeleccionFutbol integrantes: integrantesSeleccion) {
            System.out.print(integrantes.getNombre()+" "+integrantes.getApellido()+" -> ");
            integrantes.Viajar();
        }
        // Metodo entrenamiento
        System.out.println("\nEntrenamiento:  Solo el futbolista y el entrenador tienen métodos para entrenar");
        System.out.print("\nEntrenador: "+entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
        entrenador.dirigirEntrenamiento();
        System.out.print("\nFutbolista: "+futbolista.getNombre()+" "+futbolista.getApellido()+" -> ");
        futbolista.entrenar();
        // Metodo masaje
        System.out.println("\nMasaje:  Solo el masajista tiene métodos para dar masaje");
        System.out.printf("\nMasajista: "+masajista.getNombre()+" "+masajista.getApellido()+" -> ");
        masajista.darMasaje();
        // Metodo jugar
        System.out.println("\nJuego: Solo el entrenador y el futbolista tienen métodos para jugar");
        System.out.print("\nEntrenador: "+entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
        entrenador.dirigirPartido();
        System.out.print("\nFutbolista: "+futbolista.getNombre()+" "+futbolista.getApellido()+" -> ");
        futbolista.jugarPartido();

    }
}
