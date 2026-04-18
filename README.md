🚀 DSA Journey - Day 1
👨‍💻 Author : Omkar Sutar

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


