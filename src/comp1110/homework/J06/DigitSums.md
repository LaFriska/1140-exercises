
The [digit sum](https://en.wikipedia.org/wiki/Digit_sum) of a
(non-negative) integer number is the sum of the digits in the number
when it is written out (in base 10).
For example, the digit sum of 6710 is 6 + 7 + 1 + 0 = 14.

Within the `comp1110.homework.J06` package of the `comp1110-homework` project,
create a class `DigitSums`. In this class, write functions

```
static int sumDigits(int number) {
  // ...
}

static int sumOddDigits(int number) {
  // ...
}

static int sumEvenDigits(int number) {
  // ...
}
```

The first of the functions should return the sum of all digits in `number`;
the other two should return the sum of the odd digits only and even digits
only, respectively.

To solve this, you will need to make use of integer division (recall that
in Java, the expression `a / b` performs integer division if `a` and `b`
are both of an integer type). You may also find the
[remainder operator (`%`)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html)
useful.

Test your solution using the `J06` test.

Once you have it working, commit and push your work.

Note that there are many ways to solve this problem. You are encouraged
to try different ideas, even after you have found one that works.
