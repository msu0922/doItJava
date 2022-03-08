package Exercise;

public class star_2 {
    public static void main(String[] args) {
        int line = 7;
        int star = 1;
        int space = 3;


        for (int i = 0; i < line; i++) {
            if (i < line/2) {
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
            } else {
                for (int j = space; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = star; j > 0; j--) {
                    System.out.print("*");
                }
                for (int j = space; j > 0; j--) {
                    System.out.print(" ");
                }
                star -= 2;
                space += 1;
                System.out.println();
            }
        }
    }
}
