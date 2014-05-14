package source;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGen {

    private final int n;

    public FibonacciGen(int n) {
        this.n = n;
    }

    public int fiboNumber(int n) {
        return n < 2 ? 1 : fiboNumber(n - 2) + fiboNumber(n - 1);
    }

    public List<Integer> getFiboRow() {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            row.add(fiboNumber(i));
        }
        return row;
    }

    public void printFibo() {
        for (int i : getFiboRow())
            System.out.print(i + " ");
    }

    public static void main(String[] args) {

        new FibonacciGen(10).printFibo();
    }
}
