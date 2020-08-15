package refactoring.chapter06;


/**
 * 「問い合わせによる一時変数の置き換え」の例
 */
public class ReplaceTempWithQuery {
    double getPrice() {
        int basePrice = _quantity * _itemPrice;
        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;
        return basePrice * discountFactor;
    }

    /* 以下は書籍では記述されていない無関係な部分 */
    private int _quantity = 0;
    private int _itemPrice = 0;
}
