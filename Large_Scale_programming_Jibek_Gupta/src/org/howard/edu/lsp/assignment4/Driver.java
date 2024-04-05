package org.howard.edu.lsp.assignment4;

/**
 * A class to test the functionality of the IntegerSet class.
 */
public class Driver {
    // Creating IntegerSet objects
    IntegerSet firstSet = new IntegerSet();
    IntegerSet secondSet = new IntegerSet();

    /**
     * The main function serves as the entry point of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Driver testObject = new Driver();
        testObject.testingFunc();
    }

    /**
     * A private testing function to test all APIs in the IntegerSet Class.
     */
    private void testingFunc() {
        // Adding elements to firstSet
        firstSet.add(7);
        firstSet.add(8);
        firstSet.add(9);

        // Adding elements to secondSet
        secondSet.add(9);
        secondSet.add(10);
        secondSet.add(11);

        // Testing methods
        System.out.println("firstSet: " + firstSet.toString());
        System.out.println("secondSet: " + secondSet.toString());

        System.out.println("Length of firstSet: " + firstSet.length());
        System.out.println("Is firstSet empty? " + firstSet.isEmpty());

        System.out.println("Does firstSet contain 8? " + firstSet.contains(8));
        System.out.println("Does firstSet contain 10? " + firstSet.contains(10));

        try {
            System.out.println("Largest element in firstSet: " + firstSet.largest());
            System.out.println("Smallest element in firstSet: " + firstSet.smallest());
        } catch (IntegerSet.IntegerSetException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Union of firstSet and secondSet: " + firstSet.union(secondSet));
        System.out.println("Intersection of firstSet and secondSet: " + firstSet.intersect(secondSet));
        System.out.println("Difference of firstSet and secondSet: " + firstSet.diff(secondSet));
        System.out.println("Difference of secondSet and firstSet: " + secondSet.diff(firstSet));

        // Removing elements from firstSet
        firstSet.remove(7);
        System.out.println("firstSet after removing element 7: " + firstSet);

        // Testing equals method
        IntegerSet thirdSet = new IntegerSet();
        thirdSet.add(8);
        thirdSet.add(9);
        System.out.println("Is firstSet equal to thirdSet? " + firstSet.equals(thirdSet));
        System.out.println("Is firstSet equal to secondSet? " + firstSet.equals(secondSet));

        // Output for complement of firstSet
        System.out.println("Complement of firstSet: " + firstSet.complement());

        // Output for complement of secondSet
        System.out.println("Complement of secondSet: " + secondSet.complement());
    }
}