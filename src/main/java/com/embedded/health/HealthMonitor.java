
package com.embedded.health;

public class HealthMonitor {

    public String checkHealth(DeviceHealth device) {

        if (device.getVoltage() < 3.0 ||
            device.getVoltage() > 5.5 ||
            device.getTemperature() > 70 ||
            device.getCurrent() > 2.0) {

            return "CRITICAL";

        } else if (device.getVoltage() < 3.3 ||
                   device.getVoltage() > 5.2 ||
                   device.getTemperature() > 50 ||
                   device.getCurrent() > 1.5) {

            return "WARNING";
        }

        return "HEALTHY";
    }

    public void display(DeviceHealth device) {

        System.out.println("\n===== DEVICE HEALTH REPORT =====");
        System.out.println("Device ID: " + device.getDeviceId());
        System.out.println("Voltage: " + device.getVoltage() + " V");
        System.out.println("Temperature: " + device.getTemperature() + " C");
        System.out.println("Current: " + device.getCurrent() + " A");
        System.out.println("Health Status: " + checkHealth(device));
    }
}
