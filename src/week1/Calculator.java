package week1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        execute(new Scanner(System.in).nextLine());
    }

    private static void execute(String ln) {

        String[] mas = ln.split(" ");

        if (mas.length != 3) {
            return;
        }

        int val = Integer.valueOf(mas[0]);
        int val1 = Integer.valueOf(mas[2]);

        char action = ' ';

        if (mas[1].equals("+")) {
            action = '+';
        } else if (mas[1].equals("-")) {
            action = '-';
        } else if (mas[1].equals("*")) {
            action = '*';
        } else if (mas[1].equals("/")) {
            action = '/';
        }

        Execute run = new Execute(val, val1, action);

        System.out.println(run.res());
    }
}

class Execute {

    private int val;
    private int val1;
    private char action;

    Execute(int val, int val1, char action) {
        this.val = val;
        this.val1 = val1;
        this.action = action;
    }

    double res() {

        if (action == '+') {
            return val + val1;
        } else if (action == '-') {
            return val - val1;
        } else if (action == '*') {
            return val * val1;
        } else if (action == '/') {
            return (double)val / (double)val1;
        }

        return 0;
    }
}
