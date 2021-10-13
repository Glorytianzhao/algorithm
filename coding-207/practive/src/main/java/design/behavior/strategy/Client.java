package design.behavior.strategy;

public class Client {

    public static void main(String[] args) {
        StrategyTest.StrategyInterface strategy = StrategyFactory.getStrategy("strategy3");
        strategy.strategyMethod();
    }
}
