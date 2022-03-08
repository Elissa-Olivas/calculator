import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

    }

    public int x;
    public int y;

    List<Integer> numberList = new ArrayList<>();

    public int AddTwoNumbers() {
//        Scanner myScanner = new Scanner(System.in);
//        int userInput = myScanner.nextInt();
        numberList.add(new Integer(2));
        numberList.add(new Integer(5));
        numberList.add(new Integer(3));
        numberList.add(new Integer(5));
        int sumOfNumberList = 0;
        for (int i : numberList) {
            sumOfNumberList += i;
        }
        return sumOfNumberList;
    }


    public List<Integer> getNumberList() {
        return numberList;
    }

    //    public int AddTwoNumbers(int x, int y) {
//        int sum;
//        sum = x + y;
//        return sum;
//    }

    public int SubtractTwoNumbers(int x, int y) {
        int subtract;
        subtract = x - y;
        return subtract;
    }

    public int MultiplyTwoNumbers(int x, int y) {
        int multiply;
        multiply = x * y;
        return multiply;
    }

    public double DivideTwoNumbers(double x, double y) {
        double divide = x / y;
        return divide;
    }

    public int squareNumbers(int z) {
        int square = (int) Math.sqrt(z);
        return square;
    }
}
