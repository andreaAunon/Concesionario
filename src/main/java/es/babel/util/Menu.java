package es.babel.util;

import es.babel.controllers.CocheController;
import es.babel.controllers.FacturaController;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private boolean isInSession;
    private CocheController cocheController;
    private FacturaController facturaController;

    public Menu(){
        this.scanner = new Scanner(System.in);
        this.cocheController = new CocheController();
        this.facturaController = new FacturaController();
        this.isInSession = true;
    }

    public void initMenu(){
        while(isInSession){
            System.out.println("Bienvenido, por favor elija la operación que desea realizar:");
            System.out.println("1. Añadir vehículo");
            System.out.println("2. Eliminar vehículo");
            System.out.println("3. Buscar vehículo");
            System.out.println("4. Calcular total de una factura");
            System.out.println("5. Buscar factura");
            System.out.println("6. Salir");
            realizeOperation();
        }
    }

    private void realizeOperation(){
        String option = scanner.nextLine();

        switch(option){
            case "1":
                addCoche();
                break;
            case "2":
                removeCoche();
                break;
            case "3":
                findVehiculo();
                break;
            case "4":
                calcularFactura();
                break;
            case "5":
                findFactura();
                break;
            case "6":
                isInSession = false;
                break;
            default:
                break;
        }
    }

    private void addCoche(){
        System.out.println("Introduzca matrícula del vehículo nuevo:");
        String matricula = scanner.nextLine();
        System.out.println("Introduzca tipo de vehículo (gas/diesel):");
        String tipo = scanner.nextLine();
        String operation = this.cocheController.addCoche(matricula,tipo);
        System.out.println(operation);
    }

    private void removeCoche(){
        System.out.println("Introduzca matrícula del vehículo a eliminar:");
        String matricula = scanner.nextLine();
        String operation = this.cocheController.deleteCoche(matricula);
        System.out.println(operation);
    }

    private void findVehiculo(){
        System.out.println("Introduzca matrícula del vehículo:");
        String matricula = scanner.nextLine();
        String operation = this.cocheController.findCocheByMatricula(matricula);
        System.out.println(operation);
    }

    private void calcularFactura(){
        System.out.println("Introduzca id de la factura:");
        String id = scanner.nextLine();
        String amount = this.facturaController.calculateTotalFactura(id);
        System.out.println(amount);
    }

    private void findFactura(){
        System.out.println("Introduzca id de la factura:");
        String id = scanner.nextLine();
        String operation = this.facturaController.findFacturaById(id);
        System.out.println(operation);
    }
}
