import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlphaNumericString {

    private static final String valid_characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static void main(String[] args) {
        int length = 10;
        String randomString = randomAlphaNumeric(length);
        System.out.println();
        System.out.println("**************************************************************************************");
        String pattern= " /\\   | |     | |         | \\ | |                         (_)     \n" +
                "    /  \\  | |_ __ | |__   __ _|  \\| |_   _ _ __ ___   ___ _ __ _  ___ \n" +
                "   / /\\ \\ | | '_ \\| '_ \\ / _` | . ` | | | | '_ ` _ \\ / _ \\ '__| |/ __|\n" +
                "  / ____ \\| | |_) | | | | (_| | |\\  | |_| | | | | | |  __/ |  | | (__ \n" +
                " /_/    \\_\\_| .__/|_| |_|\\__,_|_| \\_|\\__,_|_| |_| |_|\\___|_|  |_|\\___|\n" +
                "            | |                                                       \n" +
                "            |_|                                                       ";
        System.out.println(pattern);
        System.out.println();
        System.out.println("Random Alpha-Numeric String: " + randomString);
    }

    public static String randomAlphaNumeric(int length) {
        Random random = new Random();
        return IntStream.range(0, length)
                .mapToObj(i -> valid_characters.charAt(random.nextInt(valid_characters.length())))
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
