package pl.sda.dzien003;

public class Temperature {
    private float celcius;

    private Temperature(float celcius) {
        this.celcius = celcius;
    }

    public static Temperature fromKelvin(float kelvin) {
        if (kelvin < 0) {
            kelvin = 0;
        }
        float celcius = kelvinToCelcius(kelvin);
        return new Temperature(celcius);
    }

    public static Temperature fromFahreinheit(float fahrenheit) {
        float celcius = fahrenheitToCelsious(fahrenheit);
        return new Temperature(celcius);
    }

    public static Temperature fromCelcius(float celcius) {
        return new Temperature(celcius);
    }

    private static float fahrenheitToCelsious(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static float kelvinToCelcius(float kelvin) {
        return kelvin - 273;
    }

    public float getCelcius() {
        return celcius;
    }

    public float toFahrenheit() {
        return celcius * 9 / 5 + 32;
    }

    public float toKelvin() {
        return celcius + 273;
    }
}
