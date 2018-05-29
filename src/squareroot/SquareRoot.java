package squareroot;

/**
 * @author Mark Kulube (markkulube@gmail.com)
 */

public class SquareRoot {

    /**
     * This method takes in the String of digits of a number and returns
     * the String of digits of the square root.
     *
     * @param squareText String representing number input
     * @return squareRootText String representing square root of number input
     */
    public String calculateSquareRoot(String squareText) {
        Number squareRoot = 0;
        if (squareText.contains(".")) {

            double square = Double.parseDouble(squareText);
            squareRoot = Math.sqrt(square);

        } else {

            Long square = Long.parseLong(squareText);
            squareRoot = Math.sqrt(square);
            if( ( square % (Double) squareRoot) == 0 ) {
                squareRoot = (long) Math.sqrt(square);
            }

        }

        String squareRootText = String.valueOf(squareRoot);
        return squareRootText;
    }
}
