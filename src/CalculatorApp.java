public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorUI ui = new CalculatorUI(calculator);
        ui.start();
    }
}
