package com.datastax.se;

import java.util.Random;
public class TelemetryData {
    private String vin;
    private int chargefault;
    private int dataSaveTime;
    private int driverId;
    private int evDmdMotorControllerDcBusCurrent;
    private double evDmdMotorControllerInputVoltage;
    private int evDmdSerialNumber;
    private double evDmdSpeed;
    private int evDmdStatus;
    private double evDmdTargetTorque;
    private double evDmdTemperature;
    private double evDmdTorque;
    private double evEvdHighestVoltageCellMonomer;
    private double evEvdLowestVoltageCellMonomer;
    private int evFcdHighVoltageDcdcState;
    private double evLowBatVoltage;
    private int evVdAcceleratorPedalTravelValue;
    private double evVdChargerOutputCurrent;
    private double evVdChargerOutputVoltage;
    private int evVdChargingStatus;
    private double evVdDcdcOutputCurrent;
    private double evVdDcdcOutputVoltage;
    private int evVdDcdcState;
    private double evVdDcdcTemp;
    private int evVdGearLevel;
    private double evVdOdometerValueMtr;
    private int evVdStateOfCharge;
    private double evVdTotalCurrent;
    private double evVdTotalVoltage;
    private double evVdVehicleSpeed;
    private int evVpdIsLocation;
    private double evVpdLatitude;
    private double evVpdLongitude;
    private String location;
    private int privacyMode;
    private String protoHex;
    private int srAltitudeMtr;
    private int srDistToEmpKm;
    private int srFixtime;
    private int srHandBrakeUp;
    private int srKeyPosition;

    public TelemetryData(String vin) {
        Random random = new Random();
        this.setVin(vin);
        this.setDataSaveTime((int) (System.currentTimeMillis() * 1000000L));
        this.setEvVpdLatitude(-180 + (360 * random.nextDouble()));
        this.setEvVpdLongitude(-180 + (360 * random.nextDouble()));
        this.setEvVdStateOfCharge(random.nextInt(101)); // 0
        this.setSrAltitudeMtr((int) (0 + (4000 * random.nextDouble())));
        this.setChargefault(random.nextInt(2)); // 0 or 1
        this.setDriverId(random.nextInt(1000));
        this.setEvDmdMotorControllerDcBusCurrent(random.nextInt(100));
        this.setEvDmdMotorControllerInputVoltage(random.nextDouble() * 100);
        this.setEvDmdSerialNumber(random.nextInt(1000));
        this.setEvDmdSpeed(random.nextDouble() * 100);
        this.setEvDmdStatus(random.nextInt(2)); // 0 or 1
        this.setEvDmdTargetTorque(random.nextDouble() * 100);
        this.setEvDmdTemperature(random.nextDouble() * 100);
        this.setEvDmdTorque(random.nextDouble() * 100);
        this.setEvEvdHighestVoltageCellMonomer(random.nextDouble() * 100);
        this.setEvEvdLowestVoltageCellMonomer(random.nextDouble() * 100);
        this.setEvFcdHighVoltageDcdcState(random.nextInt(2)); // 0 or 1
        this.setEvLowBatVoltage(random.nextDouble() * 100);
        this.setEvVdAcceleratorPedalTravelValue(random.nextInt(100));
        this.setEvVdChargerOutputCurrent(random.nextDouble() * 100);
        this.setEvVdChargerOutputVoltage(random.nextDouble() * 100);
        this.setEvVdChargingStatus(random.nextInt(2)); // 0 or 1
        this.setEvVdDcdcOutputCurrent(random.nextDouble() * 100);
        this.setEvVdDcdcOutputVoltage(random.nextDouble() * 100);
        this.setEvVdDcdcState(random.nextInt(2)); // 0 or 1
        this.setEvVdDcdcTemp(random.nextDouble() * 100);
        this.setEvVdGearLevel(random.nextInt(10));
        this.setEvVdOdometerValueMtr(random.nextDouble() * 10000);
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getChargefault() {
        return chargefault;
    }

    public void setChargefault(int chargefault) {
        this.chargefault = chargefault;
    }

    public int getDataSaveTime() {
        return dataSaveTime;
    }

    public void setDataSaveTime(int dataSaveTime) {
        this.dataSaveTime = dataSaveTime;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getEvDmdMotorControllerDcBusCurrent() {
        return evDmdMotorControllerDcBusCurrent;
    }

    public void setEvDmdMotorControllerDcBusCurrent(int evDmdMotorControllerDcBusCurrent) {
        this.evDmdMotorControllerDcBusCurrent = evDmdMotorControllerDcBusCurrent;
    }

    public double getEvDmdMotorControllerInputVoltage() {
        return evDmdMotorControllerInputVoltage;
    }

    public void setEvDmdMotorControllerInputVoltage(double evDmdMotorControllerInputVoltage) {
        this.evDmdMotorControllerInputVoltage = evDmdMotorControllerInputVoltage;
    }

    public int getEvDmdSerialNumber() {
        return evDmdSerialNumber;
    }

    public void setEvDmdSerialNumber(int evDmdSerialNumber) {
        this.evDmdSerialNumber = evDmdSerialNumber;
    }

    public double getEvDmdSpeed() {
        return evDmdSpeed;
    }

    public void setEvDmdSpeed(double evDmdSpeed) {
        this.evDmdSpeed = evDmdSpeed;
    }

    public int getEvDmdStatus() {
        return evDmdStatus;
    }

    public void setEvDmdStatus(int evDmdStatus) {
        this.evDmdStatus = evDmdStatus;
    }

    public double getEvDmdTargetTorque() {
        return evDmdTargetTorque;
    }

    public void setEvDmdTargetTorque(double evDmdTargetTorque) {
        this.evDmdTargetTorque = evDmdTargetTorque;
    }

    public double getEvDmdTemperature() {
        return evDmdTemperature;
    }

    public void setEvDmdTemperature(double evDmdTemperature) {
        this.evDmdTemperature = evDmdTemperature;
    }

    public double getEvDmdTorque() {
        return evDmdTorque;
    }

    public void setEvDmdTorque(double evDmdTorque) {
        this.evDmdTorque = evDmdTorque;
    }

    public double getEvEvdHighestVoltageCellMonomer() {
        return evEvdHighestVoltageCellMonomer;
    }

    public void setEvEvdHighestVoltageCellMonomer(double evEvdHighestVoltageCellMonomer) {
        this.evEvdHighestVoltageCellMonomer = evEvdHighestVoltageCellMonomer;
    }

    public double getEvEvdLowestVoltageCellMonomer() {
        return evEvdLowestVoltageCellMonomer;
    }

    public void setEvEvdLowestVoltageCellMonomer(double evEvdLowestVoltageCellMonomer) {
        this.evEvdLowestVoltageCellMonomer = evEvdLowestVoltageCellMonomer;
    }

    public int getEvFcdHighVoltageDcdcState() {
        return evFcdHighVoltageDcdcState;
    }

    public void setEvFcdHighVoltageDcdcState(int evFcdHighVoltageDcdcState) {
        this.evFcdHighVoltageDcdcState = evFcdHighVoltageDcdcState;
    }

    public double getEvLowBatVoltage() {
        return evLowBatVoltage;
    }

    public void setEvLowBatVoltage(double evLowBatVoltage) {
        this.evLowBatVoltage = evLowBatVoltage;
    }

    public int getEvVdAcceleratorPedalTravelValue() {
        return evVdAcceleratorPedalTravelValue;
    }

    public void setEvVdAcceleratorPedalTravelValue(int evVdAcceleratorPedalTravelValue) {
        this.evVdAcceleratorPedalTravelValue = evVdAcceleratorPedalTravelValue;
    }

    public double getEvVdChargerOutputCurrent() {
        return evVdChargerOutputCurrent;
    }

    public void setEvVdChargerOutputCurrent(double evVdChargerOutputCurrent) {
        this.evVdChargerOutputCurrent = evVdChargerOutputCurrent;
    }

    public double getEvVdChargerOutputVoltage() {
        return evVdChargerOutputVoltage;
    }

    public void setEvVdChargerOutputVoltage(double evVdChargerOutputVoltage) {
        this.evVdChargerOutputVoltage = evVdChargerOutputVoltage;
    }

    public int getEvVdChargingStatus() {
        return evVdChargingStatus;
    }

    public void setEvVdChargingStatus(int evVdChargingStatus) {
        this.evVdChargingStatus = evVdChargingStatus;
    }

    public double getEvVdDcdcOutputCurrent() {
        return evVdDcdcOutputCurrent;
    }

    public void setEvVdDcdcOutputCurrent(double evVdDcdcOutputCurrent) {
        this.evVdDcdcOutputCurrent = evVdDcdcOutputCurrent;
    }

    public double getEvVdDcdcOutputVoltage() {
        return evVdDcdcOutputVoltage;
    }

    public void setEvVdDcdcOutputVoltage(double evVdDcdcOutputVoltage) {
        this.evVdDcdcOutputVoltage = evVdDcdcOutputVoltage;
    }

    public int getEvVdDcdcState() {
        return evVdDcdcState;
    }

    public void setEvVdDcdcState(int evVdDcdcState) {
        this.evVdDcdcState = evVdDcdcState;
    }

    public double getEvVdDcdcTemp() {
        return evVdDcdcTemp;
    }

    public void setEvVdDcdcTemp(double evVdDcdcTemp) {
        this.evVdDcdcTemp = evVdDcdcTemp;
    }

    public int getEvVdGearLevel() {
        return evVdGearLevel;
    }

    public void setEvVdGearLevel(int evVdGearLevel) {
        this.evVdGearLevel = evVdGearLevel;
    }

    public double getEvVdOdometerValueMtr() {
        return evVdOdometerValueMtr;
    }

    public void setEvVdOdometerValueMtr(double evVdOdometerValueMtr) {
        this.evVdOdometerValueMtr = evVdOdometerValueMtr;
    }

    public int getEvVdStateOfCharge() {
        return evVdStateOfCharge;
    }

    public void setEvVdStateOfCharge(int evVdStateOfCharge) {
        this.evVdStateOfCharge = evVdStateOfCharge;
    }

    public double getEvVdTotalCurrent() {
        return evVdTotalCurrent;
    }

    public void setEvVdTotalCurrent(double evVdTotalCurrent) {
        this.evVdTotalCurrent = evVdTotalCurrent;
    }

    public double getEvVdTotalVoltage() {
        return evVdTotalVoltage;
    }

    public void setEvVdTotalVoltage(double evVdTotalVoltage) {
        this.evVdTotalVoltage = evVdTotalVoltage;
    }

    public double getEvVdVehicleSpeed() {
        return evVdVehicleSpeed;
    }

    public void setEvVdVehicleSpeed(double evVdVehicleSpeed) {
        this.evVdVehicleSpeed = evVdVehicleSpeed;
    }

    public int getEvVpdIsLocation() {
        return evVpdIsLocation;
    }

    public void setEvVpdIsLocation(int evVpdIsLocation) {
        this.evVpdIsLocation = evVpdIsLocation;
    }

    public double getEvVpdLatitude() {
        return evVpdLatitude;
    }

    public void setEvVpdLatitude(double evVpdLatitude) {
        this.evVpdLatitude = evVpdLatitude;
    }

    public double getEvVpdLongitude() {
        return evVpdLongitude;
    }

    public void setEvVpdLongitude(double evVpdLongitude) {
        this.evVpdLongitude = evVpdLongitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrivacyMode() {
        return privacyMode;
    }

    public void setPrivacyMode(int privacyMode) {
        this.privacyMode = privacyMode;
    }

    public String getProtoHex() {
        return "Ch4KDAj45reLARC50tj+ARIICBog/cOkqwYaBAgDSAkS0wISHAh+IGUwADgAQABQA1gCaAKIAQGoAQPaAQM" +
                "2hcaqgIKBzh4YNIpaAAYSV0AAHBBYAloCYIBCAoGGPYZMPQZiAG8KZABB5gBAaIBAigBqgEIIAAoADAOQADgAZIE6gHpAQgAEAAYRiADKCIwADgAQABIAFABWAF" +
                "AWgAcCh4C4ABBIgBAJABAJgB15QIoAEAqAEAsAEAuAEAwAEAyAEA0AEA2AEB4AEA6AGkAfABAfgBAYACAIgCAJACAJgCAaACAagCAbACALgCAcACAcgCANACANg" +
                "CAeACAOgCAfACAfgCAIADAIgDQpADnwGYAwGgAwCoA60BsAMBuAMIwAMAyAMB0AMA2AMA4AObAegDZPADAfgD2QGABA2IBJQEkAQBmAQAoAQAqAS7F7AEZbgEqL0" +
                "DwASovQPIBAHQBAHYBADgBADqBAQQChgJMgA6AEoAWgAaB6AB/cOkqwYiDwoHCNMDEgIIARj9w6SrBg==";
    }

    public void setProtoHex(String protoHex) {
        this.protoHex = protoHex;
    }

    public int getSrAltitudeMtr() {
        return srAltitudeMtr;
    }

    public void setSrAltitudeMtr(int srAltitudeMtr) {
        this.srAltitudeMtr = srAltitudeMtr;
    }

    public int getSrDistToEmpKm() {
        return srDistToEmpKm;
    }

    public void setSrDistToEmpKm(int srDistToEmpKm) {
        this.srDistToEmpKm = srDistToEmpKm;
    }

    public int getSrFixtime() {
        return srFixtime;
    }

    public void setSrFixtime(int srFixtime) {
        this.srFixtime = srFixtime;
    }

    public int getSrHandBrakeUp() {
        return srHandBrakeUp;
    }

    public void setSrHandBrakeUp(int srHandBrakeUp) {
        this.srHandBrakeUp = srHandBrakeUp;
    }

    public int getSrKeyPosition() {
        return srKeyPosition;
    }

    public void setSrKeyPosition(int srKeyPosition) {
        this.srKeyPosition = srKeyPosition;
    }

    @Override
    public String toString() {
        return "TelemetryData{" +
                "vin='" + vin + '\'' +
                ", evVdStateOfCharge=" + evVdStateOfCharge +
                ", dataSaveTime=" + dataSaveTime +
                ", evVpdLatitude=" + evVpdLatitude +
                ", evVpdLongitude=" + evVpdLongitude +
                ", srAltitudeMtr=" + srAltitudeMtr +
                '}';
    }
}
