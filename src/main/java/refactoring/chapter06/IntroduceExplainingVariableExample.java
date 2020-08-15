package refactoring.chapter06;


/**
 * 「説明変数の導入」の例
 */
public class IntroduceExplainingVariableExample {
    double price() {
        // 価格(price)は、基本価格(base price) - 数量割引(quantity discount) + 送料(shipping)
        return _quantity * _itemPrice -
                Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
                Math.min(_quantity * _itemPrice * 0.1, 100.0);
    }

    /* 以下は書籍では記述されていない無関係な部分 */
    private int _quantity = 0;
    private int _itemPrice = 0;
}
