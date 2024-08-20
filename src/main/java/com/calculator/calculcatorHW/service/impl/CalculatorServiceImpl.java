package com.calculator.calculcatorHW.service.impl;

import com.calculator.calculcatorHW.exceptions.DivideByZeroException;
import com.calculator.calculcatorHW.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new DivideByZeroException("На ноль не делим!");
        }
        return num1 / num2;
    }
}
