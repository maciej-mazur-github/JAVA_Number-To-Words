public class NumberToWords {
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int digitCounter = 0;

        while(number > 0) {
            digitCounter++;
            number /= 10;
        }

        return digitCounter;
    }



    public static void main(String[] args) {
        System.out.println(getDigitCount(5));
        System.out.println(getDigitCount(23));
        System.out.println(getDigitCount(345));
        System.out.println(getDigitCount(-1));
    }
}
