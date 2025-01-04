public class Demo5 {
    public static void main(String[] args) {
        String username = "user001";
        String password = "user_001";

        // Initialize the loop condition using == for string comparison
        while (username == "user001" && password == "user_001") {
            System.out.println("Hello User, Happy New Year");
            break; // Break out of the loop after printing once to avoid infinite loop
        }
    }
}
