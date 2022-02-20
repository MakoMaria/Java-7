public class Fraction {
    public int num;// числитель(numerator)
    public int den; // знаменатель(denominator)

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fraction() {
        this.num = 1;
        this.den = 1;
    }

    //Ищем сумму
    public static Fraction sum1(Fraction f1, Fraction f2) {
        int d = f1.den * f2.den;
        int n = (f1.num * f2.den) + (f2.num * f1.den);
        Fraction f3 = new Fraction(n, d);
        return f3;
    }

    public Fraction sum2(Fraction f2) {
        int d = this.den * f2.den;
        int n = (this.num * f2.den) + (f2.num * this.den);
        Fraction f3 = new Fraction(n, d);
        return f3;
    }

    public static Fraction sub1(Fraction f1, Fraction f2) {
        int d = f1.den * f2.den;
        int n = (f1.num * f2.den) - (f2.num * f1.den);
        Fraction f4 = new Fraction(n, d);
        return f4;
    }
    public Fraction sub2(Fraction f2) {
        int d = this.den * f2.den;
        int n = (this.num * f2.den) + (f2.num * this.den);
        Fraction f4 = new Fraction(n, d);
        return f4;
    }

    public static Fraction mul1(Fraction f1, Fraction f2) {
        int d = f2.den * f1.den;
        int n = f1.num * f2.num;
        Fraction f5 = new Fraction(n, d);
        return f5;
    }
    public Fraction mul2(Fraction f2) {
        int d = this.den * f2.den;
        int n = this.num * f2.den;
        Fraction f5 = new Fraction(n, d);
        return f5;
    }

}


