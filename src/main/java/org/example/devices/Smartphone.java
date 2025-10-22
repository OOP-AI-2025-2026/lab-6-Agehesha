
package org.example.devices;

public final class Smartphone implements GPS, Cellular {
    private double lat;
    private double lon;

    public void setCoordinates(double lat, double lon) {
        this.lat = lat; this.lon = lon;
    }

    @Override public double[] getCoordinates() {
        return new double[] { lat, lon };
    }

    @Override public void makeCall() {
        System.out.println("Виклик здійснюється…");
    }

    @Override public void receiveCall() {
        System.out.println("Вхідний дзвінок…");
    }
}
