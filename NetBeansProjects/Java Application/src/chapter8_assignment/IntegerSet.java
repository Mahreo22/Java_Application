
package chapter8_assignment;

public class IntegerSet {
    private boolean[] set;

    // No-argument constructor initializes the array to the "empty set"
    public IntegerSet() {
        set = new boolean[101];
    }

    // Copy constructor
    public IntegerSet(IntegerSet otherSet) {
        set = new boolean[101];
        for (int i = 0; i < 101; i++) {
            set[i] = otherSet.set[i];
        }
    }

    // Static method union creates a set that's the set-theoretic union of two existing sets
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet unionSet = new IntegerSet(set1);
        for (int i = 0; i < 101; i++) {
            if (set2.set[i]) {
                unionSet.set[i] = true;
            }
        }
        return unionSet;
    }

    // Static method intersection creates a set which is the set-theoretic intersection of two existing sets
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet intersectionSet = new IntegerSet(set1);
        for (int i = 0; i < 101; i++) {
            if (!set2.set[i]) {
                intersectionSet.set[i] = false;
            }
        }
        return intersectionSet;
    }

    // Method insertElement inserts a new integer k into a set
    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        }
    }

    // Method deleteElement deletes integer m
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        }
    }

    // Method toString returns a String containing a set as a list of numbers separated by spaces
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < 101; i++) {
            if (set[i]) {
                isEmpty = false;
                sb.append(i).append(" ");
            }
        }
        if (isEmpty) {
            return "---";
        }
        return sb.toString().trim();
    }

    // Method isEqualTo determines whether two sets are equal
    public boolean isEqualTo(IntegerSet otherSet) {
        for (int i = 0; i < 101; i++) {
            if (set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }

}
