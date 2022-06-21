package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {

        System.out.println("Mevcut bakiye: "+InterestCalculator.calculateInterest(AccountTypes.CURRENT,1000000));
        System.out.println("Birikimler: "+InterestCalculator.calculateInterest(AccountTypes.SAVINGS,1000000));
        System.out.println("Normal para piyasası: "+InterestCalculator.calculateInterest(AccountTypes.STANDARD_MONEY_MARKET,1000000));
        System.out.println("Yüksek meblağlı para piyasası: "+InterestCalculator.calculateInterest(AccountTypes.HIGH_ROLLER_MONEY_MARKET,1000000));

    }
}
