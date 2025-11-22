# Expense_Splitter
A simple Java-based Expense Splitting Application that helps groups of friends track shared expenses, show balances, and settle up. This project uses Object Oriented Programming concepts such as classes, objects, file handling, validation and modular code structure.
## Features
✔ Add friends  
✔ Add expenses and auto-split equally  
✔ Show each friend's balance  
✔ Settle up individual balances  
✔ Validate names and amounts  
✔ Save and load data using file handling  
✔ Modular project with multiple classes  

## How It Works
1. Add Friend -Stores the friend’s name in the system.  
2. Add Expense -Choose who paid  
               -Enter the amount  
               -Amount is automatically split equally  
               -Balances update (positive=to receive, negative=owes)  
3. Show Summary -Displays: Who owes money, Who should receive money, Who is settled.  
4. Settle Up -Resets selected friend’s balance to zero.  
5. Save / Load Data -Automatic persistence using expenses_data.txt.

## How to Run
Step 1 - Compile all files. Make sure all .java files are in the same folder.
```
javac *.java
```
Step 2 - Run the application
```
java Main
```

## Author
Mahi Pandey | Btech CSE
