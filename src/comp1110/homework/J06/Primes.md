
A positive integer _n_ is a _prime_ if it is not evenly divisible by
any integer other than 1 or itself.

Within the `comp1110.homework.J06` package of the `comp1110-homework` project,
create a class `Primes`. In this class, write a function

```
static void allPrimes(int to)
```

that prints out all numbers between 1 and `to` (inclusive) that are primes,
one per line. For example, if `to` is 10, the function should print

```
2
3
5
7
```

Test your solution using the `J06` test.

To solve this problem, you will need to make use of integer division
(recall that in Java, the expression `a / b` performs integer division
if `a` and `b` are both of an integer type) or the
[remainder operator (`%`)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html).

Once you have it working, commit and push your work.
