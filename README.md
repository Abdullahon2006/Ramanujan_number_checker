# Ramanujan Number Checker

## What This Program Does

This Java program checks if a number can be expressed as the sum of two cubes in two different ways - a special property discovered by mathematician Srinivasa Ramanujan.

## Key Features

- Checks if a number is a Ramanujan number (like the famous 1729)
- Works efficiently even for very large numbers (up to 19 digits)
- Runs in O(n^(1/3)) time - very fast computation

## How to Use

1. Compile the program:
   ```bash
   javac Ramanujan.java
   ```

2. Check if a number is Ramanujan:
   ```bash
   java Ramanujan <number>
   ```

## Examples

```bash
$ java Ramanujan 1729
true

$ java Ramanujan 4104
true

$ java Ramanujan 3458
false

$ java Ramanujan 216125
true
```

## How It Works

1. For a given number n, it:
   - Checks all possible pairs of cubes (a³ + b³) that sum to n
   - Looks for at least two distinct pairs
2. Uses smart searching to be efficient:
   - Only checks cube roots up to n^(1/3)
   - Stops early when two pairs are found

## Performance

- Handles 64-bit integers (up to 9,223,372,036,854,775,807)
- Runs in fraction of a second even for largest numbers
- Example: Checks 9,223,328,330,318,728,221 instantly

## Mathematical Significance

- Ramanujan numbers are extremely rare
- The smallest ones are: 1729, 4104, 13832, 20683...
- Important in number theory and mathematical research

## Limitations

- Only checks for sums of positive cubes
- Returns false for numbers that can't be expressed this way

This program helps discover these special numbers that fascinated one of history's greatest mathematicians. Try it with 1729 - the famous "Hardy-Ramanujan number"!
