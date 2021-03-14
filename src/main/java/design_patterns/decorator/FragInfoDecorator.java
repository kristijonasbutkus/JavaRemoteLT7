package design_patterns.decorator;

public class FragInfoDecorator implements FragStatistics {

    private final FragStatistics fragStatistics;

    public FragInfoDecorator(final design_patterns.decorator.FragStatistics fragStatistics) {
        this.fragStatistics = fragStatistics;
    }

    @Override
    public int incrementFragCount() {
        System.out.println("Enemy fragged - fragInfoDecorator");
        return fragStatistics.incrementFragCount();
    }

    @Override
    public int incrementDeathCount() {
        return fragStatistics.incrementDeathCount();
    }

    @Override
    public void reset() {
        fragStatistics.reset();
    }
}