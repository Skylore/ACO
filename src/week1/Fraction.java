package week1;

public class Fraction {

    // Fields
    private int numerator;
    private int denominator;

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

    public double toLine() {

        double res = ((double) this.numerator) / ((double) this.denominator);

        return res;
    }

    public void print() {

        System.out.println(this.numerator + "\n--\n" + this.denominator);
    }

    public void compare(Fraction fraction) {

        int cheqThisNum = this.numerator * fraction.denominator;
        int cheqFracNum =  fraction.numerator * this.denominator;

        System.out.println(cheqThisNum > cheqFracNum ? this.numerator + "\n-- -> Bigger\n" + this.denominator :
                fraction.numerator + "\n-- -> Bigger\n" + fraction.denominator);
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

}