Within the `comp1110.homework.J12` package of the `comp1110-homework`
project, create a class `Exchange` that implements the function

`public static <T> T[] swap(T[] a, int i, int j)`.

The method takes in a generic array along with two integers `i` and `j`
representing positions of two elements to be swapped. It returns
the modified array.

Note: In case the positions of the elements to be swapped are invalid,
the input array should remain unchanged.

    Sample Input 1               Sample Output 1
    {1, 3, 4, 5}                 {4, 3, 1, 5}
    0
    2
    
 
    Sample Input 2               Sample Output 2
    {1, 3, 4, 5}                 {1, 3, 4, 5}
    5
    2
 
    
    Sample Input 3               Sample Output 3
    {8, 4, 1, 9}                 {8, 4, 1, 9}
     -1
     3

Test your solution using the `J12` test.

Once you have it working, add, commit and push your work.
