
package com.embedded.health;

public class DeviceHealth {

    private String deviceId;
    private double voltage;
    private double temperature;
    private double current;

    public DeviceHealth(String deviceId, double voltage,
                        double temperature, double current) {
        this.deviceId = deviceId;
        this.voltage = voltage;
        this.temperature = temperature;
        this.current = current;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getCurrent() {
        return current;
    }
}
