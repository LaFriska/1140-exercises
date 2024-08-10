
_Note_: You have to complete the [`Coordinate`](Coordinate.md) exercise
before starting on this one, because the `Path` class defined here will
make use of the `Coordinate` class.

In the `comp1110.homework.O02` package, create a new class `Path`.
This class will represent a path, in the form of straight lines
connecting a sequence of coordinates.

* The class should have the following public constructors:

	* `Path(Coordinate start, Coordinate end)` : constructs a Path object consisting of a single line segment, with the given start and end coordinates.
	* `Path(Path beginning, Coordinate next)` : constructs a Path object that consists of the given path `beginning` plus one more line from the end coordinate of the the given path to the `next` coordinate.
	* `Path(Path first, Path second)` : constructs a Path object that consists of the two given paths, plus a line segment joining the end coordinate of the first to the start coordinate of the second.
	
* The class should have a public method `int numberOfLines()` that returns the number of line segments in the path.
	
* The class should have a public method `double totalLength()` that returns the total length of the path, that is the sum of the (Euclidean) lengths of all the line segments in it. (There is a square root function in the standard library, [`Math.sqrt`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#sqrt(double)), if you need it to compute the length of a line.)
