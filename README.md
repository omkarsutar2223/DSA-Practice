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




