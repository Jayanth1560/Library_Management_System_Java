

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner scanner=new Scanner(System.in);
        boolean running=true;

        while (running) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Save Library Data");
            System.out.println("7. Load Library Data");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> {
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(title, author, isbn);
                }
                case 2 -> library.viewBooks();
                case 3 -> {
                    System.out.print("Enter search query (title or author): ");
                    String query = scanner.nextLine();
                    library.searchBook(query);
                }
                case 4 -> {
                    System.out.print("Enter ISBN of the book to issue: ");
                    String isbnToIssue = scanner.nextLine();
                    library.issueBook(isbnToIssue);
                }
                case 5 -> {
                    System.out.print("Enter ISBN of the book to return: ");
                    String isbnToReturn = scanner.nextLine();
                    library.returnBook(isbnToReturn);
                }
                case 6 -> {
                    System.out.print("Enter filename to save library data: ");
                    String saveFilename = scanner.nextLine();
                    library.saveToFile(saveFilename);
                }
                case 7 -> {
                    System.out.print("Enter filename to load library data: ");
                    String loadFilename = scanner.nextLine();
                    library.loadFromFile(loadFilename);
                }
                case 8 -> {
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                }
                default -> System.out.println("Invalid option. Please try again.");


            }
        }
        scanner.close();
    }
}