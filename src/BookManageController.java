import java.util.ArrayList;

public class BookManageController {
    private ArrayList<BookDTO> books = BookDTO.createDefaultBooks();
    private BookManageView view = new BookManageView();

    public void addBook() {
        BookDTO newBook = view.inputBookInfo();
        books.add(newBook);
        view.displayMessage("도서가 성공적으로 추가되었습니다.");
    }

    public void searchBook() {
        if (books.isEmpty()) {
            view.displayMessage("등록된 도서가 없습니다.");
            return;
        }

        String isbn = view.prompt("조회할 도서의 ISBN을 입력하세요: ");
        for (BookDTO book : books) {
            if (book.getIsbn().equals(isbn)) {
                view.displayMessage(book.toString());
                return;
            }
        }
        view.displayMessage("해당 ISBN의 도서를 찾을 수 없습니다.");
    }

    public void updateBook() {
        if (books.isEmpty()) {
            view.displayMessage("등록된 도서가 없습니다.");
            return;
        }

        String isbn = view.prompt("수정할 도서의 ISBN을 입력하세요: ");
        for (BookDTO book : books) {
            if (book.getIsbn().equals(isbn)) {
                view.displayMessage("수정할 도서 정보를 입력하세요.");
                BookDTO updatedBook = view.inputBookInfo();
                book.setBookName(updatedBook.getBookName());
                book.setAuthor(updatedBook.getAuthor());
                book.setPublish(updatedBook.getPublish());
                book.setPrice(updatedBook.getPrice());
                book.setInventory(updatedBook.getInventory());

                view.displayMessage("도서가 성공적으로 수정되었습니다.");
                return;
            }
        }
        view.displayMessage("해당 ISBN의 도서를 찾을 수 없습니다.");
    }

    public void deleteBook() {
        if (books.isEmpty()) {
            view.displayMessage("등록된 도서가 없습니다.");
            return;
        }

        String isbn = view.prompt("삭제할 도서의 ISBN을 입력하세요: ");
        for (BookDTO book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                view.displayMessage("도서가 성공적으로 삭제되었습니다.");
                return;
            }
        }
        view.displayMessage("해당 ISBN의 도서를 찾을 수 없습니다.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            view.displayMessage("등록된 도서가 없습니다.");
        } else {
            for (BookDTO book : books) {
                view.displayMessage(book.toString());
            }
        }
    }

    public void start() {
        boolean running = true;

        while (running) {
            view.showMenu();
            int choice = Integer.parseInt(view.prompt("선택: "));

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    displayBooks();
                    break;
                case 0:
                    running = false;
                    view.displayMessage("시스템을 종료합니다.");
                    break;
                default:
                    view.displayMessage("잘못된 선택입니다. 다시 시도하세요.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        BookManageController controller = new BookManageController();
        controller.start();
    }
}
