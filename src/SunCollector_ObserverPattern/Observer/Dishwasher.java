package SunCollector_ObserverPattern.Observer;

public class Dishwasher extends ABObserver {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public Dishwasher(int minVoltage) {
        super(minVoltage);
    }

    @Override
    public void callOut(STATE state) {
        if (state == STATE.ON){
            System.out.println(ANSI_BLUE + "    Enough Voltage, Dishwasher is now active" + ANSI_RESET);
        } else{
            System.out.println(ANSI_BLUE + "    Not enough Voltage, Dishwasher is now inactive" + ANSI_RESET);
        }
    }
}
