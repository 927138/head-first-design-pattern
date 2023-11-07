package com.yhun.pattern.opserver;

public class ObserverTset {

     public static void main(String[] args) {
          WeatherData weatherData = new WeatherData();

          CurrentConditionDisplay currentConditionDisplay =
                  new CurrentConditionDisplay(weatherData);

          weatherData.setMeasurements(80, 65, 30.4f);
          currentConditionDisplay.display();
          currentConditionDisplay.update(30, 20, 22.1f);

     }

}
