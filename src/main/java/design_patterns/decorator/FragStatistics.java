package design_patterns.decorator;

public interface FragStatistics {
    int incrementFragCount();
    int incrementDeathCount();
    void reset();
}