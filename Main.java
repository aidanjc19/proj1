public class Main {
    public static final String PLOT_CHAR = "+";
    public static void main(String[] args) {
        plotXSquared(-8, 8);
    }

    public static void graphHeader() {
        System.out.println("Sideways Plot");
    }
    public static void plotXSquared(int minX, int maxX) {
        graphHeader();
        System.out.println("y = x*x where " + minX+ "<=x<=" + maxX);
        for(int x = minX; x <= maxX; x++) {
            int y = x*x;
            if (y == 0) { System.out.print("--"); }
            else {
                System.out.print("  |");
                //y -= 1;
            }
            for(int blank = 1; blank <= y; blank++) {
                System.out.print(" ");
            }
            System.out.print(PLOT_CHAR);
            if (y==0) {
                for(int xAxis = 1; xAxis <= maxX*maxX; xAxis++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}