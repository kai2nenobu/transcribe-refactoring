package refactoring.chapter06;


/**
 * 「説明変数の導入」の例
 */
public class IntroduceExplainingVariableExample {
    double price() {
        double basePrice = _quantity * _itemPrice;
        double quantityDiscount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
        double shipping = Math.min(_quantity * _itemPrice * 0.1, 100.0);
        return basePrice - quantityDiscount + shipping;
    }

    /* 以下は書籍では記述されていない無関係な部分 */
    private int _quantity = 0;
    private int _itemPrice = 0;
}
