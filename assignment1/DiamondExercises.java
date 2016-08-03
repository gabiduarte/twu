public class DiamondExercises {

    public static void main(String[] args) {
        centeredTriangle(4);
        diamond(7);
        diamondName(6, "Gabi");
    }

    public static void generateDiamondLine(int spaceNumber, int asteriskNumber) {
        int i = 0;

        while (i < (spaceNumber/2)) {
            System.out.print(" ");
            i++;
        }

        i = 0;
        while(i < asteriskNumber) {
            System.out.print("*");
            i++;
        }

        System.out.println("");
    }

    public static void centeredTriangle(int n) {
        int maxChar = (n * 2) - 1;

        for (int i = 1; i <= n; i++) {
            int spaceNum = maxChar - (i * 2 - 1);
            int asteriskNum = maxChar - spaceNum;

            generateDiamondLine(spaceNum, asteriskNum);
        }
    }

    public static void diamond(int n) {
        int maxChar = (n * 2) - 1;

        for (int i = 1; i <= maxChar; i++) {
            int spaceNum;

            if (i > n) {
                int redoLine = n - (i - n);
                spaceNum = maxChar - (redoLine * 2 - 1);

            } else {
                spaceNum = maxChar - (i * 2 - 1);
            }

            int asteriskNum = maxChar - spaceNum;
            generateDiamondLine(spaceNum, asteriskNum);
        }
    }

    public static void diamondName(int n, String name) {
        int maxChar = (n * 2) - 1;

        for (int i = 1; i <= maxChar; i++) {
            int spaceNum;

            if (i > n) {
                int redoLine = n - (i - n);
                spaceNum = maxChar - (redoLine * 2 - 1);

            } else if (i == n) {
                System.out.println(name);
                continue;
            } else {
                spaceNum = maxChar - (i * 2 - 1);
            }
            int asteriskNum = maxChar - spaceNum;
            generateDiamondLine(spaceNum, asteriskNum);
        }
    }
}