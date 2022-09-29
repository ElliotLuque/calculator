package net.ausiasmarch.calculator.service;

import net.ausiasmarch.calculator.entity.Calculation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public ResponseEntity<Calculation> add(double operator1, double operator2) {
        Calculation calc = new Calculation(operator1, operator2);
        calc.setResult(calc.getOperator1() + calc.getOperator2());
        return new ResponseEntity<>(calc, HttpStatus.OK);
    }

    public ResponseEntity<Calculation> subtract(double operator1, double operator2) {
        Calculation calc = new Calculation(operator1, operator2);
        calc.setResult(calc.getOperator1() - calc.getOperator2());
        return new ResponseEntity<>(calc, HttpStatus.OK);
    }

    public ResponseEntity<Calculation> multiply(double operator1, double operator2) {
        Calculation calc = new Calculation(operator1, operator2);
        calc.setResult(calc.getOperator1() * calc.getOperator2());
        return new ResponseEntity<>(calc, HttpStatus.OK);
    }

    public ResponseEntity<Calculation> divide(double operator1, double operator2) {
        Calculation calc = new Calculation(operator1, operator2);
        calc.setResult(calc.getOperator1() / calc.getOperator2());
        return new ResponseEntity<>(calc, HttpStatus.OK);
    }
}
