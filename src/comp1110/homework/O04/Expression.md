
The provided class `Expression` represents an arithmethic expression,
made up of integer constants and two binary operators (+ and *). The
class is abstract: any Expression instance must be an instance of one
of the two subclasses `Constant` or `Operator`, which are defined in the
same file.

Implement overrides of the `evaluate` method in both subclasses
`Constant` and `Operator`, so that these are no longer abstract (and
can be instantiated).

Futhermore, implement the `equals` method in both subclasses. Two
`Expressions` should be equal if they represent the exact same
expression, including ordering and grouping of terms. For example,
1 + 2 and 2 + 1 are not considered equal, even if they evaluate to
the same value.

Test your implementations with the `O04` test.
