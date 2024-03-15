package org.howard.edu.lsp.midterm.question2;

public class RangeDriver {

    public static void main(String[] args) {
        // Test IntegerRange class with different ranges
        IntegerRange rangeA = new IntegerRange(10, 20);
        IntegerRange rangeB = new IntegerRange(15, 25);
        IntegerRange rangeC = new IntegerRange(0, 5);

        // Test contains method
        System.out.println("Range A contains 15: " + rangeA.contains(15)); // true
        System.out.println("Range B contains 20: " + rangeB.contains(20)); // true
        System.out.println("Range C contains -2: " + rangeC.contains(-2)); // false

        // Test overlaps method
        System.out.println("Range A overlaps with Range B: " + rangeA.overlaps(rangeB)); // true
        System.out.println("Range A overlaps with Range C: " + rangeA.overlaps(rangeC)); // false

        // Test size method
        System.out.println("Size of Range A: " + rangeA.size()); // 11
        System.out.println("Size of Range B: " + rangeB.size()); // 11
        System.out.println("Size of Range C: " + rangeC.size()); // 6

        // Test equals method
        IntegerRange rangeD = new IntegerRange(10, 20);
        System.out.println("Range A equals Range D: " + rangeA.equals(rangeD)); // true
    }
}
