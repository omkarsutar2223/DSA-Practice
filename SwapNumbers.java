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