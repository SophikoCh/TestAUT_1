public class Main5 {
    public static void hasTeen(int A, int B, int C){

        if((13 <= A && A <= 19) || (13 <= B && B <= 19) ||(13 <= C && C <= 19)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static void main(String[] args) {

        hasTeen(12,12,12);
        hasTeen(10, 22, 18);
        hasTeen(20, 20, 20);
    }
}
