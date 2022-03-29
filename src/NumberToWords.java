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

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }

        return reversedNumber;
    }


    public static void main(String[] args) {
        System.out.println(getDigitCount(5));
        System.out.println(getDigitCount(23));
        System.out.println(getDigitCount(345));
        System.out.println(getDigitCount(-1));
        System.out.println("*****************************");
        System.out.println(reverse(12345));
        System.out.println(reverse(212));
        System.out.println(reverse(432));
        System.out.println(reverse(-234));
    }
}
