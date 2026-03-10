
/**
 * OOPSBannerApp
 * UC5: Concise Array Initialization using String.join()
 *
 * @author Mithul
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize banner array in a single statement
        String[] banner = {
            String.join(" ", "OOOO", "OOOO", "PPPP", "PPPP", "SSSS"),
            String.join(" ", "O", "O", "P", "P", "S"),
            String.join(" ", "O", "O", "PPPP", "SSSS"),
            String.join(" ", "O", "O", "P", "S"),
            String.join(" ", "OOOO", "P", "SSSS")
        };

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}