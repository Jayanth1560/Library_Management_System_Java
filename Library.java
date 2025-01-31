  import java.io.*;
  import java.util.ArrayList;
  import java.util.List;


  public class Library {
      private List<Book> books;

      public Library() {
          this.books = new ArrayList<>();
      }

      public void addBook(String title, String author, String isbn){
          books.add(new Book(title,author,isbn));
          System.out.println("Book added: "+title);
      }

      public void viewBooks(){
          if(books.isEmpty()){
              System.out.println("No books available in the library!!");
          }else{
              System.out.println("Books in the library: ");
              for(Book book: books){
                  System.out.println(book);
              }
          }
      }

      public void searchBook(String query){
          boolean found=false;
          for(Book book:books){
              if(book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)){
                  System.out.println("Book found: "+book);
                  found=true;
              }
          }
          if(!found){
              System.out.println("No books found matching: "+query);
          }
      }

      public void issueBook(String isbn){
          for(Book book:books){
              if(book.getIsbn().equals(isbn)){
                  if(book.isIssued()){
                      System.out.println("Book is already issued.");
                  }else{
                      book.setIssued(true);
                      System.out.println("Book issued: "+book.getTitle());
                  }
                  return;
              }
          }
          System.out.println("Book with ISBN "+isbn+" not found.");
      }

      public void returnBook(String isbn){
          for(Book book:books){
              if(book.getIsbn().equals(isbn)){
                  if(book.isIssued()){
                      book.setIssued(false);
                      System.out.println("Book returned: "+book.getTitle());
                  }else{
                      System.out.println("Book is not issued.");
                  }
                  return;
              }
          }
          System.out.println("Book with ISBN "+isbn+" not found.");
      }

      public void saveToFile(String filename) {
          try (ObjectOutputStream oos = new ObjectOutputStream(
                  new FileOutputStream(filename))) {
              oos.writeObject(books);
              System.out.println("Library data successfully saved to " + filename);
          } catch (IOException e) {
              System.out.println("Error saving library data: " + e.getMessage());
          }
      }

      @SuppressWarnings("unchecked")
      public void loadFromFile(String filename) {
          try (ObjectInputStream ois = new ObjectInputStream(
                  new FileInputStream(filename))) {
              books = (List<Book>) ois.readObject();
              System.out.println("Library data successfully loaded from " + filename);
          } catch (IOException | ClassNotFoundException e) {
              System.out.println("Error loading library data: " + e.getMessage());
          }
      }
    
  }
