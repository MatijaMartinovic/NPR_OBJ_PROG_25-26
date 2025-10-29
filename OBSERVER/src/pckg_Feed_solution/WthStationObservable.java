package pckg_Feed_solution;

public interface WthStationObservable {

    void registerObserver(ObserverWS observerWs);
    void unregisterObserver(ObserverWS observerWs);
    void notifyAllRegObservers();
}
