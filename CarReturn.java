public class CarReturn {
    private final int extraMileage;
    private final double missingFuel;
    private final int newScratches;

    public CarReturn(int extraMileage, double missingFuel, int newScratches) {
        if (extraMileage < 0 || missingFuel < 0 || newScratches < 0) {
            throw new IllegalArgumentException("Values cannot be negative");
        }
        this.extraMileage = extraMileage;
        this.missingFuel = missingFuel;
        this.newScratches = newScratches;
    }

    public int getExtraMileage() {
        return extraMileage;
    }

    public double getMissingFuel() {
        return missingFuel;
    }

    public int getNewScratches() {
        return newScratches;
    }
}
