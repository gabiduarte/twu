public class TriangleExercises {

    public static void drawAsterisk() {
        System.out.println("*");
    }

    public static void horizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void verticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalLine(i);
        }
    }


    public static void main(String[] args) {
        System.out.println("Draw one asterisk:");
        drawAsterisk();

        System.out.println("Given N draw an horizontal line of asterisks:");
        horizontalLine(8);

        System.out.println("Given N draw a vertical line of asterisks:");
        verticalLine(8);

        System.out.println("Given N, draw a right triangle of asterisks:");
        rightTriangle(7);
    }
}