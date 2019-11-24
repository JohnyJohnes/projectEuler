public class Problem_004 {
    private static boolean checkPalindrome (int number){
        int reversed = 0, original = number;

        while (original > 0) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }
        return number == reversed;
    }
    public static void main() {
        int numberOne, numberTwo, result = 0;

        for (numberOne = 100; numberOne <= 999; numberOne++) {
            for (numberTwo = 100; numberTwo <= 999; numberTwo++) {
                int tempo = numberOne * numberTwo;
                if (checkPalindrome(tempo) && tempo > result) result = tempo;
            }
        }
        System.out.println("Found: " + result);
    }
}