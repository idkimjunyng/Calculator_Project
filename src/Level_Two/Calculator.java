package Level_Two;

import java.util.HashMap;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private int resultNumber;
    private String symbol;
    private char charSymbol;

    private HashMap<Integer, Integer> map = new HashMap<>();

    public Calculator() {}

    public Calculator(int firstNumber, int secondNumber, int resultNumber, String symbol) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.resultNumber = resultNumber;
        this.symbol = symbol;
    }

    // Getter First Number
    public int getFirstNumber() {
        return this.firstNumber;
    }

    // Getter Second Number
    public int getSecondNumber() {
        return this.secondNumber;
    }

    // Getter Result Number
    public int getResultNumber() {
        return this.resultNumber;
    }

    // Getter Symbol
    public String getSymbol() {
        return this.symbol;
    }

    // Getter charSymbol
    public char getCharSymbol() {
        return this.charSymbol;
    }

    // Setter First Number
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Setter Second Number
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Setter Result Number
    public void setResultNumber(int resultNumber) {
        this.resultNumber = resultNumber;
    }

    // Setter Symbol
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    // Setter charSymbol
    public void setCharSymbol(char charSymbol) {
        this.charSymbol = charSymbol;
    }


    public int calculate(int firstNumber, int secondNumber, String symbol) {

        int result = 0;

        if(symbol.equals("+")) {
            result = firstNumber + secondNumber;
        } else if(symbol.equals("-")) {
            result = firstNumber - secondNumber;
        } else if(symbol.equals("*")) {
            result = firstNumber * secondNumber;
        } else if(symbol.equals("/")) {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("+, -, *, / 특수문자만 입력 가능합니다.");
        }

        this.setResultNumber(result);

        this.addResult(result);

        return result;
    }

    public void addResult(int result) {
        map.put(map.size(), result);
        System.out.println("맵 사이즈: " + map.size());
        this.selectResult();
    }

    public void selectResult() {
        System.out.println("결과값 조회 리스트");
        if(map.size() > 0) {
            for(int i = 0; i < map.size(); i++) {
                System.out.println(i + " 번 째 결과값: " + map.get(i));
            }
        } else {
            System.out.println("조회할 결과값 데이터가 없습니다.");
        }
    }

    public void removeResult(int removeResultIndex) {
        map.remove(removeResultIndex);
        for(int i = 0; i < map.size(); i++) {
            map.put(i, map.get(i + 1));
        }
        map.remove(map.size() - 1);
        this.selectResult();
        System.out.println("삭제하신 " + removeResultIndex + " 인덱스 결과값이 성공적으로 삭제 되었습니다.");
    }

}
