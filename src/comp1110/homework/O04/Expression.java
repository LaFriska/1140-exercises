package comp1110.homework.O04;

/**
 * The class Expression represents an arithmethic expression, made
 * up of integer constants and two binary operators (+ and *). The
 * class is abstract: any Expression instance must be an instance
 * of one of the two subclasses Constant or Operator, defined below.
 *
 * Two Expressions are equal if they represent the exact same expression,
 * including ordering and grouping of terms. For example, 1 + 2 and 2 + 1
 * are not considered equal, even if they evaluate to the same value.
 */
public abstract class Expression {

    /*
     * Returns the value of the Expression.
     */
    public abstract int evaluate();

}

class Constant extends Expression {
    int value;

    Constant(int value) {
	this.value = value;
    }

    // add override implementations
    public int evaluate() {
        return 0;
    }
}

class Operator extends Expression {
    char opType;
    Expression left;
    Expression right;

    /**
     * Note: the operator type must be one of the characters '+' or '*'.
     */
    Operator(char type, Expression left, Expression right) {
	this.opType = type;
	this.left = left;
	this.right = right;
    }

    // add override implementations
    public int evaluate() {
        return 0;
    }
}
