public class EvenDigitSum {
    public static void main(String[] args) {
        int value = getEvenDigitSum(123456789);
        System.out.println(value);
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number -= lastDigit;
            number /= 10;
        }
        int firstDigit = number;
        if (firstDigit % 2 == 0) {
            sum += firstDigit;
        }
        return sum;
    }
}
