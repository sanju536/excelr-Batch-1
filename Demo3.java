public class Demo3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 30;
        num2 = 40;
        num3 = 50;

        // Corrected if-else conditions
        if (num1 > num2 && num1 > num3) { // Fixed parentheses here
            System.out.println("num1 is greater");
        } else if (num2 > num1 && num2 > num3) { // Fixed parentheses here
            System.out.println("num2 is greater");
        } else {
            System.out.println("num3 is greater");
        }
    }
}
