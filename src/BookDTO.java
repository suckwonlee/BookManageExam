import java.util.ArrayList;

public class BookDTO {
    private String isbn;
    private String bookName;
    private String author;
    private String publish;
    private int price;
    private int inventory;

    public BookDTO(String isbn, String bookName, String author, String publish, int price, int inventory) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.publish = publish;
        this.price = price;
        this.inventory = inventory;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublish() { return publish; }
    public void setPublish(String publish) { this.publish = publish; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getInventory() { return inventory; }
    public void setInventory(int inventory) { this.inventory = inventory; }

    public String toString() {
        return "ISBN: " + isbn + ", 도서명: " + bookName + ", 저자명: " + author + ", 출판사: " + publish + ", 가격: " + price + ", 재고: " + inventory;
    }

    public static ArrayList<BookDTO> createDefaultBooks() {
        ArrayList<BookDTO> defaultBooks = new ArrayList<>();
        defaultBooks.add(new BookDTO("1", "개미", "베르나르 베르베르", "열린책들", 14220, 47));
        defaultBooks.add(new BookDTO("2", "셜록 홈즈", "아서 코난 도일", "현대문학", 24300, 32));
        defaultBooks.add(new BookDTO("3", "죄와 벌", "도스토예프스키", "민음사", 15300, 61));
        defaultBooks.add(new BookDTO("4", "동물 농장", "조지 오웰", "민음사", 8100, 29));
        defaultBooks.add(new BookDTO("5", "잃어버린 세계", "아서 코난 도일", "열린책들", 13500, 54));
        defaultBooks.add(new BookDTO("6", "드라큘라", "브램 스토커", "열린책들", 10800, 39));
        defaultBooks.add(new BookDTO("7", "파우스트", "괴테", "민음사", 14400, 63));
        defaultBooks.add(new BookDTO("8", "모비딕", "허먼 멜빌", "더클래식", 9900, 34));
        defaultBooks.add(new BookDTO("9", "반지의 제왕", "J.R.R. 톨킨", "황금가지", 42300, 68));
        defaultBooks.add(new BookDTO("10", "노인과 바다", "어니스트 헤밍웨이", "민음사", 8100, 50));
        return defaultBooks;
    }
}
