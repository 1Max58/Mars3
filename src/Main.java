// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final float GRAVITY_MULTIPLIER = 0.38f;
    private static final float EARTH_WEIGHT_KORSUN = 83;
    private static double marsWeightKorsun;
    private static int marsWeightKorsunInt;
    private static char marsWeightKorsunChar;
    private static int marsWeightKorsunCharAfterAdditionOperator;


    public static void main(String[] args) {
        marsWeightKorsun = EARTH_WEIGHT_KORSUN * GRAVITY_MULTIPLIER;
        System.out.println(String.format("mars weight %.4f" , marsWeightKorsun));

        marsWeightKorsunInt = (int) marsWeightKorsun;
        System.out.println(String.format("marsWeightKorsun casted to int: %d" , marsWeightKorsunInt));

        marsWeightKorsunChar = (char) marsWeightKorsunInt;
        System.out.println(String.format("marsWeightKorsunInt casted to char: %c" , marsWeightKorsunChar));

        marsWeightKorsunCharAfterAdditionOperator = marsWeightKorsunChar + 169;
        System.out.println(String.format("we added 169 to the converted char: %d" , marsWeightKorsunCharAfterAdditionOperator));


    }
}