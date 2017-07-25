package pl.sda.dzien006.credit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CreditOld creditOld = new CreditOld();
        System.out.println(creditOld.calculate(12000, 12));

//        CreditBankY creditBankY = new CreditBankY();
        Credit creditBankY = new CreditBankY();                     //Tworzymy jako obiekt typu Credit (jako interfejs)
        System.out.println(creditBankY.calculate(12000, 12));
        System.out.println(creditBankY.calculate(240_000, 48));

        CreditBankX creditBankX = new CreditBankX();

        List<Credit> list = new ArrayList<>();
        list.add(creditBankX);
        list.add(creditBankY);

        for (Credit credit : list) {
            System.out.println(credit.getClass().getSimpleName() + ":");
            System.out.println(credit.calculate(12000, 12));
            System.out.println(credit.calculate(240_000, 48));
            System.out.println(credit.calculate(500_000, 60));
            System.out.println(credit.calculate(111222, 36));
        }
    }
}
