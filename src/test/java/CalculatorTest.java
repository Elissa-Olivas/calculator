import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void newCalc () {
        myCalc = new Calculator();
    }
    private Calculator myCalc;

    @Test
    void TestAddTwoNumbers(){ //bonus using an Array
//        Calculator testSumOfArray = new Calculator();
        int result = myCalc.AddTwoNumbers();
        assertEquals(result, 15);
    }
//    void TestAddTwoNumbers() {
//        //Arrange
//        Calculator testSum = new Calculator();
//
//        //Act
//        int result = testSum.AddTwoNumbers(5, 4); //enter 6 here and it fails
//
//        //Assert
//        assertEquals(result, 9);
//    }


    @Test
    void TestSubtractTwoNumbers() {
        //Arrange
//        Calculator testSubtract = new Calculator();

        //Act
        int result = myCalc.SubtractTwoNumbers(5, 4); //enter 6 here and it fails

        //Assert
        assertEquals(result, 1);
    }


    @Test
    void multiplyTwoNumbers() {
        //Arrange
//        Calculator testMultiply = new Calculator();

        //Act
        int result = myCalc.MultiplyTwoNumbers(5, 4); //enter 6 here and it fails

        //Assert
        assertEquals(result, 20);
    }


    @Test
    void divideTwoNumbers() {
        //Arrange
//        Calculator testDivide = new Calculator();

        //Act
        double result = myCalc.DivideTwoNumbers(16, 4); //enter 6 here and it fails

        //Assert
        assertEquals(result, 4);
    }

    @Test
    void squareNumbers() {
        //Arrange
//        Calculator testSquare = new Calculator();

        //Act
        int result = myCalc.squareNumbers(4);

        //Assert
        assertEquals(result, 2);
    }

}