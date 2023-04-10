package _6;

import java.util.ArrayList;
import java.util.List;

public class PecsExample {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        DebitAccount debitAccount = new DebitAccount();
        CreditAccount creditAccount = new CreditAccount(123);

        bankAccount = debitAccount; // ok

    }

    // зачем придумали дженерики
    public void example0() {
        ArrayList creaditAccounts = new ArrayList();
        creaditAccounts.add(new CreditAccount(123));

        // где-то в программе происходит добавление другого типа
        creaditAccounts.add(new DebitAccount());

        for (Object o : creaditAccounts) {
            System.out.println(((CreditAccount)o).limit); // программа упадет с ошибкой на элементе с индексом 1
        }
    }

    // инвариантность дженериков
    public void example1(DebitAccount debitAccount, BankAccount bankAccount) {
        Profile<DebitAccount> dp = new Profile<>( debitAccount );
        Profile<BankAccount> bp = new Profile<>( bankAccount );

        //bp = dp; // не ок
    }

    // делаем инвариантный объект ковариантным (сохраняем иерархию наследования)
    public void example2(DebitAccount debitAccount, BankAccount bankAccount) {
        Profile<DebitAccount> dp = new Profile<>( debitAccount );
        Profile<? extends BankAccount> bp = new Profile<>( bankAccount );

        bp = dp;
    }

    // делаем метод безопасным с помощью ограничений
    public void example3_copy(ArrayList<? extends BankAccount> src, ArrayList<? super BankAccount> dst) {
        for (BankAccount account : src) {
            dst.add(account);
        }

        // src.add(new BankAccount()); не можем добавлять объекты в src
        // BankAccount account = dst.get(0); не можем доставать объекты из dst
        // не можем перепутать списки и скопировать не оттуда не туда
        // применения super, кроме как ограничений на чтение, не используются
    }

    // делаем список Profile
    // когда может пригодиться ковариантность дженериков
    public void example4(DebitAccount debitAccount, BankAccount bankAccount) {
        Profile<DebitAccount> dp = new Profile<>( debitAccount );
        Profile<BankAccount> bp = new Profile<>( bankAccount );

        ArrayList<Profile<BankAccount>> profiles = new ArrayList<>();
        profiles.iterator();
        profiles.add(bp);
        //profiles.add(dp); // инвариантность дженериков не дает нам это сделать


        // делаем ковариантность (сохраняем иерархию наследования)
        ArrayList<Profile<? extends BankAccount>> profilesExtended = new ArrayList<>();
        profilesExtended.add(bp);
        profilesExtended.add(dp);

    }

    public void example5(List<BankAccount> accounts) {

    }

    public void example6() {
        List<DebitAccount> accounts = new ArrayList<>();
        //example5(accounts); ошибка, нужно использовать wildcard
    }
}

class BankAccount {}

class DebitAccount extends BankAccount {}

class CreditAccount {
    int limit;

    CreditAccount(int limit) {
        this.limit = limit;
    }
}

class Profile<T> {
    T account;

    Profile(T account) {
        this.account = account;
    }
}