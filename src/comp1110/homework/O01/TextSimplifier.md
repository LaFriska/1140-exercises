
Within the `comp1110.homework.O01` package of the `comp1110-homework` project,
create a class `TextSimplifier`, and in this class write a function

`static String simplify(String text)`

which applies the following rules:

1. Delete any character that is not a letter or space, and delete all
articles (words "a", "an" and "the" appearing before another word) from
the string.
2. Abbreviate any word that is longer than 5 letters by keeping only its
first three letters and the single last letter (i.e., deleteting all in
between).

For example, the string

    The API has been designed to reject null early and to be clear about this behavior. A key exception is any method that takes an object and returns a boolean, for the purpose of checking or validating, will generally return false for null.
	
should be simplified to

    API has been desd to rejt null early and to be clear about this behr key excn is any metd that takes objt and rets boon for pure of cheg or valg will geny retn false for null

Make use of the [`StringBuffer`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuffer.html) class to edit the string in place!

The function `Character.isLetter()`, and other static functions of the [`Character` class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html), are also useful.

_Hint_: You will need to search the string for characters or words to delete
or modify; consider when it is easier to use methods from the `StringBuffer`
(or `String`) class to do this and when it is easier to use a simple loop to
iterate through the string.

Test your solution using the `O01` test.
