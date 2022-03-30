public class NumberToWords {
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
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

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if(number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);

        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);
        int leadingZerosCount = originalDigitCount - reversedDigitCount;

        String wordToPrint;
        int currentDigit;

        for(int i = 0; i < reversedDigitCount; i++) {
            currentDigit = reversedNumber % 10;

            switch (currentDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }

            reversedNumber /= 10;
        }

        if(leadingZerosCount > 0) {
            for(int i = 0; i < leadingZerosCount; i++) {
                System.out.print("Zero ");
            }
        }

        System.out.println();

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
        System.out.println("***************************");
        numberToWords(12345);
        numberToWords(5);
        numberToWords(-10);
        numberToWords(22);
        numberToWords(23746);
    }
}
