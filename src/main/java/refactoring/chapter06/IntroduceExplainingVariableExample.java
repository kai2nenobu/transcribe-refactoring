package refactoring.chapter06;


/**
 * 「説明変数の導入」の例
 */
public class IntroduceExplainingVariableExample {
    double price() {
        return basePrice() - quantityDiscount() + shipping();
    }

    private double quantityDiscount() {
        return Math.max(0, _quantity - 500) * _itemPrice * 0.05;
    }

    private double shipping() {
        return Math.min(basePrice() * 0.1, 100.0);
    }

    private double basePrice() {
        return _quantity * _itemPrice;
    }

    /* 以下は書籍では記述されていない無関係な部分 */
    private int _quantity = 0;
    private int _itemPrice = 0;
}
