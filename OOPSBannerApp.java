public class OOPSBannerApp {
    public static void main(String[] args) {
        // Example for the first line of the "OOPS" banner
        // Joining parts of the top row for each letter
		for(int i = 1; i<=5; i++){
        String line1 = String.join(" ", "  ***  ", "  ***  ", " ***** ", "  **** ");
        String line2 = String.join(" ", " *   * ", " *   * ", " *    *", " *     ");
        String line3 = String.join(" ", " *   * ", " *   * ", " ***** ", "  **** ");
        String line4 = String.join(" ", " *   * ", " *   * ", " *     ", "      *");
        String line5 = String.join(" ", "  ***  ", "  ***  ", " *     ", "  **** ");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
		}
    }
}	