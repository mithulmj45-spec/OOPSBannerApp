/**
 * OOPSBannerApp
 * UC3: Print OOPS Banner using String.join()
 * 
 * @author Mithul
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String line1 = String.join(" ",
                "OOOO", "OOOO", "PPPP", "PPPP", "SSSS");

        String line2 = String.join(" ",
                "O", "O", "P", "P", "S");

        String line3 = String.join(" ",
                "O", "O", "PPPP", "SSSS");

        String line4 = String.join(" ",
                "O", "O", "P", "S");

        String line5 = String.join(" ",
                "OOOO", "P", "SSSS");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
/**
 * OOPSBannerApp
 * UC4: Print OOPS Banner using Array and Loop
 *
 * @author Mithul
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Banner lines stored in array using String.join()
        String[] banner = {
            String.join(" ", "OOOO", "OOOO", "PPPP", "PPPP", "SSSS"),
            String.join(" ", "O", "O", "P", "P", "S"),
            String.join(" ", "O", "O", "PPPP", "SSSS"),
            String.join(" ", "O", "O", "P", "S"),
            String.join(" ", "OOOO", "P", "SSSS")
        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
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