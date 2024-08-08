
(Note there are no tests for this exercise.)

The Java standard library has many classes that can simplify a wide
range of programming tasks (but it does, of course, not have a
ready-made solution for everything).

Look up the documentation for the [`java.time.LocalTime`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalTime.html) class.
Use this class to re-create the `Time` exercise from [lab 2](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs/src/comp1110/lab2/).

To create a `LocalTime` object representing a fixed time (such as
the start time of the lab), you can use the function

```
LocalTime t = LocalTime.of(10, 0); // hours and minutes
```

or

```
LocalTime t = LocalTime.parse("10:00:00"); // hours minutes and seconds, as string
```

To create a `LocalTime` object representing relative time (such as,
for example, 2 hours later), you can use the `plus` and `minus` methods.
To obtain the current local time, use the function

```
LocalTime t = LocalTime.now()
```

Can you find the method to get the difference (in seconds) between two
`LocalTime` objects? What do you need to change to make the difference
in minutes instead?
