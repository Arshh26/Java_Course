public class MyBook {
    String title;
    String author;
    int price;
    String yearOfPublished;

    MyBook(String title, String author, int price, String yearOfPublished) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.yearOfPublished = yearOfPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", yearOfPublished='" + yearOfPublished + '\'' +
                '}';
    }

    public static void main (String[]args){
            MyBook b1 = new MyBook("IOT", "Arshad", 1400, "12-mar-24");
            System.out.println(b1);
        }
    }
