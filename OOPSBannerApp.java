/**
 * OOPSBannerApp
 * UC6: Banner generation using static helper functions
 *
 * @author Mithul
 * @version 1.0
 */

public class OOPSBannerApp {

    // Helper method to generate O pattern
    public static String buildO() {
        return "OOOO";
    }

    // Helper method to generate P pattern
    public static String buildP() {
        return "PPPP";
    }

    // Helper method to generate S pattern
    public static String buildS() {
        return "SSSS";
    }

    public static void main(String[] args) {

        // Banner lines built using helper methods
        String[] banner = {
            String.join(" ", buildO(), buildO(), buildP(), buildP(), buildS()),
            String.join(" ", "O", "O", "P", "P", "S"),
            String.join(" ", "O", "O", buildP(), buildS()),
            String.join(" ", "O", "O", "P", "S"),
            String.join(" ", buildO(), "P", buildS())
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}