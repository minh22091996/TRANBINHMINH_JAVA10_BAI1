package ra.bussinessImp;

import ra.bussines.IShop;

import java.util.Scanner;

public class Book implements IShop {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private Author author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private Boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, Author author, float importPrice, float exportPrice, int quantity, Boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        this.bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên sách : ");
        this.bookName = scanner.nextLine();

        System.out.print("Nhập tiêu dề sách : ");
        this.title = scanner.nextLine();

        System.out.print("Nhập số trang sách: ");
        this.numberOfPages = scanner.nextInt();
        System.out.print("Tác giả sách:");
// TODO : Thực hiện chọn tác giả từ danh sách

        System.out.print("Gía nhập sách: ");
        this.importPrice = scanner.nextFloat();

        this.exportPrice = this.importPrice * RATE;

        System.out.print("Số lượng sách: ");
        this.quantity = scanner.nextInt();

        System.out.print("Trạng thái sách (true/false): ");
        this.bookStatus = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Mã sách: " + this.bookId);
        System.out.println("Tên sách: " + this.bookName);
        System.out.println("Tên tác giả: " + this.author.getAuthorName());
        System.out.println("Gía bán sách: " + this.exportPrice);
        System.out.println("Số lượng sách: " + this.quantity);
        System.out.println("Trạng thái: " + this.bookStatus);

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author=" + author +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", quantity=" + quantity +
                ", bookStatus=" + bookStatus +
                '}';
    }
}
