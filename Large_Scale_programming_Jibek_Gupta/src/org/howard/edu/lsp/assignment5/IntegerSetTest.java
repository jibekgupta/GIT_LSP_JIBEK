package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    void testAdd() {
        set1.add(2);
        set1.add(4);
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(4));
    }

    @Test
    void testRemove() {
        set1.add(2);
        set1.add(4);
        set1.remove(2);
        assertFalse(set1.contains(2));
    }

    @Test
    void testLength() {
        set1.add(2);
        set1.add(4);
        assertEquals(2, set1.length());
    }

    @Test
    void testContains() {
        set1.add(2);
        assertTrue(set1.contains(2));
    }

    @Test
    void testIsEmpty() {
        assertTrue(set1.isEmpty());
        set1.add(2);
        assertFalse(set1.isEmpty());
    }

    @Test
    void testLargest() throws IntegerSet.IntegerSetException {
        set1.add(2);
        set1.add(4);
        assertEquals(4, set1.largest());
    }

    @Test
    void testSmallest() throws IntegerSet.IntegerSetException {
        set1.add(2);
        set1.add(4);
        assertEquals(2, set1.smallest());
    }

    @Test
    void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        IntegerSet unionSet = set1.union(set2);
        assertTrue(unionSet.contains(1));
        assertTrue(unionSet.contains(2));
        assertTrue(unionSet.contains(3));
    }

    @Test
    void testIntersect() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        IntegerSet intersectSet = set1.intersect(set2);
        assertTrue(intersectSet.contains(2));
    }

    @Test
    void testDiff() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        IntegerSet diffSet = set1.diff(set2);
        assertTrue(diffSet.contains(1));
        assertFalse(diffSet.contains(2));
    }
    
    @Test
    void testComplement() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        IntegerSet complementSet = set1.complement();
        assertFalse(complementSet.contains(1));
        assertFalse(complementSet.contains(2));
        assertFalse(complementSet.contains(3));
        assertTrue(complementSet.contains(0));
        assertTrue(complementSet.contains(4));
    }
    
    @Test
    void testEquals() {
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        assertTrue(set1.equals(set2));
    }
    
    @Test
    void testEmptySetOperations() {
        IntegerSet emptySet = new IntegerSet();
        assertTrue(emptySet.isEmpty());
        assertEquals(0, emptySet.length());
        assertFalse(emptySet.contains(5));
        assertThrows(IntegerSet.IntegerSetException.class, () -> emptySet.largest());
        assertThrows(IntegerSet.IntegerSetException.class, () -> emptySet.smallest());
    }
}
