/**
 * OOPSBannerApp
 * UC8: Use HashMap for character patterns and render banner using function
 *
 * @author Mithul
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Map to store patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize character patterns
    public static void initializePatterns() {

        patternMap.put('O', new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        });

        patternMap.put('P', new String[]{
            "PPPP ",
            "P   P",
            "PPPP ",
            "P    ",
            "P    "
        });

        patternMap.put('S', new String[]{
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        });
    }

    // Function to render banner word
    public static void renderBanner(String word) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        renderBanner("OOPS");
    }
}

