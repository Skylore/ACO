package week1;

public class Array {

    public static void main(String[] args) {

        int[] mas = {1,23,4,5,6,7};
        Array array = new Array(mas);

        int[] mas1 = {1,3,4,5,6,7};
        boolean compare = array.compare(mas1);
        System.out.println(compare);
    }

    // Fields
    private int[] array;
    private int range;
    private int length;


    // Constructor
    public Array(int[] nums) {
        this.array = nums;
    }

    public Array(int length, int range) {
        this.range = range;
        this.length = length;
    }

    // Functions
    public int min() {

        int min = this.array[0];

        for (int i = 1; i < this.array.length; i++) {
            min = min > this.array[i] ? this.array[i] : min;
        }

        return min;
    }

    public int max() {

        int max = this.array[0];

        for (int i = 0; i < this.array.length; i++) {
            max = max < this.array[i] ? this.array[i] : max;
        }

        return max;
    }

    public Array fillRandom() {

        int mas[] = new int[this.length];

        for (int i = 0; i < this.length; i++) {
            mas[i] = ((int) (Math.random() * this.range));
        }

        return new Array(mas);
    }

    public void print() {

        String res = "";

        for (int i = 0; i < this.array.length; i++) {
            res += this.array[i] + ", ";
        }

        System.out.println("{" + res.substring(0, res.length() - 2) + "}");
    }

    public Array increase(int enlarge) {

        int[] mas = new int[this.array.length + enlarge];

        for (int i = 0; i < this.array.length; i++) {
            mas[i] = this.array[i];
        }

        if (mas.length > this.array.length) {
            for (int i = mas.length - this.array.length; i > 0 ; i--) {
                mas[mas.length - i] = ((int) (Math.random() * 10));
            }
        }

        return new Array(mas);
    }

    public Array sort() {

        for (int i = 1; i < this.array.length; i++) {
            for (int j = this.array.length - 1; j >= i; j--) {
                if (this.array[j - 1] > this.array[j]) {
                    int c = this.array[j - 1];
                    this.array[j - 1] = this.array[j];
                    this.array[j] = c;
                }
            }
        }

        return new Array(this.array);
    }

    public boolean compare(int[] mas) {

        if (mas.length == this.length) {
            for (int i = 0; i < mas.length; i++) {
                if (this.array[i] != mas[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Getters

    public int[] getArray() {
        return array;
    }
}
