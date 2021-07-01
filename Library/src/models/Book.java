package models;

public class Book {
    int id;
    int authorId;
    int bookCateId;
    int publicationHouseId;
    int shelfId;
    String bookName;
    String publicationYear;
    String status;

    public Book(int id, int authorId, int bookCateId, int publicationHouseId, int shelfId, String bookName, String publicationYear, String status) {
        this.id = id;
        this.authorId = authorId;
        this.bookCateId = bookCateId;
        this.publicationHouseId = publicationHouseId;
        this.shelfId = shelfId;
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getBookCateId() {
        return bookCateId;
    }

    public void setBookCateId(int bookCateId) {
        this.bookCateId = bookCateId;
    }

    public int getPublicationHouseId() {
        return publicationHouseId;
    }

    public void setPublicationHouseId(int publicationHouseId) {
        this.publicationHouseId = publicationHouseId;
    }

    public int getShelfId() {
        return shelfId;
    }

    public void setShelfId(int shelfId) {
        this.shelfId = shelfId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return this.bookName;
    }
}
