///- StrictInspection: 150 KZT/km, 350 KZT/liter, 20000 KZT/scratch
/// - StandardInspection: 100 KZT/km, 300 KZT/liter, 15000 KZT/scratch
/// - FlexibleInspection: 50 KZT/km, 250 KZT/liter, 10000 KZT/scratch
public class Main {
    public static void main(String[] args) {
        CarReturn car = new CarReturn(100, 15, 2);
        InspectionContext context = new InspectionContext(new StrictInspection());

        System.out.println("Car rental return inspection");
        System.out.println("Extra mileage: " + car.getExtraMileage() + " km");
        System.out.println("Missing fuel: " + car.getMissingFuel() + " liters");
        System.out.println("New scratches: " + car.getNewScratches());

        System.out.println("Strict inspection: " + context.inspect(car) + " KZT");

        context.setStrategy(new StandardInspection());
        System.out.println("Standard inspection: " + context.inspect(car) + " KZT");

        context.setStrategy(new FlexibleInspection());
        System.out.println("Flexible inspection: " + context.inspect(car) + " KZT");
    }
}
