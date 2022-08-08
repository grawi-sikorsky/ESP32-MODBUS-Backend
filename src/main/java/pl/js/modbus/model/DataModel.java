package pl.js.modbus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String modbusID;

    String pvVoltage;
    String pvCurrent;
    String pvPower;
    String pvTotalChargingToday;
    String pvTotalCharging;

    String batVoltage;
    String batCurrent;
    String mpptTemperature;
    String batStatus;
    String batChargingStatus;
    String batDischargingStatus;

    String loadVoltage;
    String loadCurrent;
    String loadPower;
    String energyConsumedToday;
    String energyConsumedTotal;

    String espTemperature;
    String espPressure;

    String batteryVoltage;
    String solarVoltage;

    public DataModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModbusID() {
        return modbusID;
    }

    public void setModbusID(String modbusID) {
        this.modbusID = modbusID;
    }

    public String getPvVoltage() {
        return pvVoltage;
    }

    public void setPvVoltage(String pvVoltage) {
        this.pvVoltage = pvVoltage;
    }

    public String getPvCurrent() {
        return pvCurrent;
    }

    public void setPvCurrent(String pvCurrent) {
        this.pvCurrent = pvCurrent;
    }

    public String getPvPower() {
        return pvPower;
    }

    public void setPvPower(String pvPower) {
        this.pvPower = pvPower;
    }

    public String getPvTotalChargingToday() {
        return pvTotalChargingToday;
    }

    public void setPvTotalChargingToday(String pvTotalChargingToday) {
        this.pvTotalChargingToday = pvTotalChargingToday;
    }

    public String getPvTotalCharging() {
        return pvTotalCharging;
    }

    public void setPvTotalCharging(String pvTotalCharging) {
        this.pvTotalCharging = pvTotalCharging;
    }

    public String getBatVoltage() {
        return batVoltage;
    }

    public void setBatVoltage(String batVoltage) {
        this.batVoltage = batVoltage;
    }

    public String getBatCurrent() {
        return batCurrent;
    }

    public void setBatCurrent(String batCurrent) {
        this.batCurrent = batCurrent;
    }

    public String getMpptTemperature() {
        return mpptTemperature;
    }

    public void setMpptTemperature(String mpptTemperature) {
        this.mpptTemperature = mpptTemperature;
    }

    public String getBatStatus() {
        return batStatus;
    }

    public void setBatStatus(String batStatus) {
        this.batStatus = batStatus;
    }

    public String getBatChargingStatus() {
        return batChargingStatus;
    }

    public void setBatChargingStatus(String batChargingStatus) {
        this.batChargingStatus = batChargingStatus;
    }

    public String getBatDischargingStatus() {
        return batDischargingStatus;
    }

    public void setBatDischargingStatus(String batDischargingStatus) {
        this.batDischargingStatus = batDischargingStatus;
    }

    public String getLoadVoltage() {
        return loadVoltage;
    }

    public void setLoadVoltage(String loadVoltage) {
        this.loadVoltage = loadVoltage;
    }

    public String getLoadCurrent() {
        return loadCurrent;
    }

    public void setLoadCurrent(String loadCurrent) {
        this.loadCurrent = loadCurrent;
    }

    public String getLoadPower() {
        return loadPower;
    }

    public void setLoadPower(String loadPower) {
        this.loadPower = loadPower;
    }

    public String getEnergyConsumedToday() {
        return energyConsumedToday;
    }

    public void setEnergyConsumedToday(String energyConsumedToday) {
        this.energyConsumedToday = energyConsumedToday;
    }

    public String getEnergyConsumedTotal() {
        return energyConsumedTotal;
    }

    public void setEnergyConsumedTotal(String energyConsumedTotal) {
        this.energyConsumedTotal = energyConsumedTotal;
    }

    public String getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(String batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    public String getSolarVoltage() {
        return solarVoltage;
    }

    public void setSolarVoltage(String solarVoltage) {
        this.solarVoltage = solarVoltage;
    }

    public String getEspTemperature() {
        return espTemperature;
    }

    public void setEspTemperature(String espTemperature) {
        this.espTemperature = espTemperature;
    }

    public String getEspPressure() {
        return espPressure;
    }

    public void setEspPressure(String espPressure) {
        this.espPressure = espPressure;
    }

    

    
}
