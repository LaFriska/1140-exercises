Within the `comp1110.homework.O02` package of the `comp1110-homework` project,
create a class `BMI` that stores the following information about a person: name,
height, and weight.

* The fields of the class includes:
  * `String name`, which is a public instance field
  * `double height`, which is a private instance field
  * `double weight`, which is a private instance field

* The class will have a constructor `BMI(String name, double height, double weight)`.
* The class should have a public instance method, `getBMI()` that returns a `double` reflecting the person's BMI (Body Mass Index = weight (kg) / (height squared (m^2)) ).
* The class should have a public `toString()` method that returns a `String` like `Fred is 1.9m tall and is 87.0Kg and has a BMI of 24.099722991689752kg/m^2` (just print the `double`s without special formatting).

You can test your class using the `O02` test.

You can also add a main method to the class, and in that main method create
some `BMI` instances, and test that methods return expected values.

Once you have it working, add, commit and push your work.
