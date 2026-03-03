/**
 * OOPSBannerApp UC7 - Exact Pattern Matching
 * High-fidelity ASCII art encapsulated in a static inner class.
 */
public class OOPSBannerApp5 {

    static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[]{

            // O (7x7 perfect alignment)
            new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " **  **",
                " **  **",
                " **  **",
                " **  **",
                " **  **",
                "  ***  "
            }),

            // P
            new CharacterPatternMap('P', new String[]{
                " ******",
                " **  **",
                " **  **",
                " ******",
                " **     ",
                " **     ",
                " **     "
            }),

            // S
            new CharacterPatternMap('S', new String[]{
                "  *****",
                " **     ",
                " **     ",
                "  *****",
                "     **",
                "     **",
                " ***** "
            }),

            // Space
            new CharacterPatternMap(' ', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        final int ROWS = 7;

        for (int i = 0; i < ROWS; i++) {
            StringBuilder lineResult = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineResult.append(pattern[i]).append("  ");
            }

            System.out.println(lineResult);
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}