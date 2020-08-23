package refactoring.chapter06;

/**
 * 「パラメータへの代入の除去」の例
 */
public class RemoveAssignmentToParametersExample {
    int discount(int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) inputVal -=2;
        if (quantity > 100) inputVal -= -1;
        if (yearToDate > 10000) inputVal -= 4;
        return inputVal;
    }
}
