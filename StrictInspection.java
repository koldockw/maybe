public class StrictInspection implements InspectionStrategy {
    @Override
    public double inspect(CarReturn car) {
        double mileageFine = car.getExtraMileage() * 150;
        double fuelFine = car.getMissingFuel() * 350;
        double damageFine = car.getNewScratches() * 20000;
        return mileageFine + fuelFine + damageFine;
    }
}
