public class Main {

    private static final String INVALID_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 60))
            return INVALID_MESSAGE;
        String calculateTime = ((minutes / 60) + (seconds/3600)) + "h " + ((minutes%60) + (seconds/60)) + "m " + (seconds%60) + "s";
        return calculateTime;
    }

    public static String getDurationString(int seconds){
        if(seconds < 0)
            return INVALID_MESSAGE;
        int minutes = seconds / 60;
        String calculateTime = getDurationString(minutes, seconds%60);
        return calculateTime;
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(700, 5));
        System.out.println(getDurationString(700));

    }
}
