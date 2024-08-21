
package comp1110.homework.O02;

import java.util.Arrays;

/**
 * A _Span_ represents an interval of a sequence, defined by its start
 * and end index. A span can also have a set of contained subspans. This
 * structure is used, e.g., in parsing natural language. For example,
 * the grouping of words in the following sentence
 *
 * [[[The man] who [works] [there]] [tells] [the people] [to [get] [out]]]
 *
 * can be represented by the spans
 * 0-10 with subspans [
 *   0-4 with subspans [
 *     0-1 with subspans [],
 *     3-3 with subspans [],
 *     4-4 with subspans []
 *   ],
 *   5-5 with subspans [],
 *   6-7 with subspans [],
 *   8-10 with subspans [
 *     9-9 with subspans [],
 *     10-10 with subspans []
 *   ],
 * ]
 *
 * The class `Span` represents a span as its start and end indices (both
 * are inclusive) and an array of contained subspans. The order of subspans
 * in the array does not matter; that is
 *
 *   0-4 with subspans [
 *     0-1 with subspans [],
 *     3-3 with subspans [],
 *     4-4 with subspans []
 *   ]
 *
 * and
 *
 *   0-4 with subspans [
 *     3-3 with subspans [],
 *     4-4 with subspans [],
 *     0-1 with subspans []
 *   ]
 *
 * both represent the same span (i.e., are equal).
 */
public class Span {
    int start;
    int end;
    Span[] contained;

    public Span(int start, int end, Span[] contained) {
        this.start = start;
        this.end = end;
        this.contained = Arrays.copyOf(contained, contained.length);
    }

    public Span(int start, int end) {
        this.start = start;
        this.end = end;
        this.contained = null;
    }

    /**
     * A span is valid iff (a) its end index is not less than its start
     * index (they may be equal); and (b) all of its subspans are
     * contined with it (i.e., every subspan's start and end indices
     * are (non-strictly) between the containing span's start and end
     * indices; and (c) all its subspans are valid.
     *
     * @return true if this span is valid, false otherwise.
     */
    public boolean isValid() {
        // FIXME: implement this method
	// the return statement below is just a placeholder to make
	// the class compile; you should replace it with your own
	// implementation of the method.
        return false;
    }

    /**
     * Return true if other object is equal to this (according to the
     * definition of equality of Span objects above).
     */
    public boolean equals(Object other) {
        // FIXME: Implement this method
	// the return statement below is just a placeholder to make
	// the class compile; you should replace it with your own
	// implementation of the method.
        return false;
    }

}
