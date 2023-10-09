import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String b = Integer.toString(num);
        int lengthNum = b.length();
        StringBuilder result = new StringBuilder();

        String[] number = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",  "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] ten = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] unit = {"", "", "hundred", "thousand"};

        for (int i = lengthNum - 1; i >= 0; i--) {
            int x = (int) Math.floor(num/Math.pow(10, i));
            if (i == 1) {
                if (x == 1) {
                    result.append(number[num]).append(" ");
                    break;
                } else {
                    result.append(ten[x]).append(" ");
                }
            } else {
                result.append(number[x]).append(" ").append(unit[i]).append(" ");
            }
            num = (int) (num - x*Math.pow(10, i));
        }

        System.out.println(result);


    }
}
