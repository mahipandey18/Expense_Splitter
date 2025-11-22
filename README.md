# Expense_Splitter
A simple Java-based Expense Splitting Application that helps groups of friends track shared expenses, view balances, and settle up. This project demonstrates Object-Oriented Programming concepts such as classes, objects, collections, file handling, validation and modular design.

## Overview of the Project
This project manages shared expenses among a group of friends.  
Users can add friends, record expenses, auto-split costs equally, and view who owes or is owed money.  
All data is validated and stored using file handling for persistence.

## Features
✔ Add friends  
✔ Add expenses and auto-split equally  
✔ Show each friend's balance  
✔ Settle up individual balances  
✔ Validate names and amounts  
✔ Save and load data using file handling  
✔ Modular project with multiple classes  

## How It Works
1. Add Friend - Stores the friend’s name in the system.  
2. Add Expense -
    -  Choose who paid  
    -  Enter the amount  
    -  Amount is automatically split equally  
    -  Balances update (positive=to receive, negative=owes)  
3. Show Summary - Displays:
    -  Who owes money
    -  Who should receive money
    -   Who is settled.  
5. Settle Up - Resets selected friend’s balance to zero.  
6. Save / Load Data - Automatic persistence using ```expenses_data.txt.```

## Technologies / Tools Used
- Java (Core Java, OOP)
- Collections Framework
- File Handling (`FileReader`, `FileWriter`)
- Exception Handling + Validation
- Command-line Interface (CLI)  

##  Requirements
*  JDK 8 or above (recommended: JDK 17+)
*  Any Java IDE or terminal

## How to Run
Step 1 - Compile all files. Make sure all .java files are in the same folder.
```
javac *.java
```
Step 2 - Run the application
```
java Main
```
## Instructions for Testing
- Enter valid friend names  
- Enter valid numeric expense amounts  
- Test adding multiple expenses  
- Try settling balances  
- Restart program to confirm data persistence through file handling
