

public class Main {

    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(10d);
        System.out.println("Miles: " + miles);

        SpeedConverter.printConversion(10d);

    }
}
