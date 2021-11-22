# Assignment 28

For this assignment you will make two static methods and test them in `main`.

## Part 1

Given a String length 1 or more of just integers, return the difference between the largest and smallest values in the String. You can assume there will be no negatives.

A few notes: 

* Use `nextLine()` to get use input for the String of ints.

* `Integer.parseInt(String s)` will return a copy of the String converted to an int.

* The built-in `Math.min(int v1, int v2)` and `Math.max(int v1, int v2)` methods return the smaller or larger of two values, but you do not need to use these and can just use if statements if you'd like.

### Sample Outputs

```
biggestDiff("288321") → 7
biggestDiff("2063340") → 6
biggestDiff("668") → 2
```

## Part 2

Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. 

```
sameEnds("abXYab") → "ab"
sameEnds("ABBA") → "A"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
sameEnds("javaXYZjava") → "java"
sameEnds("xavaXYZjava") → ""
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

