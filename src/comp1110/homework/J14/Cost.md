Within the `comp1110.homework.J14` package of the `comp1110-homework` project,
create a class `Cost`, that tracks the cost of items. Within `Cost`, create a
public inner (non-static) class, `Item`, that includes the following:

~~~~
public class Item {
    String name;
    int cost;   // in cents
    public Item(String n, int c) {
        name = n;
        cost = c;
    }
    public String toString() {
        return name + " " + cost;
    }
}
~~~~

* Modify your inner Item class so that it implements the `Comparable<Item>`
  interface. Items should be ordered based on the cost (lowest cost first).
  If two items cost the same amount then order these items alphabetically
  based on their name.

* Add an instance field to your `Cost` class for storing a collection of
  items, using an appropriate collection type. You can assume that every
  item stored will have a unique name.

* Add an instance method `void addItem(String name, int cost)` to your
  `Cost` class that allows new items to be added, and a method
  `printCost()` that prints out all items sorted in the order described
  above, one item per line, with a single space separating the item name
  and its cost.

Once you have it working, add, commit and push your work.
