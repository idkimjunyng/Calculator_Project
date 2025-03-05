package Level_Two;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(0, 0, 0, "");

        Scanner scanner = new Scanner(System.in);

        boolean loopFlag = true;

        while(loopFlag) {
            System.out.println("첫 번째 숫자를 입력해 주세요");

            int firstNumber = scanner.nextInt();
            calculator.setFirstNumber(firstNumber);


            System.out.println("두 번째 숫자를 입력해 주세요");
            int secondNumber = scanner.nextInt();
            calculator.setSecondNumber(secondNumber);

            System.out.println("사칙 연산 기호를 입력해 주세요");
            String symbol = scanner.next();
            char charSymbol = symbol.charAt(0);
            calculator.setSymbol(symbol);
            calculator.setCharSymbol(charSymbol);


//            int resultNumberSuccess = 0;
//
//            if(symbol.equals("+")) {
//                resultNumberSuccess = firstNumber + secondNumber;
//            } else if(symbol.equals("-")) {
//                resultNumberSuccess = firstNumber - secondNumber;
//            } else if(symbol.equals("*")) {
//                resultNumberSuccess = firstNumber * secondNumber;
//            } else if(symbol.equals("/")) {
//                resultNumberSuccess = firstNumber / secondNumber;
//            } else {
//                System.out.println("+, -, *, / 특수문자만 입력 가능합니다.");
//            }
//            calculator.setResultNumber(resultNumberSuccess);

            int resultNumberSuccess = calculator.calculate(firstNumber, secondNumber, symbol);

            System.out.println("결과값: " + resultNumberSuccess);

            System.out.println("삭제하실 결과 값이 있나요?[Y(y)/N(n)]");
            String removeYN = scanner.next();
            if(removeYN.equals("Y") || removeYN.equals("y")) {
                System.out.println("삭제하실 결과 값의 인덱스를 입력 해 주세요");
                int removeResultIndex = scanner.nextInt();
                calculator.removeResult(removeResultIndex);

            } else {
                removeYN = "n";
            }


            System.out.println("더 계산하시겠습니까?");
            String calculatorRepeat = scanner.next();
            if(calculatorRepeat.equals("exit")) {
                loopFlag = false;
            }

        }



    }
}
