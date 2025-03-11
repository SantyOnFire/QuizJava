public class Auto {
    String placa;
    String marca;
    String modelo;
    int anio;
    double kilometraje;
    String estado;

    public Auto(String placa, String marca, String modelo, int anio, double kilometraje, String estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estado = estado;

    }

    public void mostrarDetalles() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Estado: " + estado);
    }

    public void actualizarKilometraje(double nuevoKilometraje) {
        kilometraje = nuevoKilometraje;
    }

    public boolean esAntiguo() {
        return (2025 - anio) > 15;
    }

    public boolean necesitaMantenimiento() {
        return kilometraje > 100000;
    }

    public double calcularConsumoCombustible(double distancia, double consumoPorKm) {
        return distancia * consumoPorKm;
    }

    public double combustibleRestante(double tanqueActual, double distancia, double consumoPorKm) {
        return tanqueActual - calcularConsumoCombustible(distancia, consumoPorKm);
    }
}
