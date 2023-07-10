// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Author authorAlexanderDyuma = new Author("Alexander", "Dyuma");
        Author authorLevTolstoy= new Author("Lev", "Tolstoy");
        Book bookWarPeace = new Book("WarPeace", authorAlexanderDyuma, 1900);
        Book bookMorning = new Book("Morning", authorLevTolstoy, 1905);
        System.out.println("bookMorning.getBookYear = " + bookMorning.getBookYear());
        bookMorning.setBookYear(1925);
        System.out.println("bookMorning.getBookYear = " + bookMorning.getBookYear());
    }
}


