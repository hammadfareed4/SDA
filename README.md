With Principle:

📌 Step 1: Creating a Book Class (The Creator)
🔹 This defines a class named Book.
🔹 A class is a blueprint for creating objects (in this case, books).

A constructor, a special method that runs when a book object is created.
🔹 It takes three parameters (title, author, pages) and assigns them to the object using this.
🔹 this.title = title; means the object's title variable gets the value passed when the object is created.


A main class which creates a book object and prints out its details.




2️⃣ With the Creator Principle (Structured Approach)
🔹 Uses a structured template (class) – Defines a standard way to create books.
🔹 Reusable and scalable – Can create multiple books efficiently.
🔹 Organized and error-free – Ensures every book has title, author, and pages.
🔹 Easier maintenance – Changes can be made in one place (the class).
🔹 Example: Using a library system where book details are stored in a structured database.


Without Principle:


1️⃣ Manually Defining Book Details
Instead of using a class, we store book details in separate variables (e.g., title1, author1, pages1).
This means each book’s information is individually written without any structured format.
2️⃣ Repeating Code for Each Book
For every new book, we create new variables manually (e.g., title2, author2, pages2).
If there are 100 books, we need 300 separate variables (title, author, pages for each).
This makes the program harder to manage and increases the chances of mistakes.
3️⃣ Printing Book Details Manually
We use print statements separately for each book.
If we need to change formatting, we must edit every print statement manually.
This approach does not scale well when handling large amounts of data.


1️⃣ Without the Creator Principle (Unstructured Approach)
🔹 Manual and repetitive – Every book’s details are stored separately in variables.
🔹 Difficult to manage – If there are 100 books, you need 100 sets of variables.
🔹 Error-prone – No system to ensure each book has all necessary details.
🔹 No scalability – Adding, removing, or modifying books is inefficient.
🔹 Example: Writing down each book’s details manually every time someone asks.





❌ Why is This Approach Bad?
🚫 Unstructured – No single format to follow for creating books.
🚫 Repetitive – Code is duplicated for every new book.
🚫 Difficult to Maintain – If we need to change the format, we must update all print statements.
🚫 Not Scalable – Adding a new book requires manually creating new variables and print statements.


