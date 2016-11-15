package week1;

public class Line {

    //Fields
    private String line;
    private char[] chars;

    //Constructors
    public Line(String line) {
        this.line = line;
    }

    public Line(char[] chars) {
        this.chars = chars;
    }

    //Functions
    public Line toLine() {

        return new Line(new String(this.chars));
    }

    public void print() {
        System.out.println(this.line);
    }

    public Line concat(Line added) {
        return new Line(this.line + added.line);
    }

    public Line toLowerCase() {
        return new Line(this.line.toLowerCase());
    }

    public Line toUpperCase() {
        return new Line(this.line.toUpperCase());
    }

    public void indexOf(Line arg) {
        System.out.println((this.line.indexOf(arg.line) + 1) + " " +
                (this.line.indexOf(arg.line) + arg.getLine().length() + 1));
    }

    public Line distinguishSub(Line sub) {
        String front = this.line.substring(0, this.line.indexOf(sub.line) + 1);
        String end = this.line.substring(this.line.indexOf(sub.line) + sub.getLine().length() + 1);

        return new Line(front + " " + sub.toUpperCase().getLine() + " " + end);
    }

    public Line split() {

        String res = "";
        char[] mas = new char[this.line.length()];

        for (int i = 0; i < mas.length; i++) {
            res += mas[i] != ' ' ? mas[i] : "";
        }

        return new Line(res);
    }

    public String getLine() {
        return line;
    }
}
