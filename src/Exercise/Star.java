package Exercise;

public class Star {
    public static void main(String[] args) {
        int line = 4;
        int star = 1;
        int space = 3;

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            star += 2;
            space -= 1;
            System.out.println();
        }
    }
}

/*
            *
        *   *   *
    *   *   *   *   *
*   *   *   *   *   *   *

*/