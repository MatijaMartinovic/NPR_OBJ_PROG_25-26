package pckg_Feed_solution;

public interface WeatherFeed {

    float temp = 0;
    float press = 0;
    float humidity = 0;

    float getTemp();
    float getPressure();
    float getHumidity();
}
