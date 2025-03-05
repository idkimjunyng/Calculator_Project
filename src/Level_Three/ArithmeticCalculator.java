package Level_Three;


public class ArithmeticCalculator {

    private double firstNumber;
    private double secondNumber;
    private double resultNumber;
    private String symbol;
    private char charSymbol;

    public double getFirstNumber() {
        return this.firstNumber;
    }
    public double getSecondNumber() {
        return this.secondNumber;
    }
    public double getResultNumber() {
        return this.resultNumber;
    }
    public String getSymbol() {
        return this.symbol;
    }
    public char getCharSymbol() {
        return this.charSymbol;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public void setResultNumber(double resultNumber) {
        this.resultNumber = resultNumber;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void setCharSymbol(char charSymbol) {
        this.charSymbol = charSymbol;
    }

    public double calculate() {

        Number firstNumber = Number.FIRST_NUMBER;

        return this.getResultNumber();
    }
}
