package refactoring.chapter06;

import java.util.Enumeration;
import java.util.Vector;


/**
 * 「メソッドの抽出」の例
 */
public class ExtractMethodExample {
    void printOwing() {
        Enumeration e = _orders.elements();
        double outstanding = 0.0;

        printBanner();

        // 未払金の計算
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        // 明細の印刷
        System.out.println("name:" + _name);
        System.out.println("amount:" + outstanding);
    }

    void printBanner() {
        // バナーの印刷
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");
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
