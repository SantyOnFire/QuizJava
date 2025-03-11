import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Auto> listaAutos = new ArrayList<>();

        while (true) {
            System.out.println("1. Crear Auto");
            System.out.println("2. Mostrar Autos");
            System.out.println("3. Actualizar Kilometraje");
            System.out.println("4. Verificar si un Auto es Antiguo");
            System.out.println("5. Verificar si un Auto necesita Mantenimiento");
            System.out.println("6. Calcular Consumo de Combustible");
            System.out.println("7. Calcular Combustible Restante");
            System.out.println("8. Salir");
            System.out.println("Ingrese alguna opcion del Sistema");

            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                System.out.print("Marca: ");
                String marca = sc.nextLine();
                System.out.print("Modelo: ");
                String modelo = sc.nextLine();
                System.out.print("Año: ");
                int anio = sc.nextInt();
                System.out.print("Kilometraje: ");
                double kilometraje = sc.nextDouble();
                sc.nextLine();
                System.out.print("Estado: ");
                String estado = sc.nextLine();

                listaAutos.add(new Auto(placa, marca, modelo, anio, kilometraje, estado));

            } else if (opcion == 2) {
                for (Auto auto : listaAutos) {
                    auto.mostrarDetalles();
                }

            } else if (opcion == 3) {
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                System.out.print("Nuevo Kilometraje: ");
                double nuevoKm = sc.nextDouble();
                for (Auto auto : listaAutos) {
                    if (auto.placa.equals(placa)) {
                        auto.actualizarKilometraje(nuevoKm);
                    }
                }

            } else if (opcion == 4) {
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                for (Auto auto : listaAutos) {
                    if (auto.placa.equals(placa)) {
                        System.out.println(auto.esAntiguo());
                    }
                }

            } else if (opcion == 5) {
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                for (Auto auto : listaAutos) {
                    if (auto.placa.equals(placa)) {
                        System.out.println(auto.necesitaMantenimiento());
                    }
                }

            } else if (opcion == 6) {
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                System.out.print("Distancia: ");
                double distancia = sc.nextDouble();
                System.out.print("Consumo por km: ");
                double consumoPorKm = sc.nextDouble();
                for (Auto auto : listaAutos) {
                    if (auto.placa.equals(placa)) {
                        System.out.println(auto.calcularConsumoCombustible(distancia, consumoPorKm));
                    }
                }

            } else if (opcion == 7) {
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                System.out.print("Tanque actual: ");
                double tanque = sc.nextDouble();
                System.out.print("Distancia: ");
                double distancia = sc.nextDouble();
                System.out.print("Consumo por km: ");
                double consumoPorKm = sc.nextDouble();
                for (Auto auto : listaAutos) {
                    if (auto.placa.equals(placa)) {
                        System.out.println(auto.combustibleRestante(tanque, distancia, consumoPorKm));
                    }
                }

            } else if (opcion == 8) {
                break;
            }
        }
        sc.close();
    }
}
