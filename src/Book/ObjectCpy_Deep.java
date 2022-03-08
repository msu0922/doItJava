package Book;

public class ObjectCpy_Deep {
    public static void main(String[] args) {

        Book[] bookArr1 = new Book[3];
        Book[] bookArr2 = new Book[3];

        bookArr1[0] = new Book("태백산맥", "조정래");
        bookArr1[1] = new Book("데미안", "헤르만 헤세");
        bookArr1[2] = new Book("어떻게 살 것인가", "유시민");

        bookArr2[0] = new Book();
        bookArr2[1] = new Book();
        bookArr2[2] = new Book();

        for (int i = 0; i < bookArr1.length; i++) { // bookArr2 깊은 복사
            bookArr2[i].setBookName(bookArr1[i].getBookName());
            bookArr2[i].setAuthor(bookArr1[i].getAuthor());
        }

        for (int i = 0; i < bookArr2.length; i++) {
            bookArr2[i].showInfo();
        }

        bookArr1[0].setBookName("나목"); // bookArr1[0] 요소 변경
        bookArr1[0].setAuthor("박완서");

        System.out.println("===== bookArr1 =====");     // ===== bookArr1 =====
        for (int i = 0; i < bookArr1.length; i++) {     // 나목, 박완서
            bookArr1[i].showInfo();                     // 데미안, 헤르만 헤세
        }                                               // 어떻게 살 것인가, 유시민

        System.out.println("===== bookArr2 =====");     // ===== bookArr2 =====
        for (int i = 0; i < bookArr2.length; i++) {     // 태백산맥, 조정래
            bookArr2[i].showInfo();                     // 데미안, 헤르만 헤세
        }                                               // 어떻게 살 것인가, 유시민

    }
}
