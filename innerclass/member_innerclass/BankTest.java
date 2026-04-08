package innerclass.member_innerclass;

public class BankTest {
    public static void main(String []args){
        Bank bank = new Bank("XYZ");
        Bank.Transaction t = bank.new Transaction();
        t.display();
        t.deposit(20000);
        t.withdraw(2000);
        t.withdraw(18000);
        t.withdraw(1000);
        t.deposit(30000);
        t.display();
    }
}
