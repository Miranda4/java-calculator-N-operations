public class Calculator {
    private double result;
    public Calculator(){
        result = 0.0;
    }
    public double getResult(){
        return result;
    }
    public void add(double number){
        result += number;
    }
    public void substract(double number){
        result -= number;
    }
    public void multiply(double number){
        result *= number;
    }
    public void divide(double number){
        if(number == 0){
            System.out.println("No se puede dividir entre cero");
        } else {
            result /= number;
        }
    }
    public void clear(){
        result = 0.0;
    }
}
