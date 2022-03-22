package hu.nive.ujratervezes.kepesitovizsga.adddigits;

public class AddDigits {

    public int addDigits(String string) {
        if (string == null || string.isEmpty()) {
            return -1;
        }
        int sumOfDigits = 0;
        for (Character character: string.toCharArray()) {
            if (Character.isDigit(character)) {
                sumOfDigits += Integer.parseInt(String.valueOf(character));
            }
        }
        return sumOfDigits;
    }
}
