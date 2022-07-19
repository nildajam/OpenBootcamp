package segunda_parte;

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println("El número de puertas es: " + miCoche.puertas);
    }
}
class Coche {
    public int puertas = 5;

    public void AgregarPuertas() {

        this.puertas++;
    }
}