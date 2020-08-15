package refactoring.chapter06;

import java.util.Enumeration;
import java.util.Vector;


/**
 * 「メソッドの抽出」の例
 */
public class ExtractMethodExample {
    void printOwing() {

        printBanner();

        double outstanding = getOutstanding();

        printDetails(outstanding);
    }

    void printOwing(double previousAmount) {
        printBanner();
        double outstanding = getOutstanding(previousAmount * 1.2);
        printDetails(outstanding);
    }

    void printBanner() {
        // バナーの印刷
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");
    }

    void printDetails(double outstanding) {
        System.out.println("name:" + _name);
        System.out.println("amount:" + outstanding);
    }

    double getOutstanding() {
        double result = 0.0;
        Enumeration e = _orders.elements();
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    double getOutstanding(double initialValue) {
        double result = initialValue;
        Enumeration e = _orders.elements();
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    /* 以下は書籍では記述されていない無関係な部分 */
    private Vector _orders = new Vector();
    private String _name = "Dummy";

    private class Order {
        public double getAmount() {
            return 0.0;
        }
    }
}
