import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class libraryManager {
    static List <Book> library = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        while (true){
        System.out.println("\n========MAIN=========");
        System.out.println("1.Xem thông tin thư viện");
        System.out.println("2.Thêm đầu sách mới");
        System.out.println("3.Tìm kiếm sách");
        System.out.println("4. Mượn một sách");
        System.out.println("5. Trả một sách");
        System.out.println("6. Kết thúc và thoát");
        int choice = sc.nextInt();
        switch(choice){
            case 1: {
                showLibrary(library);
                break;
            }
            case 2:{
                addNewBook(library);
                break;
            }case 3:{
                searchBook (library);
                break;
            }case 4:{
                muonSach(library);
                break;
            }case 5:{
                break;
            }case 6:{
                break;
            }
            default: {
                System.out.println("Vui lòng chọn lại ");
            }

        }
        }

    }
    public static void showLibrary (List<Book> library){
            System.out.println("Thư viện quản lý sách: ");
            System.out.println("Số sách hiện có"+library.size());

            for( Book Book: library){
                System.out.println("Sách: "+Book.name);
            }
    }
    public static void addNewBook (List<Book> library){
        System.out.println("Nhập id cuốn sách");
        int bookID = sc.nextInt();
        System.out.println("Nhập tên sách: ");
        String bookName = sc.nextLine();
        Book newbook = new Book(bookID, bookName);
        library.add(newbook);
        System.out.println("thêm sách thành công");
    }
    public static void searchBook (List<Book> library){
        System.out.println("Nhập id cuốn sách: ");
        int id = sc.nextInt();
        for(Book Book: library){
        if ( id == Book.ID){
                System.out.println("sách bạn cần tìm là: "+ Book.ID+" "+Book.name);
            }
        else {
            System.out.println("không tìm thấy cuốn sách có ID trên!");
        }
        }
    }
public static void muonSach(List<Book> library){
    
}
}
