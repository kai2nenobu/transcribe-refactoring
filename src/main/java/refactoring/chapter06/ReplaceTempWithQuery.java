package refactoring.chapter06;


/**
 * 「問い合わせによる一時変数の置き換え」の例
 */
public class ReplaceTempWithQuery {
    double getPrice() {
        return basePrice() * discountFactor();
    }

    private int basePrice() {
        return _quantity * _itemPrice;
    }

    private double discountFactor() {
        if (basePrice() > 1000) return 0.95;
        else return 0.98;
    }

    /* 以下は書籍では記述されていない無関係な部分 */
    private int _quantity = 0;
    private int _itemPrice = 0;
}
