package week1;

public class Number {

    private int val;

    public Number(int a) {
        this.val = a;
    }

    public Number sum(Number number) {

        return new Number(this.val + number.val);
    }

    public Number diff(Number number) {

        return new Number(this.val - number.val);
    }

    public Number mult(Number number) {

        return new Number(this.val * number.val);
    }

    public Number div(Number number) {

        return new Number(this.val / number.val);
    }

    public Number pow(Number number) {

        return new Number(((int) Math.pow(this.val, number.val)));
    }

    public Number factorial() {

        int res = 1;

        for (int i = 1; i <= this.val; i++) {
            res *= i;
        }

        return new Number(res);
    }

    public Number mod(Number number) {

        return new Number(this.val % number.val);
    }

    public Number bigger(Number number) {

        return new Number(this.val > number.val ? this.val : number.val);
    }

    public int getVal() {
        return val;
    }
}

