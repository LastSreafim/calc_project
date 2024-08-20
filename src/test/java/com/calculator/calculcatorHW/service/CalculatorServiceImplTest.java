package com.calculator.calculcatorHW.service;

import com.calculator.calculcatorHW.exceptions.DivideByZeroException;
import com.calculator.calculcatorHW.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldCorrectlyCalculateSum() {
        //given
        int num1 = 10;
        int num2 = 20;
        int expectedResult = 30;

        //when
        Integer actualResult = calculatorService.plus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void shouldCorrectlyCalculateMinus() {
        //given
        int num1 = 10;
        int num2 = 20;
        int expectedResult = -10;

        //when
        Integer actualResult = calculatorService.minus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void shouldCorrectlyCalculateMultiply() {
        //given
        int num1 = 10;
        int num2 = 20;
        int expectedResult = 200;

        //when
        Integer actualResult = calculatorService.multiply(num1, num2);

        //then
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void shouldCorrectlyCalculateDivide() {
        //given
        int num1 = 10;
        int num2 = 10;
        int expectedResult = 1;

        //when
        Integer actualResult = calculatorService.divide(num1, num2);

        //then
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void shouldThrowExceptionsWhenSecondArgumentIsZero(){
        //given
        int num1 = 10;
        int num2 = 0;

        //when
        //then

        Assertions.assertThrows(
                DivideByZeroException.class,
                () -> {calculatorService.divide(num1, num2);}
        );

    }
}
