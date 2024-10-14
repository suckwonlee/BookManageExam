import java.util.Scanner;

public class BookManageView {
    private Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("===========도서관리 시스템==========");
        System.out.println("Menu:");
        System.out.println("1. 도서정보 추가");
        System.out.println("2. 도서 조회");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 도서 목록 출력");
        System.out.println("0. 종료");
        System.out.print("선택: ");
    }

    public BookDTO inputBookInfo() {
        System.out.println("새 도서 정보 입력:");
        String isbn = prompt("ISBN: ");
        String bookName = prompt("도서명: ");
        String author = prompt("저자명: ");
        String publish = prompt("출판사: ");
        int price = Integer.parseInt(prompt("가격: "));
        int inventory = Integer.parseInt(prompt("재고: "));

        return new BookDTO(isbn, bookName, author, publish, price, inventory);
    }

    public String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
