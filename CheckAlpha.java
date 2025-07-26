package basic;

public class CheckAlpha {
    public static void main(String[] args) {
        String word = "alphatel";

        if (word.matches("[a-zA-Z]+")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
