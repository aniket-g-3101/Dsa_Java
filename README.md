# Java Patterns Collection

A small collection of simple Java programs that print common text/number/star patterns to the console. Each file contains a single class with a `main` method so it can be compiled and executed independently.

## Contents

This repository contains the following files (descriptions and sample outputs included):

- `One.java` — prints a 5x5 block of stars.

- `Two.java` — prints a hollow rectangle (4x5) using `*`.

- `Three.java` — prints a left-aligned increasing right triangle of stars.

- `Four.java` — prints an inverted left-aligned triangle of stars.

- `Fourt.java` — prints a diamond-like pattern (pyramid up then down) with spaces for alignment.

- `Five.java` — prints a right-aligned increasing triangle of stars.

- `Six.java` — prints a numeric triangle where each row contains the row number repeated.

- `Seven.java` — prints a triangle of increasing numbers in each row starting at 1.

- `Eight.java` — prints rows with decreasing sequences starting from 5 down to 1.

- `Nine.java` — prints rows of increasing numbers starting from 1, with the number of columns decreasing each row.

- `Ten.java` — prints a right-aligned numeric pyramid where each row contains ascending numbers starting at 1.
 
- `Thir.java` — prints a symmetric diamond of stars (increasing then decreasing rows).

- `Eleven.java` — prints sequential numbers across rows (continues counting across rows).

- `Twelve.java` — prints a triangle of 1s and 0s where parity of row+column determines the value.


## How to compile and run

Requirements:
- Java JDK (javac/java) installed and on your PATH.

From the repository root (`d:/java/Patterns`):

1. Compile a file (example `One.java`):

```powershell
javac One.java
```

2. Run the compiled class:

```powershell
java One
```

Repeat `javac`/`java` for any other class files (e.g., `javac Ten.java` then `java Ten`).

To compile all Java sources at once:

```powershell
javac *.java
```

Then run any class by its class name (without `.class`):

```powershell
java Eleven
```


## Notes
- Each class uses hard-coded sizes (usually 4 or 5). You can modify the integer variables in each `main` method to change pattern size.
- Some files are named with small inconsistencies (for example `Fourt.java`) — they are intentional copies/variants of similar patterns.


## Contribution

Feel free to open pull requests to:
- Add more pattern examples (label files clearly),
- Make sizes configurable via command-line arguments,
- Add unit or snapshot tests that capture output.

