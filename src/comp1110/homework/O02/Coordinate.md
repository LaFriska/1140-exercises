In the `comp1110.homework.O02` package, create a new class `Coordinate`.
This class will represent two dimensional integer coordinates.

* The class should have two _private_ fields of type `int`, with names `x` and `y`.

* The class should have a _public_ constructor that takes two `int` arguments, `x`, and `y`, and uses those arguments to initilize the instance variables. It should look like this:

```
    public Coordinate(int x, int y) {
	}
```

Remember that you can use the keyword `this` to disambiguate instance fields
from parameters.

* The class should have a second _public_ constructor that takes just one argument, `v`, and it will set both `x` and `y` to be equal to `v`.

* The class should have _public_ methods for getting the value of `x` and `y`, with names `getX` and `getY` (called "getter methods"); these methods have no parameter, should, of course, return an `int`.

* The class should have a _public_ method `void swap()`, which swaps the `x` and `y` values.

* The class should have a _public_ `toString()` method that returns the coordinate in string form `(x, y)`, where `x` and `y` are, of course, the values of `x` and `y`.

You can test your class using the `O02` test.

You can also add a main method to the class, and in that main method create
some `Coordinate` instances, test that the getter and toString methods are
returning expected values.

Once you have it working, add, commit and push your work.
