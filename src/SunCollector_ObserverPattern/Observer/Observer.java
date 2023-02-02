package SunCollector_ObserverPattern.Observer;

public interface Observer {
    public void inform(int voltage);
    void callOut(ABObserver.STATE state);
}
