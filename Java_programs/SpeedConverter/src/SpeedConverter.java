

public class SpeedConverter {
    public static long toMilesPerHour(double kilometresPerHour){
        if(kilometresPerHour < 0)
            return -1;
        else
            return Math.round(kilometresPerHour / 1.609);


    }

    public static void printConversion(double kilometresPerHour){
        if(kilometresPerHour < 0 )
            System.out.println("Invalid Value.");
        else {
            long milesPerHour = toMilesPerHour(kilometresPerHour);
            System.out.println(kilometresPerHour +
                    " km/h = " + milesPerHour + " mph.");
            float nn = 10.5F;
            int nnn = (int) nn;
            System.out.println(nnn);
        }


    }





}
