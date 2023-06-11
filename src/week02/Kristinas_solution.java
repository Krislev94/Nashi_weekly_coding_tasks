package week02;

public class Kristinas_solution {
    public static void main(String[] args) {
        swapVariables(45,10);
        swapVariables(23,54);
    }

    public static void swapVariables(int x, int y){

        x = x + y; // Getting sum of the two numbers
        y = x - y; // Subtracting 'x' from the sum to assign it to 'y'
        x = x - y; // 'x' is still the sum, so it's important to have this step last. Subtracting 'y' from the sum and assigning it to 'x'


        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
