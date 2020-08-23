package refactoring.chapter06;

/**
 * 「一時変数の分離」の例
 */
public class SplitTemporaryVariableExample {
    double getDistanceTravelled(int time) {
        double result;
        final double primaryAcc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * _delay;
            final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
            result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
        }
        return result;
    }

    /* 以下は書籍では記述されていない無関係な部分 */
    private double _primaryForce = 0.0;
    private double _mass = 0.0;
    private int _delay = 0;
    private double _secondaryForce = 0.0;
}
