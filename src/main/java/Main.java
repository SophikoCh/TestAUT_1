public class Main {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 5, 6, 20};

            int evenNumbers  = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers++;
                }
            }
            if(evenNumbers == 0 ){
                System.out.println("მასივში არ არის ლუწი რიცხვი");
            }else {
                System.out.println("“ამ მასივში არის " + evenNumbers + " ლუწი რიცხვი");
            }
        }
    }

