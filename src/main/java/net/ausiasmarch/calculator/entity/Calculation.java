package net.ausiasmarch.calculator.entity;

public class Calculation {

    private double operator1;
    private double operator2;
    private double result;

    public Calculation(double operator1, double operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public double getOperator1() {
        return operator1;
    }
    public void setOperator1(double operator1) {
        this.operator1 = operator1;
    }

    public double getOperator2() {
        return operator2;
    }
    public void setOperator2(double operator2) {
        this.operator2 = operator2;
    }

    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }

}
