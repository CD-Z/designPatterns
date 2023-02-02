package SunCollector_ObserverPattern.Observer;

public abstract class ABObserver implements Observer{

    protected enum STATE{ON,OFF};
    protected STATE currentState;
    protected int minVoltage;
    public ABObserver(int minVoltage){
        this.currentState = STATE.OFF;
        this.minVoltage = minVoltage;
    }
    @Override
    public void inform(int voltage) {
        if (this.minVoltage >= voltage){
            if (this.currentState == STATE.ON){
                this.currentState = STATE.OFF;
                callOut(STATE.OFF);
            }
        } else {
            if (this.currentState == STATE.OFF){
                this.currentState = STATE.ON;
                callOut(STATE.ON);
            }
        }
    }

}
