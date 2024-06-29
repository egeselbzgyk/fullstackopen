public class VW5 {

    boolean odd(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    int checksum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
