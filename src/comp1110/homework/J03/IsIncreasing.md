
Within the `comp1110.homework.J03` package of the `comp1110-homework` project,
create a class `IsIncreasing`. In this class, write a function

```
static boolean isIncreasing(int[] numbers)
```

that takes a array of integers as input and returns the boolean value
`true` if the numbers in the array form a (non-strictly) increasing
sequence. That is, if for each index _i_, up to the second last in the
array, `numbers[i] <= numbers[i+1]`.

The function should _not_ modify the argument array!
Take care not to index the array outside of its size.

Test your solution using the `J03` test.

Once you have it working, commit and push your work.
