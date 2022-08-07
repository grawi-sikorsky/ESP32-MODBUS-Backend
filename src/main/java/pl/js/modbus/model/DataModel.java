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
    
}
