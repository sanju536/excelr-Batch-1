public class Demo9 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println("Post-increment:");
        System.out.println("num1 = " + num1);  // num1 is 5
        System.out.println("num1++ = " + num1++);  // Post-increment, prints 5, then num1 becomes 6
        System.out.println("After post-increment, num1 = " + num1);  // num1 is now 6

        System.out.println("\nPre-increment:");
        System.out.println("num2 = " + num2);  // num2 is 10
        System.out.println("++num2 = " + ++num2);  // Pre-increment, num2 becomes 11, then prints 11
        System.out.println("After pre-increment, num2 = " + num2);  // num2 is now 11

        System.out.println("\nPost-decrement:");
        System.out.println("num1 = " + num1);  // num1 is 6
        System.out.println("num1-- = " + num1--);  // Post-decrement, prints 6, then num1 becomes 5
        System.out.println("After post-decrement, num1 = " + num1);  // num1 is now 5

        System.out.println("\nPre-decrement:");
        System.out.println("num2 = " + num2);  // num2 is 11
        System.out.println("--num2 = " + --num2);  // Pre-decrement, num2 becomes 10, then prints 10
        System.out.println("After pre-decrement, num2 = " + num2);  // num2 is now 10
    }
}
