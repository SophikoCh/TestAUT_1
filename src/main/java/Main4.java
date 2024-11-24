public class Main4 {

    public static void checkNumber(int checkNumber) {
        if (checkNumber > 0) {
            System.out.println("დადებითი");
        } else if (checkNumber < 0) {
            System.out.println("უარყოფითი");
        } else {
            System.out.println("0");
        }
    }

    // Main method where the program starts
    public static void main(String[] args) {
        checkNumber(3);
        checkNumber(-20);
        checkNumber(0);
    }
}
