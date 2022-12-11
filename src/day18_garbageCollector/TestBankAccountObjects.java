package day18_garbageCollector;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        BankAccount object1 = new BankAccount();
        object1.setInfo("Sadir",678766858);

        System.out.println(object1);

        object1.deposit(1000);

        object1.checkBalance();

        object1.withdraw(700);

        object1.checkBalance();

        object1.deposit(-1000);

        object1.checkBalance();






    }

}
