package design_patterns.decorator;

public class DecoratorUsage {
    public static void main(String[] args) {
        FragStatistics statistics = new  FirstPersonShooterFragStatistics();

        int deathCount = statistics.incrementDeathCount(); // nothing appears on the screen
        statistics.incrementFragCount(); // nothing appears on the screen
        int fragCount = statistics.incrementFragCount(); // nothing appears on the screen

        System.out.println(deathCount);
        System.out.println(fragCount);


        // use of decorators
        FragStatistics decoratedStatistics = new FragDeathRatioDecorator(
                                                new FragInfoDecorator(
                                                        new DisplayCountersDecorator(
                                                                new DeathCountInfoDecorator(statistics))));

//        // tas pats, kas
//        DeathCountInfoDecorator deathCountInfoDecorator = new  design_patterns.decorator.DeathCountInfoDecorator(statistics);
//        DisplayCountersDecorator displayCountersDecorator = new  design_patterns.decorator.DisplayCountersDecorator(deathCountInfoDecorator);
//        FragInfoDecorator fragInfoDecorator = new  design_patterns.decorator.FragInfoDecorator(displayCountersDecorator);
//        FragDeathRatioDecorator decoratedStatistics = new  design_patterns.decorator.FragDeathRatioDecorator(fragInfoDecorator);

        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount(); // because we are good players!
        decoratedStatistics.incrementDeathCount();
    }
}
