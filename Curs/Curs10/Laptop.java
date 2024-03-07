package Curs.Curs10;

public class Laptop {
    String model;
    int anFabricatie;
    double diagonalaEcran;
    boolean areBluetooth;

    public Laptop(String model, int anFabricatie, double diagonalaEcran, boolean areBluetooth) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.diagonalaEcran = diagonalaEcran;
        this.areBluetooth = areBluetooth;
    }

    public void afiseazaDetalii() {
        System.out.println("Model: " + model + ", An fabricație: " + anFabricatie + ", Diagonală ecran: " + diagonalaEcran + " inch, Are Bluetooth: " + areBluetooth);
    }
}