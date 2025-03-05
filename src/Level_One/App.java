package Level_One;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loopFlag = true;

        while(loopFlag) {
            System.out.println("첫 번째 숫자를 입력해 주세요");

            int firstNumber = scanner.nextInt();


            System.out.println("두 번째 숫자를 입력해 주세요");
            int secondNumber = scanner.nextInt();


            System.out.println("사칙 연산 기호를 입력해 주세요");
            String symbol = scanner.next();
            char charSymbol = symbol.charAt(0);



            int resultNumberSuccess = 0;

            if(symbol.equals("+")) {
                resultNumberSuccess = firstNumber + secondNumber;
            } else if(symbol.equals("-")) {
                resultNumberSuccess = firstNumber - secondNumber;
            } else if(symbol.equals("*")) {
                resultNumberSuccess = firstNumber * secondNumber;
            } else {
                resultNumberSuccess = firstNumber / secondNumber;
            }

            System.out.println("결과값: " + resultNumberSuccess);

            System.out.println("더 계산하시겠습니까?");
            String calculatorRepeat = scanner.next();
            if(calculatorRepeat.equals("exit")) {
                loopFlag = false;
            }
        }
    }
}
