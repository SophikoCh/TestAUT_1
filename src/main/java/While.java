import java.util.Arrays;

public class While {
    public static void main(String[] args) {

        String symbols = "test bug featuizrelop";
        System.out.println(symbols.length());
        int i = 0;

        while (i < symbols.length()) {

            char currentChar = symbols.charAt(i);

            System.out.println("Character at index " + i + ": " + currentChar);

            if (currentChar == 'z') {
                break;
            }

            i += 3;
        }
    }
}