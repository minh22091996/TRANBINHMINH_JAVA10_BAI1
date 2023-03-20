package ra.run;

import ra.bussinessImp.Author;
import ra.bussinessImp.Book;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] listBook = new Book[100];
        Author[] listAuthor = new Author[100];
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập số tác giả và nhập thông tin các tác giả");
            System.out.println("2. Nhập số sách và nhập thông tin các sách");
            System.out.println("3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator)");
            System.out.println("4. Tìm kiếm sách theo tên tác giả sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            System.out.println("Hãy nhập lựa chọn từ 1 đến 5: ");
             choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
               createNewAuthor(listAuthor,input);
               displayListProductAuthor(listAuthor);
                    break;
                case 2:
               createNewBook(listBook,input);
               displayListProductBook(listBook);
                    break;
                case 3:
                sortByExportPrice(listBook);
                    displayListProductBook(listBook);
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Thoát !");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại, vui lòng chọn lại!");
            }
        }while (choice != 5);

    }

    public static void createNewAuthor(Author[] list, Scanner sc) {
        Author newStudent = inputData(sc);
        boolean check = false;
        boolean checkNull= false;
        int idMax = 0;
        for (Author st : list) {
            if(st!=null){
                checkNull =true;
                if(idMax<st.getAuthorId()){
                    idMax = st.getAuthorId();
                }
            }
        }
        if (checkNull) {
            newStudent.setAuthorId(idMax+1);
        }
        else {
            newStudent.setAuthorId(1);
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = newStudent;
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("thêm mới thành công");
        } else {
            System.err.println("Danh sách đã đầy");
        }
    }

    public static Author inputData(Scanner sc) {
        Author author = new Author();
        System.out.println("Nhập mã tác giả");
        author.setAuthorId(Integer.parseInt(sc.nextLine()));
        System.out.println("nhập tên tác giả");
        author.setAuthorName(sc.nextLine());
        System.out.println("Nhập giới tính");
        author.setSex(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("Nhập năm sinh");
        author.setYear(Integer.parseInt(sc.nextLine()));
        return author;
    }



    public static void createNewBook(Book[] list, Scanner sc) {
        Book book = inputDataBook(sc);
        boolean check = false;
        boolean checkNull= false;
        int idMax = 0;
        for (Book st : list) {
            if(st!=null){
                checkNull =true;
                if(idMax<st.getBookId()){
                    idMax = st.getBookId();
                }
            }
        }
        if (checkNull) {
            book.setBookId(idMax+1);
        }
        else {
            book.setBookId(1);
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = book;
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("thêm mới thành công");
        } else {
            System.err.println("Danh sách đã đầy");
        }
    }

    public static Book inputDataBook(Scanner sc) {
        Book book = new Book();
        System.out.println("Nhập mã sách");
        book.setBookId(Integer.parseInt(sc.nextLine()));
        System.out.println("nhập tên sách");
        book.setBookName(sc.nextLine());
        System.out.println("Nhập tiêu đề");
        book.setTitle(sc.nextLine());
        System.out.println("Nhập số trang sách");
        book.setNumberOfPages(Integer.parseInt(sc.nextLine()));

        System.out.println("Nhập giá nhập sách");
        book.setImportPrice(Float.parseFloat(sc.nextLine()));

        System.out.println("Nhập giá bán sách");
        book.setExportPrice(Float.parseFloat(sc.nextLine()));

        System.out.println("Nhập số lượng sách");
        book.setQuantity(Integer.parseInt(sc.nextLine()));

        System.out.println("Nhập trạng thái sách");
        book.setBookStatus(Boolean.parseBoolean(sc.nextLine()));
        return book;
    }

    public static void sortByExportPrice(Book[] list) {
        for (int i = 0; i < list.length-1 ; i++) {
            for (int j = i+1; j < list.length ; j++) {
                if(list[i]!= null && list[j]!=null){
                    if(list[i].getExportPrice()> list[j].getExportPrice()){
                        Book temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                    }
                }
            }

        }
        System.out.println("Gía sách đã đã được sắp xếp");
    }

    public static void displayListProductBook(Book[] list) {
        boolean checkNull= false;
        for (Book std : list) {
            if (std != null) {
                checkNull = true;
                System.out.println(std.toString());
            }
        }
        if (!checkNull) {
            System.out.println("Không có sản phẩm nào cả , thêm mới đi !");
        }
        // code
    }

    public static void displayListProductAuthor(Author[] list) {
        boolean checkNull= false;
        for (Author std : list) {
            if (std != null) {
                checkNull = true;
                System.out.println(std.toString());
            }
        }
        if (!checkNull) {
            System.out.println("Không có sản phẩm nào cả , thêm mới đi !");
        }
        // code
    }

}

