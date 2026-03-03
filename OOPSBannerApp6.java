import java.util.HashMap;
import java.util.Map;


public class OOPSBannerApp6 {

    private static final int ROWS = 7;

    
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  ***  ",
                " **  **",
                " **  **",
                " **  **",
                " **  **",
                " **  **",
                "  ***  "
        });

        patternMap.put('P', new String[]{
                " ******",
                " **  **",
                " **  **",
                " ******",
                " **     ",
                " **     ",
                " **     "
        });

        patternMap.put('S', new String[]{
                "  *****",
                " **     ",
                " **     ",
                "  *****",
                "     **",
                "     **",
                " ***** "
        });

        patternMap.put(' ', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        });

        return patternMap;
    }

    
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < ROWS; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toUpperCase().toCharArray()) {

                String[] pattern = patternMap.getOrDefault(ch, patternMap.get(' '));
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }
}