package hw3;

public class Money {
    private long money;
    private byte coins;

    public Money(long money, byte coins) {
        this.money = money;
        this.coins = coins;
    }

    public Money(double v) {
        this.money = (long) v;
        this.coins = (byte) ((v - money) * 100);
    }


    public double percentValue() {
        return money + (double) coins / 100;
    }

    public static Money add(Money val1, Money val2) {
        return new Money(val1.percentValue() + val2.percentValue());
    }

    public static Money substract(Money val1, Money val2) {
        return new Money(val1.percentValue() - val2.percentValue());
    }

    public static Money multiply(Money val1, Money val2) {
        return new Money(val1.percentValue() * val2.percentValue());
    }

    public static Money divide(Money val1, Money val2) {
        return new Money(val1.percentValue() / val2.percentValue());
    }

    public static boolean more(Money val1, Money val2) {
        return val1.percentValue() > val2.percentValue();
    }

    public static boolean less(Money val1, Money val2) {
        return val1.percentValue() < val2.percentValue();
    }

    public static boolean equal(Money val1, Money val2) {
        return val1.percentValue() == val2.percentValue();
    }


    @Override
    public String toString() {
        return
                money + "," +
                        coins;
    }
}
