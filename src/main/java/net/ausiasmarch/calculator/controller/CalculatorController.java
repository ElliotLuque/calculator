package net.ausiasmarch.calculator.controller;

import net.ausiasmarch.calculator.entity.Calculation;
import net.ausiasmarch.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/add")
    public ResponseEntity<Calculation> add(@RequestBody Calculation calculation) {
        return calculatorService.add(calculation);
    }

    @PostMapping("/minus")
    public ResponseEntity<Calculation> subtract(@RequestBody Calculation calculation) {
        return calculatorService.subtract(calculation);
    }

    @PostMapping("/multiply")
    public ResponseEntity<Calculation> multiply(@RequestBody Calculation calculation) {
        return calculatorService.multiply(calculation);
    }

    @PostMapping("/div")
    public ResponseEntity<Calculation> divide(@RequestBody Calculation calculation) {
        return calculatorService.divide(calculation);
    }
}
