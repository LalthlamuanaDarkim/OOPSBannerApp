
public class OOPSBannerApp4 {

    public static void main(String[] args) {
       
        String[] lines = new String[7];
        String spacer = "      "; 
        for (int i = 0; i < 7; i++) {
            lines[i] = getO(i) + spacer + getO(i) + spacer + getP(i) + spacer + getS(i);
        }

        
        for (String line : lines) {
            System.out.println(line);
        }
    }

    
    public static String getO(int line) {
        String[] pattern = {
            "  **** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  **** "
        };
        return pattern[line];
    }

   
    public static String getP(int line) {
        String[] pattern = {
            " ***** ", " ** ** ", " ** ** ", " ***** ", " ** ", " ** ", " ** "
        };
        return pattern[line];
    }

    
    public static String getS(int line) {
        String[] pattern = {
            "  **** ", " ** ", " ** ", "  **** ", "     ** ", "     ** ", "  **** "
        };
        return pattern[line];
    }
}