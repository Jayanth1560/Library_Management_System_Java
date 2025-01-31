---
# Library Management System

A Java-based **Library Management System** that allows users to manage books in a library. This project demonstrates the use of object-oriented programming, file handling, and command-line interfaces in Java.

---

## Features

1. **Add a Book**: Add a new book to the library with details like title, author, and ISBN.
2. **View All Books**: Display all books in the library along with their status (issued/available).
3. **Search for a Book**: Search for a book by its title or author.
4. **Issue a Book**: Issue a book to a user by marking it as "issued".
5. **Return a Book**: Return a book by marking it as "available".
6. **Save Library Data**: Save the current state of the library to a file.
7. **Load Library Data**: Load the library state from a previously saved file.

---

## Technologies Used

- **Java**: Core programming language.
- **File Handling**: For saving and loading library data.
- **Object-Oriented Programming (OOP)**: Utilizes classes, objects, and encapsulation.

---

## How to Run the Project

### Prerequisites
- Ensure you have **Java Development Kit (JDK)** installed on your system.
- A terminal or command prompt to compile and run the Java code.

### Steps to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/library-management-system.git
   cd library-management-system
   ```

2. **Compile the Code**:
   Open a terminal or command prompt in the project directory and run:
   ```bash
   javac Main.java
   ```

3. **Run the Program**:
   After compiling, run the program:
   ```bash
   java Main
   ```

4. **Interact with the Program**:
   - Follow the menu prompts to perform actions like adding books, viewing books, issuing books, etc.
   - Use the "Save Library Data" option to save the library state to a file.
   - Use the "Load Library Data" option to load the library state from a file.

---

## Code Structure

The project consists of the following Java classes:

1. **`Book.java`**:
   - Represents a book with attributes like `title`, `author`, `isbn`, and `isIssued`.
   - Provides methods to get book details and mark a book as issued/returned.

2. **`Library.java`**:
   - Manages a collection of books.
   - Provides methods to add, view, search, issue, and return books.
   - Includes file handling to save and load library data.

3. **`Main.java`**:
   - Provides a command-line interface for interacting with the library system.
   - Displays a menu and processes user input.

---

## Usage Examples

### Adding a Book
```
Choose an option: 1
Enter book title: The Great Gatsby
Enter book author: F. Scott Fitzgerald
Enter book ISBN: 9780743273565
Book added: The Great Gatsby
```

### Viewing All Books
```
Choose an option: 2
Books in the library:
1. Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 9780743273565, Status: Available
```

### Issuing a Book
```
Choose an option: 4
Enter ISBN of the book to issue: 9780743273565
Book issued: The Great Gatsby
```

### Saving Library Data
```
Choose an option: 6
Enter filename to save library data: library_data.txt
Library data saved to library_data.txt
```

### Loading Library Data
```
Choose an option: 7
Enter filename to load library data: library_data.txt
Library data loaded from library_data.txt
```

---

## Future Enhancements

- Add user authentication (e.g., librarians and members).
- Implement due dates for issued books and calculate fines for late returns.
- Add a graphical user interface (GUI) using Java Swing or JavaFX.
- Write unit tests using JUnit.

---

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes.
4. Push your changes to your fork.
5. Submit a pull request.

---

## License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

## Author

[Namburi Jayanth varma](https://github.com/Jayanth1560)

---

## Acknowledgments

- Inspired by real-world library management systems.
- Built as a project to showcase Java programming skills.

---
