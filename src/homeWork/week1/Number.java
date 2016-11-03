package homeWork.week1;

public class Number {

    private int a;
    private int b;

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return this.a + this.b;
    }

    public int sub() {
        return this.a - this.b;
    }

    public int mult() {
        return this.a * this.b;
    }

    public int div() {
        return this.a / this.b;
    }

    public int pow() {
        return ((int) Math.pow(this.a, this.b));
    }

    public int factorialA() {

        int res = 1;

        for (int i = 1; i <= this.a; i++) {
            res *= i;
        }

        return res;
    }

    public int factorialB() {

        int res = 1;

        for (int i = 1; i <= this.b; i++) {
            res *= i;
        }

        return res;
    }

    public int mod() {

        return a % b;
    }

    public String compare() {

        return a > b ? "a > b" : "a < b";
    }
}
