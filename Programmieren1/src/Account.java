public class Account {
    String kontoinhaber;
    double balance;
    final int kontonumber;
    static int lastnumber = 60000;

    Account(String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
        lastnumber++;
        this.kontonumber = lastnumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        assert amount > 0.0;
        assert amount <= 10000.0;
        balance += amount;
    }
    boolean withdraw(double amount) {
        assert amount > 0.0;
        assert amount <= 10000.0;
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    boolean transfer(Account other, double amount) {
        assert amount > 0.0;
        assert other != null;

        if (amount <= this.balance) {
            other.deposit(amount);
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ("Kontoinhaber*in: " + kontoinhaber + " " + String.format("%+.2f€", balance) + " Nummer: " + kontonumber);
    }
}
