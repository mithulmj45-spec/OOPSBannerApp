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