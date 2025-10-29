package pckg_fst_app;

import pckg_Feed_solution.ObserverWS;

public interface WthStationObservable {

    void registerObserver(ObserverWS observerWs);
    void unregisterObserver(ObserverWS observerWs);

    void sensorsDataChanged(float t, float p, float h);

    void notifyAllRegObservers();
}
