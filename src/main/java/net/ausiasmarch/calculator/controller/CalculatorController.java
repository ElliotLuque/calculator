package net.ausiasmarch.calculator.controller;

import net.ausiasmarch.calculator.entity.Calculation;
import net.ausiasmarch.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add/{operator1}/{operator2}")
    public ResponseEntity<Calculation> add(@PathVariable double operator1, @PathVariable double operator2) {
        return calculatorService.add(operator1, operator2);
    }

    @GetMapping("/minus/{operator1}/{operator2}")
    public ResponseEntity<Calculation> subtract(@PathVariable double operator1, @PathVariable double operator2) {
        return calculatorService.subtract(operator1, operator2);
    }

    @GetMapping("/multiply/{operator1}/{operator2}")
    public ResponseEntity<Calculation> multiply(@PathVariable double operator1, @PathVariable double operator2) {
        return calculatorService.multiply(operator1, operator2);
    }

    @GetMapping("/div/{operator1}/{operator2}")
    public ResponseEntity<Calculation> divide(@PathVariable double operator1, @PathVariable double operator2) {
        return calculatorService.divide(operator1, operator2);
    }
}
