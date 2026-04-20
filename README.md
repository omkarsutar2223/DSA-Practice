<<<<<<< HEAD
# 🚀 DSA Journey - Day 2

## 📅 Topic: Arrays (Basics)

---

## 🔹 Problem 1: Sum of Array Elements

### 🧠 Approach:

* Initialize sum = 0
* Traverse array using loop
* Add each element to sum

---

## 🔹 Problem 2: Maximum Element in Array

### 🧠 Approach:

* Assume first element as max
* Traverse array
* Update max if larger element found

---

## 💻 Code

### ✅ Array Sum

```java
public class ArraySum {
    public static void main(String[] args) {

        int[] myArr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < myArr.length; i++) {
            sum += myArr[i];
        }

        System.out.println("Sum of array is: " + sum);
    }
}
```

---

### ✅ Array Maximum

```java
public class ArrayMax {
    public static void main(String[] args) {

        int[] myArr = {10, 50, 20, 80};
        int max = myArr[0];

        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] > max) {
                max = myArr[i];
            }
        }

        System.out.println("Maximum element in array is: " + max);
    }
}
```

---

## 📌 Output

```
Sum of array is: 150
Maximum element in array is: 80
```

---

## 🎯 Learning Outcome

* Array traversal using loops
* Finding sum of elements
* Finding maximum element
* Logic building for comparisons


=======
🚀 DSA Journey - Day 1
👨‍💻 Author :Omkar Sutar

📅 Day 1 - Basics
🔹 Problem: Swap Two Numbers

Swap two numbers using different approaches.

🧠 Approaches Used
1️⃣ Using Third Variable
Simple and beginner-friendly method
Uses a temporary variable to swap values
2️⃣ Without Third Variable
Uses arithmetic operations (+ and -)
No extra space required
3️⃣ Using XOR Operator
Bit manipulation technique
Efficient and commonly asked in interviews
💻 Code
class SwapNumbers {
    public static void main(String[] args) {

        int a = 10, b = 20;

        // Method 1: Using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Using temp: a=" + a + " b=" + b);

        // Reset values
        a = 10; b = 20;

        // Method 2: Without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Without temp: a=" + a + " b=" + b);

        // Reset values
        a = 10; b = 20;

        // Method 3: Using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Using XOR: a=" + a + " b=" + b);
    }
}
📌 Output
Using temp: a=20 b=10  
Without temp: a=20 b=10  
Using XOR: a=20 b=10  
🎯 Learning Outcome
Basics of variable manipulation
Understanding different swapping techniques
Introduction to bit manipulation (XOR)
🔥 Progress Tracker
✅ Day 1 Completed
>>>>>>> 4493bc73b87c5230cef742da3269e9a0857c71c8


