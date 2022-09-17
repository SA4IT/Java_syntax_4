package ru.mirea.korenev.practic4;

public enum Seasons {
    WINTER("The main sign of this time of year is a steady low " +
            "temperature in many areas of the Earth, snow falls and " +
            "falls on the surface of the earth.", -15),
    AUTUMN("Autumn is a transitional season when there is a noticeable " +
            "decrease in daylight hours, and the ambient temperature gradually decreases.", +11),
    SUMMER("One of the four seasons, between spring and autumn, " +
            "characterized by the highest ambient temperature. On the summer solstice, " +
            "the days are the longest and the nights are the shortest.", +20),
    SPRING("Spring is a transitional season when there is a noticeable " +
            "increase in daylight, the ambient temperature rises and the natural " +
            "activity of living beings and plants is activated.",+6);

    public String getCharacteristic() {
        return characteristic;
    }

    public double getTemperature() {
        return temperature;
    }

    private double temperature;
    private String characteristic;
    private String str;
    Seasons(String charac, double temp) {
        characteristic = charac;
        temperature = temp;
    }
    public String getDescription(){
        if(this.temperature <= 0) {
            this.str = "Холодное время года";
        }
        if(this.temperature > 0) {
            this.str = "Тёплое время года";
        }
        return str;
    }

}
