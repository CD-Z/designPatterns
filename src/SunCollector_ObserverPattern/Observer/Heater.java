package SunCollector_ObserverPattern.Observer;

public class Heater extends ABObserver{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public Heater(int minVoltage) {
        super(minVoltage);
    }

    @Override
    public void callOut(ABObserver.STATE state) {
        if (state == ABObserver.STATE.ON){
            System.out.println(ANSI_PURPLE +"    Enough Voltage, Heater is now active" +ANSI_RESET);
        } else{
            System.out.println(ANSI_PURPLE +"    Not enough Voltage, Heater is now inactive"+ANSI_RESET);
        }
    }
}
