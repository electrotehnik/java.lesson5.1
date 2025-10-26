import java.util.HashMap;
import java.util.Map;

public class Stats {
    Map<String, Integer> maxQuant;
    Map<String, Double> maxPrice;
    Stats(Map<String, Integer> maxQuant, Map<String, Double> maxPrice) {
        this.maxQuant = maxQuant;
        this.maxPrice = maxPrice;
    }
}
