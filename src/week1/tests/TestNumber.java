package week1.tests;

import week1.Number;

public class TestNumber {

    public static void main(String[] args) {

        Number number1 = new Number(9);
        Number number2 = new Number(4);

        Number sum = new Number(number1.sum(number2).getVal());
        System.out.println(sum.getVal() + " " + (sum.getVal() == 13));

        Number diff = new Number(number1.diff(number2).getVal());
        System.out.println(diff.getVal() + " " + (diff.getVal() == 5));

        Number mult = new Number(number1.mult(number2).getVal());
        System.out.println(mult.getVal() + " " + (mult.getVal() == 36));

        Number div = new Number(number1.div(number2).getVal());
        System.out.println(div.getVal() + " " + (div.getVal() == 2));

        Number pow = new Number(number1.pow(number2).getVal());
        System.out.println(pow.getVal() + " " + (pow.getVal() == 6561));

        Number factorial = new Number(number1.factorial().getVal());
        System.out.println(factorial.getVal() + " " + (factorial.getVal() == 362880));

        Number mod = new Number(number1.mod(number2).getVal());
        System.out.println(mod.getVal() + " " + (mod.getVal() == 1));

        Number bigger = new Number(number1.bigger(number2).getVal());
        System.out.println(bigger.getVal() + " " + (bigger.getVal() == 9));
    }
}
