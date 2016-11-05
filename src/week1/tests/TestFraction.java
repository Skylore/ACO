package week1.tests;

import week1.Fraction;

public class TestFraction {

    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(4,
                                          9);
        Fraction fraction2 = new Fraction(2,
                                          3);

        Fraction sum = new Fraction(fraction1.sum(fraction2).getNumerator(),
                fraction1.sum(fraction2).getDenominator());

        System.out.println(sum.getNumerator() + "\n--  -> " + (sum.getNumerator() == 30 && sum.getDenominator() == 27) +
                "\n" + sum.getDenominator() + "\n");

        Fraction diff = new Fraction(fraction1.diff(fraction2).getNumerator(),
                fraction1.diff(fraction2).getDenominator());

        System.out.println(diff.getNumerator() + "\n--  -> " + (diff.getNumerator() == -6 && diff.getDenominator() == 27) +
                "\n" + diff.getDenominator());

        Fraction mult = new Fraction(fraction1.mult(fraction2).getNumerator(),
                fraction1.mult(fraction2).getDenominator());

        System.out.println(mult.getNumerator() + "\n--  -> " + (mult.getNumerator() == 8 && mult.getDenominator() == 27) +
                "\n" + mult.getDenominator());

        Fraction div = new Fraction(fraction1.div(fraction2).getNumerator(),
                fraction1.div(fraction2).getDenominator());

        System.out.println(div.getNumerator() + "\n--  -> " + (div.getNumerator() == 12 && div.getDenominator() == 18) +
                "\n" + div.getDenominator());

        Fraction isBigger = new Fraction(fraction1.isBigger(fraction2).getNumerator(),
                fraction1.isBigger(fraction2).getDenominator());

        System.out.println(isBigger.getNumerator() + "\n--  -> " + (isBigger.getNumerator() == 2 && isBigger.getDenominator() == 3) +
                "\n" + isBigger.getDenominator());

        Fraction ln = new Fraction(fraction1.toLine().getNumerator(), 0);

        System.out.println(ln.getNumerator() + " " +
                (ln.getNumerator()  == fraction1.getNumerator() / fraction1.getDenominator()));

        Fraction print = new Fraction(fraction1.getNumerator(), fraction1.getDenominator());

        print.print();

    }
}
