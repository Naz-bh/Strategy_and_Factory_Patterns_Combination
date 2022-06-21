package ceng.anadolu.bim492;

public class InterestCalculator {

    private static final InterestCalculationStrategyFactory interestCalculationStrategyFactory = new InterestCalculationStrategyFactory();

    public static double calculateInterest(AccountTypes accountType, double accountBalance) {
        InterestCalculationStrategy interestCalculationStrategy = interestCalculationStrategyFactory.getInterestCalculationStrategy(accountType);

        return interestCalculationStrategy.calculateInterest(accountBalance);
    }
}