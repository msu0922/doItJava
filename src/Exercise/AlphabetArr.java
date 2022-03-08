package Exercise;

public class AlphabetArr {
    public static void main(String[] args) {

        char[][] alphabetArr = new char[13][2];
        char a = 'a';

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 2; j++) {
                alphabetArr[i][j] = a;
                a++;
                System.out.print(alphabetArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
