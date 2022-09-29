package net.ausiasmarch.calculator.service;

import net.ausiasmarch.calculator.entity.Calculation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public ResponseEntity<Calculation> add(Calculation calculation) {
        calculation.setResult(calculation.getOperator1() + calculation.getOperator2());
        return new ResponseEntity<>(calculation, HttpStatus.OK);
    }

    public ResponseEntity<Calculation> subtract(Calculation calculation) {
        calculation.setResult(calculation.getOperator1() - calculation.getOperator2());
        return new ResponseEntity<>(calculation, HttpStatus.OK);
    }

    public ResponseEntity<Calculation> multiply(Calculation calculation) {
        calculation.setResult(calculation.getOperator1() * calculation.getOperator2());
        return new ResponseEntity<>(calculation, HttpStatus.OK);
    }

    public ResponseEntity<Calculation> divide(Calculation calculation) {
        calculation.setResult(calculation.getOperator1() / calculation.getOperator2());
        return new ResponseEntity<>(calculation, HttpStatus.OK);
    }
}
