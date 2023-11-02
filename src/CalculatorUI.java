import java.util.Scanner;

public class CalculatorUI {
    private Calculator calculator;
    private Scanner scanner;

    public CalculatorUI(Calculator calculator){
        this.calculator = calculator;
        scanner = new Scanner(System.in);
    }
    public void start(){
        boolean running = true;

        while(running){
            System.out.println("Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Limpiar");
            System.out.println("6. Obtener resultado");
            System.out.println("7. Salir");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Ingresa un número a sumar: ");
                    double num = scanner.nextDouble();
                    calculator.add(num);
                    break;
                case 2:
                    System.out.println("Ingresa un número a sumar: ");
                    num = scanner.nextDouble();
                    calculator.substract(num);
                    break;
                case 3:
                    System.out.println("Ingresa un número a sumar: ");
                    num = scanner.nextDouble();
                    calculator.multiply(num);
                    break;
                case 4:
                    System.out.println("Ingresa un número a sumar: ");
                    num = scanner.nextDouble();
                    calculator.divide(num);
                    break;
                case 5:
                    calculator.clear();
                    break;
                case 6:
                    System.out.println(calculator.getResult());
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("invalid option :S");
                    break;
            }
        }
    }
}
