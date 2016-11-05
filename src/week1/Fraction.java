package week1;

public class Fraction {

    // Fields
    private int numerator;
    private int denominator;
    private double line;

    // Constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Functions
    public Fraction sum(Fraction fraction) {

        if (this.denominator != fraction.denominator) {

            this.numerator *= fraction.denominator;
            fraction.numerator *= this.denominator;

            return new Fraction(this.numerator + fraction.numerator, this.denominator * fraction.denominator);
        }

        return new Fraction(this.numerator + fraction.numerator, this.denominator);
    }

    public Fraction diff(Fraction fraction) {

        if (this.denominator != fraction.denominator) {

            this.numerator *= fraction.denominator;
            fraction.numerator *= this.denominator;

            return new Fraction(this.numerator - fraction.numerator, this.denominator * fraction.denominator);
        }

        return new Fraction(this.numerator - fraction.numerator, this.denominator);
    }

    public Fraction mult(Fraction fraction) {

        return new Fraction(this.numerator * fraction.numerator,
                this.denominator * fraction.denominator);
    }

    public Fraction div(Fraction fraction) {

        return new Fraction(this.numerator * fraction.denominator,
                this.denominator * fraction.numerator);
    }

    public Fraction toLine() {

        return  new Fraction(this.numerator / this.denominator, 0);
    }

    public void print() {

        System.out.println(this.numerator + "\n--\n" + this.denominator);
    }

    public Fraction isBigger(Fraction fraction) {

        int cheqThisNum = this.numerator * fraction.denominator;
        int cheqFracNum =  fraction.numerator * this.denominator;

        return cheqThisNum > cheqFracNum ? new Fraction(this.numerator, this.denominator) :
                new Fraction(fraction.numerator, fraction.denominator);
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

}
