package org.howard.edu.lsp.hw5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IntegerSetTest {
    private IntegerSet set;

    @BeforeEach
    void setUp() {
        set = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set.add(1);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet setTwo = new IntegerSet();
        set.add(1);
        set.add(2);
        setTwo.add(2);
        setTwo.add(1);
        assertTrue(set.equals(setTwo));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        set.add(1);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(3, set.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(1, set.smallest());
    }
    
    @Test
    @DisplayName("Test case for largest when set is empty")
    public void testLargestEmptySet() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> {
            set.largest();
        });
    }
    
    @Test
    @DisplayName("Test case for smallest when set is empty")
    public void testSmallestEmptySet() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> {
            set.smallest();
        });
    }


    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set.add(1);
        set.add(2);
        set.remove(1);
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        set.add(1);
        IntegerSet setTwo = new IntegerSet();
        setTwo.add(2);
        set.union(setTwo);
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        set.add(1);
        set.add(2);
        IntegerSet setTwo = new IntegerSet();
        setTwo.add(2);
        setTwo.add(3);
        set.intersect(setTwo);
        assertTrue(set.contains(2));
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        set.add(1);
        set.add(2);
        IntegerSet setTwo = new IntegerSet();
        setTwo.add(2);
        set.diff(setTwo);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        set.add(1);
        set.add(2);
        IntegerSet setTwo = new IntegerSet();
        setTwo.add(2);
        set.complement(setTwo);
        assertFalse(set.contains(2));
        assertTrue(set.contains(1));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString());
    }

    @Test
    @DisplayName("Test case for largest exception")
    public void testLargestException() {
        assertThrows(IntegerSetException.class, () -> {
            set.largest();
        });
    }

    @Test
    @DisplayName("Test case for smallest exception")
    public void testSmallestException() {
        assertThrows(IntegerSetException.class, () -> {
            set.smallest();
        });
    }
}