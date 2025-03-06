
package chapter8_assignment;

public class TestIntegerSet {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.insertElement(1);
        set1.insertElement(3);
        set1.insertElement(5);

        IntegerSet set2 = new IntegerSet();
        set2.insertElement(3);
        set2.insertElement(5);
        set2.insertElement(7);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("Union of Set 1 and Set 2: " + unionSet);

        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectionSet);

        set1.deleteElement(3);
        System.out.println("Set 1 after deleting 3: " + set1);

        IntegerSet set3 = new IntegerSet(set1);
        System.out.println("Set 3 (copy of Set 1): " + set3);

        System.out.println("Is Set 1 equal to Set 3? " + set1.isEqualTo(set3));
    }

}
