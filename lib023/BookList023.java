package lib023;

public class BookList023 {
    private final Book023 book;
    private BookList023 next;
    private BookList023(Book023 book) { this.book = book; }
    public static BookList023 newList() { return new BookList023(null); }
    public boolean add(Book023 book) {
        if (book == null) return false;
        var current = this;
        while (current.next != null) {
            current = current.next;
            if (current.book.equals(book)) return false;
        }
        current.next = new BookList023(book);
        return true;
    }
    @Override
    public String toString() {
        var current = this;
        var sb = new StringBuilder();
        sb.append("BookList{");
        while ((current = current.next) != null) {
            sb.append("\n ").append(current.book);
        }
        return sb.append("}").toString();
    }
    public double totalPrice(){
        double sum = 0.0;
        //วิธีที่ 1
//        BookList023 current = this.next;
//        while(current != null){
//            sum += current.book.getPrice023();
//            current = current.next;
//        }
        for(BookList023 current = this.next;current != null;current = current.next){
            sum += current.book.getPrice023();
        }
        return sum ;
    }
    public  boolean remove023(Book023 b){
        if(b == null) return false;
        // วิธีที่ 1
//        BookList023 cur = this;
//        while(cur.next != null){
//            if(cur.next.book.equals(b)) {
//                cur.next = cur.next.next;
//                return true;
//            }
//            cur =cur.next;
//        }
        // วิธีที่ 2
        for (BookList023 cur = this;cur.next != null;cur =cur.next){
            if(cur.next.book.equals(b)) {
                cur.next = cur.next.next;
                return true;
            }
        }
        return false;
    }

}
