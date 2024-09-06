Within the `comp1110.homework.J14` package of the `comp1110-homework`
project, create a class `Dictionary`, that stores a collection of
words (as strings).

The `Dictionary` class should have the following public interface:

* A no-parameter constructor, `public Dictionary()`.
* A method `public void add(String word)` which adds a word to the
  dictionary, if the word is not already present.
* A method `public int countWords()` which returns the number of words
  currently stored in the dictionary.
* A method `public int countCompletions(String prefix)`, which returns
  the number of words in the dictionary that begin with the string
  `prefix` (including `prefix` itself, if it is a word in the dictionary).

Test your class with the `J14` test.

Note: You can also implement an override for the `public String toString()`
method in your `Dictionary` class. This method will be called to generate
an error message if your class fails any test, so you can make the error
message more informative by defining how your dictionary will be printed.

Consider what data structure (collection type or types) is most suitable
for storing the dictionary. Can you implement `countCompletions` without
iterating over the contents of the dictionary?

Once you have it working, add, commit and push your work.
