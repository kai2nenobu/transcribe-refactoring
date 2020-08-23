package refactoring.chapter06;

public class ReplaceMethodWithMethodObjectExample {
    class Account {
        int gamme(int inputVal, int quantity, int yearToDate) {
            int importantValue1 = (inputVal * quantity) + delta();
            int importantValue2 = (inputVal * yearToDate) + 100;
            if ((yearToDate - importantValue1) > 100)
                importantValue2 -= 20;
            int importantValue3 = importantValue2 * 7;
            // 略
            return importantValue3 - 2 * importantValue1;
        }

        /* 以下は書籍では記述されていない無関係な部分 */
        private int delta() {
            return 0;
        }
    }

    class Gamma {
        private final Account _account;
        private int inputVal;
        private int quantity;
        private int yearToDate;
        private int importantValue1;
        private int importantValue2;
        private int importantValue3;

        Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
            _account = source;
            inputVal = inputValArg;
            quantity = quantityArg;
            yearToDate = yearToDateArg;
        }
    }
}
