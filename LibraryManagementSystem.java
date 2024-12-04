// 父類別：媒體（Media）
abstract class Media {
    private final String title;
    private final String id;

    public Media(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public abstract void borrow();
    public abstract void returnMedia();
}

// 子類別：書籍（Book）
class Book extends Media {
    private boolean isBorrowed;

    public Book(String title, String id) {
        super(title, id);
        this.isBorrowed = false;
    }

    @Override
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book \"" + getTitle() + "\" borrowed successfully!");
        } else {
            System.out.println("Book \"" + getTitle() + "\" is already borrowed.");
        }
    }

    @Override
    public void returnMedia() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book \"" + getTitle() + "\" returned successfully!");
        } else {
            System.out.println("Book \"" + getTitle() + "\" was not borrowed.");
        }
    }
}

// 子類別：雜誌（Magazine）
class Magazine extends Media {
    private int issueNumber;

    public Magazine(String title, String id, int issueNumber) {
        super(title, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public void borrow() {
        System.out.println("Magazine \"" + getTitle() + "\" cannot be borrowed.");
    }

    @Override
    public void returnMedia() {
        System.out.println("Magazine \"" + getTitle() + "\" cannot be returned.");
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}

// 使用者類別（User）
class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public void borrowMedia(Media media) {
        System.out.println("User \"" + name + "\" is borrowing \"" + media.getTitle() + "\".");
        media.borrow();
    }

    public void returnMedia(Media media) {
        System.out.println("User \"" + name + "\" is returning \"" + media.getTitle() + "\".");
        media.returnMedia();
    }
}

// 主程式
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // 創建媒體物件
        Book book1 = new Book("Java Programming", "B001");
        Magazine magazine1 = new Magazine("Tech Monthly", "M001", 45);

        // 創建使用者
        User user1 = new User("Alice", "U001");

        // 借閱與歸還示例
        user1.borrowMedia(book1);       // 借閱書籍
        user1.returnMedia(book1);      // 歸還書籍
        user1.borrowMedia(magazine1);  // 嘗試借閱雜誌
    }
}
