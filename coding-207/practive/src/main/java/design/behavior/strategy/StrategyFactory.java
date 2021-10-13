package design.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {

    private static Map<String, StrategyTest.StrategyInterface> map = new HashMap();

    static {
        map.put("strategy1", new StrategyImpl1());
        map.put("strategy2", new StrategyImpl2());
        map.put("strategy3", new StrategyImpl3());

    }
    private StrategyTest.StrategyInterface strategyInterface;

    public static StrategyTest.StrategyInterface getStrategy(String strategy) {
        return map.get(strategy);
    }
}
