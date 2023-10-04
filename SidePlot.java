public class SidePlot {
    public static final String PLOT_CHAR = "*";
    public static void main(String[] args) {
        plotXSquared(-3, 3);
        plotNegXSquaredPlus20(-4,4);
        plotAbsXPlus1(-5, 5);
        plotSinWave(-9,9);
    }

    public static void graphHeader() {
        System.out.println("Sideways Plot");
    }
    public static void yAxisChars() {
        System.out.print("  |");
    }

    public static void xAxisChars() {
        System.out.print("--+");
    }
    public static void axisInit(int x, int y) {
        if (y == 0 && x!= 0) {
            printBlank(2);
        }
        else if (x == 0 && y!= 0) {
            xAxisChars();
        }
        else if (x == 0) {
            printDash(2);
        }
        else {
            yAxisChars();
        }
    }
    public static void axisInit(int x, double y) {
        if (x == 0 && y == 0) {
            printDash(2);
        }
        else if (x == 0) {
            xAxisChars();
        }
        else if (y == 0) {
            printBlank(2);
        }
        else {
            yAxisChars();
        }
    }
    public static void printBlank(int numBlank) {
        for(int count = 0; count < numBlank; count++) {
            System.out.print(" ");
        }
    }
    public static void printDash(int numDash) {
        for(int count = 0; count < numDash; count++) {
            System.out.print("-");
        }
    }
    //blank < y so iteration stops 1 before plot_char should be placed
    public static void distFromAxis(int x, int y) {
        for(int dist = 1; dist < y; dist++) {
            if (x==0) {
                printDash(1);
            }
            else { printBlank(1); }
        }
    }
    public static void distFromAxis(int x, double y) {
        for(int dist = 1; dist < y; dist++) {
            if (x==0) {
                printDash(1);
            }
            else { printBlank(1); }
        }
    }

    public static void plotXSquared(int minX, int maxX) {
        graphHeader();
        System.out.println("y = x*x where " + minX + "<=x<=" + maxX);
        for(int x = minX; x <= maxX; x++) {
            int y = x*x;
            axisInit(x, y);
            distFromAxis(x, y);
            System.out.print(PLOT_CHAR);
            if (x==0) {
                for(int xAxis = 1; xAxis <= maxX*maxX + 2; xAxis++) {
                    printDash(1);
                }
            }
            System.out.println();
        }
    }

    public static void plotAbsXPlus1(int minX, int maxX) {
        graphHeader();
        System.out.println("y = |x| + 1 where " + minX + "<=x<=" + maxX);
        for(int x = minX; x <= maxX; x++) {
            int y = Math.abs(x) + 1;
            axisInit(x, y);
            distFromAxis(x, y);
            System.out.print(PLOT_CHAR);
            if (x==0) {
                for(int xAxis = 1; xAxis <= Math.abs(maxX) + 3; xAxis++) {
                    printDash(1);
                }
            }
            System.out.println();
        }
    }
    public static void plotNegXSquaredPlus20(int minX, int maxX) {
        graphHeader();
        System.out.println("y = -(x*x) + 20 where " + minX + "<=x<=" + maxX);
        for(int x = minX; x <= maxX; x++) {
            int y = -(x*x) + 20;
            axisInit(x, y);
            distFromAxis(x, y);
            System.out.print(PLOT_CHAR);
            if (x == 0) { printDash(1); }
            System.out.println();
        }
    }
    public static void plotSinWave(int minX, int maxX) {
        graphHeader();
        System.out.println("y = 20sin(0.5x) + 20 where " + minX + "<=x<=" + maxX);
        for(int x = minX; x <= maxX; x++) {
            int y = (int)(20*Math.sin(.5*x) + 20);
            axisInit(x, y);
            distFromAxis(x, y);
            System.out.print(PLOT_CHAR);
            if (x == 0) {
                for(int xAxisLen = 1; xAxisLen <= y; xAxisLen++) {
                    printDash(1);
                }
            }
            System.out.println();
        }
    }
}