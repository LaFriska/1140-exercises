Within the `comp1110.homework.J05` package of the `comp1110-homework` project,
create a class `Movie`, and write in it a function

`static void printRunningTime(String title, int minutes)`

that takes as arguments the name of a movie and its length in minutes,
and prints out the name of the movie, followed by ` runs for ` and its
length in hours and minutes (all on one line).

For example, if the arguments are `"Finding Nemo"` and `104`, then the
function should print

`Finding Nemo runs for 1 hour and 44 minutes`.

If the movie is less than one hour, you should not print hours (only
minutes). If it is greater than one hour you should print `hours` instead
of `hour`. Likewise for minutes: if there are no minutes, do not print
them, if there is one, print `minute`, and if more than one, print
`minutes`. (Hint - use the `%` operator).
Test your solution using the `J05` test.

Once you have it working, add and commit your work.
