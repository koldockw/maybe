public class FlexibleInspection implements InspectionStrategy {
    @Override
    public double inspect(CarReturn car) {
        double mileageFine = car.getExtraMileage() * 50;
        double fuelFine = car.getMissingFuel() * 250;
        double damageFine = car.getNewScratches() * 10000;
        return mileageFine + fuelFine + damageFine;
    }
}
