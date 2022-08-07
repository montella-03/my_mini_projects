Create a BankAccount class.

The class should have private fields for:

"id": int (starts from 1 and increases by one for every new account)

"balance": double

"interestRate": double

shared for all accounts

default value: 0.02

The class should also have public methods for:

setInterestRate(double interest): void (static)

getInterest(int years): double

deposit(double amount): void

Create a test client supporting the following commands:

"Create"

"Deposit {Id} {Amount}"

"SetInterest {Interest}"

"GetInterest {Id} {Years}"

"End"
