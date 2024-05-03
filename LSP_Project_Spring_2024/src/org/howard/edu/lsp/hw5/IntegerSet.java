package org.howard.edu.lsp.hw5;
import java.util.ArrayList;
import java.util.List;




/**
*
* IntegerSet class
*
*/


public class IntegerSet {
    
	/**
	*
	*Store the set elements in an ArrayList
	*
	*/
    private List<Integer> set = new ArrayList<Integer>();

	/**
	*
	* // Default Constructor
	*
	*/
    public IntegerSet() {
    }

    /**
     * Constructor for IntegerSet that initializes the set with the specified ArrayList.
     *
     * @param set The ArrayList containing initial set elements.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
	*
	* Clears the set
	*
	*/
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set.
     *
     * @return The number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * 
     * Returns true if the 2 sets are equal, false otherwise
     * @param o The object to compare with this set.
     * @return true if the two sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof IntegerSet))
            return false;
        IntegerSet other = (IntegerSet) o;
        return this.set.containsAll(other.set) && other.set.containsAll(this.set);
    }
    
    /**
     * 
     * Returns true if the set contains the value, otherwise false
     * @param value The value to check for in the set.
     * @return true if the set contains the value, false otherwise. 
     */
    public boolean contains(int value) {
        return set.contains(value);
    }
    
    /**
     * Returns the largest item in the set.
     *
     * @return The largest integer in the set.
     * @throws IntegerSetException If the set is empty.
     */
    public int largest() {
        if (set.isEmpty())
            throw new IntegerSetException("Set is empty");
        int max = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) > max)
                max = set.get(i);
        }
        return max;
    }

    /**
     * Returns the smallest item in the set.
     *
     * @return The smallest integer in the set.
     * @throws IntegerSetException If the set is empty.
     */
    public int smallest() {
        if (set.isEmpty())
            throw new IntegerSetException("Set is empty");
        int min = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) < min)
                min = set.get(i);
        }
        return min;
    }

    /**
     * 
     * Adds an item to the set or does nothing it already there
     *
     * @param item The integer to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item))
            set.add(item);
    }

    /**
     * 
     * Removes an item from the set or does nothing if not there
     *
     * @param item The integer to remove from the set.
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * 
     * Set union
     *
     * @param intSetb the other IntegerSet to perform union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!this.set.contains(item))
                this.set.add(item);
        }
    }

    /**
     * 
     * Set intersection, all elements in s1 and s2
     *
     * @param intSetb the other IntegerSet to perform intersection with. 
     */
    public void intersect(IntegerSet intSetb) {
        this.set.retainAll(intSetb.set);
    }

    /**
     * 
     * Set difference
     *
     * @param intSetb the other IntegerSet to perform difference with.
     */
    public void diff(IntegerSet intSetb) {
        this.set.removeAll(intSetb.set);
    }

    /**
     * 
     * Set complement and all elements not in s1
     *
     * @param intSetb the other IntegerSet to compute complement with.
     */
    public void complement(IntegerSet intSetb) {
        int min = this.smallest();
        int max = this.largest();
        
        List<Integer> complement = new ArrayList<>();
        
        for (int i = min; i <= max; i++) {
            if (!this.set.contains(i) && !intSetb.set.contains(i)) {
                complement.add(i);
            }
        }
        this.set = complement;
    }

    /**
     * 
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }
    
    /**
     * 
     * Return String representation of your set. Overrides the equal method from the Object class.
     *
     * 
     */
    @Override
    public String toString() {
        return set.toString();
    }

}
