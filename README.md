# Java Cycle Swap - Array Swapping

A Java implementation of cyclic array rotation that shifts elements to the right in a circular manner.

## 📋 Description

This project implements a cyclic swap algorithm that rotates array elements to the right by a specified number of positions. The rotation is performed in a circular manner, meaning elements that move beyond the end of the array wrap around to the beginning.

**Example:**
- Original array: `[1, 3, 2, 7, 4]`
- Shift by 3 positions: `[2, 7, 4, 1, 3]`

## 🚀 Features

- **Cyclic rotation**: Elements wrap around when shifted beyond array boundaries
- **Efficient implementation**: Uses temporary array for O(n) time complexity
- **Robust handling**: Supports edge cases including:
  - Empty arrays
  - Single-element arrays
  - Zero shift
  - Shift values larger than array length (normalized using modulo)
  - Shift equal to array length (returns original array)

## 📦 Requirements

- **Java**: 11 or higher
- **Maven**: 3.6+ (for building and testing)
- **JUnit**: 5.9.3 (included as dependency)

## 🛠️ Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/halil-bekli/Java-Cycle-Swap---Array-Swapping.git
   cd Java-Cycle-Swap---Array-Swapping
   ```

2. **Build the project:**
   ```bash
   mvn clean compile
   ```

3. **Run tests:**
   ```bash
   mvn test
   ```

## 💻 Usage

### Basic Example

```java
import com.epam.rd.autotasks.CycleSwap;

public class Example {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array, 3);
        // Result: [2, 7, 4, 1, 3]
        
        System.out.println(Arrays.toString(array));
    }
}
```

### Method Signature

```java
public static void cycleSwap(int[] array, int shift)
```

**Parameters:**
- `array`: The integer array to be rotated (modified in-place)
- `shift`: Number of positions to shift right (non-negative integer)

**Behavior:**
- If `shift` is 0, the array remains unchanged
- If `shift` equals array length, the array remains unchanged
- If `shift` > array length, it's normalized using `shift % array.length`
- Null or empty arrays are handled gracefully (no operation performed)

## 🧪 Testing

The project includes comprehensive unit tests covering various scenarios:

- Basic shift operations
- Edge cases (empty array, single element, zero shift)
- Large shift values (greater than array length)
- Shift equal to array length

Run tests with:
```bash
mvn test
```

Expected output:
```
Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
```

## 📁 Project Structure

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

## 🔍 Algorithm Explanation

The cycle swap algorithm works as follows:

1. **Input validation**: Check for null, empty arrays, or zero shift
2. **Normalization**: Calculate `shift % array.length` to handle large shifts
3. **Rotation**: For each element at position `i`, move it to position `(i + shift) % length`
4. **Copy back**: Transfer elements from temporary array back to original

**Time Complexity**: O(n) where n is the array length  
**Space Complexity**: O(n) for the temporary array

## 👨‍💻 Author

**Halil Bekli**
- GitHub: [@halil-bekli](https://github.com/halil-bekli)

## 📄 License

This project is part of EPAM Road autotasks training exercises.

---

## 🇹🇷 Türkçe Açıklama

Bu proje, dizi elemanlarını döngüsel olarak sağa kaydıran bir algoritma içerir. Dizinin elemanları belirtilen pozisyon sayısı kadar sağa kayar ve sağ taraftan taşan elemanlar sol tarafa geçer.

**Örnek:**
- Orijinal dizi: `[1, 3, 2, 7, 4]`
- 3 pozisyon kaydırma: `[2, 7, 4, 1, 3]`

### Kurulum

```bash
mvn clean install
mvn test
```

### Kullanım

```java
int[] dizi = {1, 3, 2, 7, 4};
CycleSwap.cycleSwap(dizi, 3);
// Sonuç: [2, 7, 4, 1, 3]
```
