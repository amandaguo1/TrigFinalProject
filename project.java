
public class project {
    public static void main(String[] args) {

        while (true) {
            System.out.print("Enter how many sides the dice will have: ");
            double numSide = TextIO.getlnDouble();

            System.out.println("Rolling " + (int)(numSide) + "-sided die " + (int)(numSide) + " times.");

            System.out.println();
            System.out.println("Chance of not rolling any given number: " + Math.pow((numSide-1.0)/numSide,numSide));
            System.out.printf("Value of 1/E: %37.9f", 1.0/Math.E);
            System.out.println();

        }
        /*
        */
    }
}
