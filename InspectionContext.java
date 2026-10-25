public class InspectionContext {
    private InspectionStrategy strategy;

    public InspectionContext(InspectionStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(InspectionStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    public double inspect(CarReturn car) {
        return strategy.inspect(car);
    }
}
