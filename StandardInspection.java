public class StandardInspection implements InspectionStrategy {
    @Override
    public double inspect(CarReturn car) {
        double mileageFine = car.getExtraMileage() * 100;
        double fuelFine = car.getMissingFuel() * 300;
        double damageFine = car.getNewScratches() * 15000;
        return mileageFine + fuelFine + damageFine;
    }
}
