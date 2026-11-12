
package com.embedded.health;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println(" EMBEDDED DEVICE HEALTH MONITOR ");
        System.out.println("================================");

        System.out.print("Enter Device ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter Temperature (C): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter Current (A): ");
        double current = sc.nextDouble();

        DeviceHealth device =
            new DeviceHealth(id, voltage, temperature, current);

        HealthMonitor monitor = new HealthMonitor();
        monitor.display(device);

        sc.close();
    }
}
