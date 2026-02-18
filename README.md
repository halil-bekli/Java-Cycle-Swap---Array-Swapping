# Java Cycle Swap - Array Swapping

A Java implementation of a cycle swap algorithm that shifts array elements to the right in a circular manner.

## Description

This project implements a `cycleSwap` method that shifts all elements in an integer array to the right by a specified number of positions. The shift operation is performed in a cycle manner, meaning elements that are shifted beyond the end of the array wrap around to the beginning.

## Features

- **Cycle Swap Algorithm**: Efficiently shifts array elements in a circular manner
- **Handles Edge Cases**: Properly handles empty arrays, single elements, and shifts larger than array length
- **Modulo Normalization**: Automatically normalizes shift values using modulo operation
- **Well-Tested**: Comprehensive test suite with JUnit 5

## Algorithm

The `cycleSwap` method takes two parameters:
- `array`: An integer array to be shifted
- `shift`: The number of positions to shift right (non-negative)

### Example

```java
int[] array = {1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array, 3);
// Result: [2, 7, 4, 1, 3]
```

**Explanation**: With a shift of 3:
- Element at index 0 (value 1) moves to index 3
- Element at index 1 (value 3) moves to index 4
- Element at index 2 (value 2) moves to index 0 (wraps around)
- Element at index 3 (value 7) moves to index 1 (wraps around)
- Element at index 4 (value 4) moves to index 2 (wraps around)

## Usage

```java
import com.epam.rd.autotasks.CycleSwap;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        CycleSwap.cycleSwap(array, 2);
        // array is now [4, 5, 1, 2, 3]
    }
}
```

## Requirements

- Java 11 or higher
- Maven 3.6+

## Building the Project

To build the project, run:

```bash
mvn clean install
```

## Running Tests

To run the test suite:

```bash
mvn test
```

The project includes comprehensive tests covering:
- Basic shift operations
- Edge cases (empty array, single element)
- Shift values equal to or larger than array length
- Multiple shift scenarios

## Project Structure

```
Java-Cycle-Swap---Array-Swapping/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/epam/rd/autotasks/
│   │           └── CycleSwap.java
│   └── test/
│       └── java/
│           └── com/epam/rd/autotasks/
│               └── CycleSwapTest.java
├── pom.xml
└── README.md
```

## Implementation Details

The algorithm uses a temporary array approach:
1. Creates a temporary array of the same length
2. Calculates the new position for each element using `(i + shift) % length`
3. Copies elements to their new positions in the temporary array
4. Copies the result back to the original array

**Time Complexity**: O(n) where n is the array length  
**Space Complexity**: O(n) for the temporary array

## License

This project is part of EPAM Road to Java Developer training tasks.
