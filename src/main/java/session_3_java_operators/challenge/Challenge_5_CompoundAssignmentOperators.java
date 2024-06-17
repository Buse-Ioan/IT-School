package session_3_java_operators.challenge;

//5. Create a Java program that demonstrates the use of each compound assignment operator with integers.

public class Challenge_5_CompoundAssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Addition assignment (+=)
        a += b; // a = a + b
        System.out.println("After a += b: " + a);  // Output: 15

        // Subtraction assignment (-=)
        a -= b; // a = a - b
        System.out.println("After a -= b: " + a);  // Output: 10

        //Multiplication (*=)
        a *= b;  // a = a * b
        System.out.println("After a *= b: " + a);  // Output: 50

        // Division (/=)
        a /= b;
        System.out.println("After a /= b: " + a);

        // Modulus (%=)
        a %= b;
        System.out.println("After a %= b: " + a);

        // Bitwise AND (&=)
        a = 10; // reset a to 10
        a &= b; // equivalent to a = a & b
        System.out.println("After a &= b: " + a);  // Output: 0

        // Bitwise OR (|=) - NU AM INTELES EXACT CE FACE
        a = 10; // reset a to 10
        a |= b; // a = a | b
        System.out.println("After a |= b; " + a);  // Output: 15

        // Bitwise XOR (^=) - NU AM INTELES EXACT CE FACE
        a = 10; // reset a to 10
        a ^= b; // a = a ^ b
        System.out.println("After a ^= b: " + a);  // Output: 15

        // Left shift (<<=) - NU AM INTELES EXACT CE FACE
        a = 10; // reset a to 10
        a <<= 2; // a = a << 2
        System.out.println("After a <<= 2: " + a);  // Output: 40

        // Right shift (>>=) - NU AM INTELES EXACT CE FACE
        a = 10; // reset a to 10
        a >>= 2; // a = a >> 2
        System.out.println("After a >>= 2: " + a);  // Output: 2

        // Unsigned right shift (>>>=) - NU AM INTELES EXACT CE FACE
        a = -10; // set a to a negative value
        a >>>= 2; // equivalent to  a >>> 2
        System.out.println("After a >>= 2: " + a);  // Output: 1073741821


    }
}