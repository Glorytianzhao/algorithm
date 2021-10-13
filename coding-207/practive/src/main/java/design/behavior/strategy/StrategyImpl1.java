package design.behavior.strategy;

public class StrategyImpl1 implements StrategyTest.StrategyInterface {
    @Override
    public void strategyMethod() {
        System.out.println("执行策略1");
    }
}
