# Project Statement - Expense Splitter

## 1. Problem Statement
Managing shared expenses within a group of friends often becomes confusing, especially when different people pay at different times. Manual calculations lead to errors, disputes, and a lack of clarity about who owes whom. Therefore, an automated system is needed to track contributions, split expenses fairly and maintain an accurate running balance for every group member.

## 2. Scope of the Project
The scope of this project includes the development of a console-based Java application capable of:
- Adding and storing friend names
- Recording expenses and distributing them equally
- Maintaining individual balances
- Displaying summary reports
- Allowing settlement of dues
- Providing persistent storage using file handling

### Out of Scope:
- Graphical user interface (GUI)
- Cloud/online synchronization
- Complex settlement algorithms
- Multi-user concurrency handling

## 3. Target Users
The application is intended for:  
- Students sharing hostel or food expenses
- Friends on trips or outings
- Roommates sharing rent, groceries, or utilities
- Small groups needing a simple offline expense management system  
Anyone who needs a lightweight and intuitive expense splitter can benefit from using this tool.

## 4. High-Level Features
### Add Friends
Allows the creation of friend profiles with name and balance fields.

### Add & Split Expenses
Users can add an expense paid by any friend. The amount is automatically split among all members.

### Automatic Balance Updates
Balances are updated based on contributions:
- Positive balance → amount to receive  
- Negative balance → amount owed  

### Summary View
Displays all friends’ balances clearly for quick understanding.

### Settlement
Users can settle an individual's balance by resetting it to zero.

### Data Persistence
All friend data is saved and loaded automatically using a text file (`expenses_data.txt`).

### Input Validation
Ensures name format and amount validity to prevent incorrect data entry. 
