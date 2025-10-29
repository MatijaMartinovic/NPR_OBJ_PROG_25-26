package pckg_Feed_solution;

import pckg_fst_app.WthStationObservable;

import java.util.ArrayList;
import java.util.List;

public class WSWithFeed implements WthStationObservable, WeatherFeed {
    private float temp;
    private float press;
    private float humidity;
    private final List<ObserverWS> observers;

    public WSWithFeed(float t, float p, float h){
        temp = t;
        press = p;
        humidity = h;
        this.observers = new ArrayList<ObserverWS>();

    }

    @Override
    public float getTemp() {
        return this.temp;
    }

    @Override
    public float getPressure() {
        return this.press;
    }

    @Override
    public float getHumidity() {
        return this.humidity;
    }

    @Override
    public void registerObserver(ObserverWS observerWs) {
        if(observers.contains(observerWs)){
            System.out.println("Already in");
        }else{
            observers.add(observerWs);
            System.out.println("Registered Observer");
        }
    }

    @Override
    public void unregisterObserver(ObserverWS observerWs) {

    }

    @Override
    public void sensorsDataChanged(float t, float p, float h){
        this.temp = t;
        this.press = p;
        this.humidity = h;
        notifyAllRegObservers();
    }

    @Override
    public void notifyAllRegObservers() {
        for(ObserverWS observerWS : observers){
            WeatherFeed wf = new WSWithFeed(this.temp, this.press, this.humidity);
            observerWS.updateData();
        }
    }
}
