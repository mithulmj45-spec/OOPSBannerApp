/**
 * OOPSBannerApp
 * UC7: Store character patterns in a class
 *
 * @author Mithul
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Static inner class to store character and its pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String pattern;

        public CharacterPatternMap(char character, String pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Map to store character patterns
        Map<Character, String> patternMap = new HashMap<>();

        patternMap.put('O', "OOOO");
        patternMap.put('P', "PPPP");
        patternMap.put('S', "SSSS");

        // Banner lines built using stored patterns
        String[] banner = {
            String.join(" ",
                patternMap.get('O'),
                patternMap.get('O'),
                patternMap.get('P'),
                patternMap.get('P'),
                patternMap.get('S')
            ),
            String.join(" ", "O", "O", "P", "P", "S"),
            String.join(" ", "O", "O", patternMap.get('P'), patternMap.get('S')),
            String.join(" ", "O", "O", "P", "S"),
            String.join(" ", patternMap.get('O'), "P", patternMap.get('S'))
        };

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

