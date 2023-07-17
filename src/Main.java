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
    /* -------HomeworkObjectMethods below------- */
    System.out.println("-------HomeworkObjectMethods below-------");
        Author authorAlexanderDyumaDuplicate = new Author("Alexander", "Dyuma");
        Book bookMorningDuplicate = new Book("Morning", authorLevTolstoy, 1905);
        System.out.println(bookWarPeace);
        System.out.println(bookMorning);
        System.out.println("(authorAlexanderDyuma.hashCode() == authorAlexanderDyumaDuplicate.hashCode()) :"
            + (authorAlexanderDyuma.hashCode() == authorAlexanderDyumaDuplicate.hashCode()));
        System.out.println("(authorAlexanderDyuma.equals(authorAlexanderDyumaDuplicate) :"
            + authorAlexanderDyuma.equals(authorAlexanderDyumaDuplicate));
        System.out.println("(authorAlexanderDyuma.hashCode() == authorLevTolstoy.hashCode()) :"
            + (authorAlexanderDyuma.hashCode() == authorLevTolstoy.hashCode()));
        System.out.println("(bookMorning.hashCode() == bookMorningDuplicate.hashCode()) :"
            + (bookMorning.hashCode() == bookMorningDuplicate.hashCode()));
        System.out.println("(bookMorning.equals(bookMorningDuplicate)): "
            + bookMorning.equals(bookMorningDuplicate));
        System.out.println("(bookMorning.hashCode() == bookWarPeace.hashCode()): "
            + (bookMorning.hashCode() == bookWarPeace.hashCode()));
        }


