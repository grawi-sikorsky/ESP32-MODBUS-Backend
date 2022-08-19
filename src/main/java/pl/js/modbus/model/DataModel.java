package pl.js.modbus.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class DataModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDateTime recordTime;

    @Column(name = "modbus_id")
    String modbusID;
    String pvVoltage;
    String pvCurrent;
    String pvPower;
    String pvStatus;

    String batVoltage;
    String batDischargeCurrent;
    String batChargingCurrent;
    String batChargingPower;
    String batRemainingPercent;
    String batTemperature;
    String batOverallCurrent;
    String batStatus;
    String batChargingStatus;
    String batDischargingStatus;

    String mpptTemperature;
    String loadVoltage;
    String loadCurrent;
    String loadPower;
    String loadStatus;
    
    String genTotalToday;
    String genTotalMonth;
    String genTotalYear;
    String genTotalAll;
    String consTotalToday;
    String consTotalMonth;
    String consTotalYear;
    String consTotalAll;
    
    @PrePersist
    public void prepersist(){
        recordTime = LocalDateTime.now();
    }

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

    public String getPvStatus() {
        return pvStatus;
    }

    public void setPvStatus(String pvStatus) {
        this.pvStatus = pvStatus;
    }

    public String getBatVoltage() {
        return batVoltage;
    }

    public void setBatVoltage(String batVoltage) {
        this.batVoltage = batVoltage;
    }

    public String getBatDischargeCurrent() {
        return batDischargeCurrent;
    }

    public void setBatDischargeCurrent(String batDischargeCurrent) {
        this.batDischargeCurrent = batDischargeCurrent;
    }

    public String getBatChargingCurrent() {
        return batChargingCurrent;
    }

    public void setBatChargingCurrent(String batChargingCurrent) {
        this.batChargingCurrent = batChargingCurrent;
    }

    public String getBatChargingPower() {
        return batChargingPower;
    }

    public void setBatChargingPower(String batChargingPower) {
        this.batChargingPower = batChargingPower;
    }

    public String getBatRemainingPercent() {
        return batRemainingPercent;
    }

    public void setBatRemainingPercent(String batRemainingPercent) {
        this.batRemainingPercent = batRemainingPercent;
    }

    public String getBatTemperature() {
        return batTemperature;
    }

    public void setBatTemperature(String batTemperature) {
        this.batTemperature = batTemperature;
    }

    public String getBatOverallCurrent() {
        return batOverallCurrent;
    }

    public void setBatOverallCurrent(String batOverallCurrent) {
        this.batOverallCurrent = batOverallCurrent;
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

    public String getMpptTemperature() {
        return mpptTemperature;
    }

    public void setMpptTemperature(String mpptTemperature) {
        this.mpptTemperature = mpptTemperature;
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

    public String getLoadStatus() {
        return loadStatus;
    }

    public void setLoadStatus(String loadStatus) {
        this.loadStatus = loadStatus;
    }

    public String getGenTotalToday() {
        return genTotalToday;
    }

    public void setGenTotalToday(String genTotalToday) {
        this.genTotalToday = genTotalToday;
    }

    public String getGenTotalMonth() {
        return genTotalMonth;
    }

    public void setGenTotalMonth(String genTotalMonth) {
        this.genTotalMonth = genTotalMonth;
    }

    public String getGenTotalYear() {
        return genTotalYear;
    }

    public void setGenTotalYear(String genTotalYear) {
        this.genTotalYear = genTotalYear;
    }

    public String getGenTotalAll() {
        return genTotalAll;
    }

    public void setGenTotalAll(String genTotalAll) {
        this.genTotalAll = genTotalAll;
    }

    public String getConsTotalToday() {
        return consTotalToday;
    }

    public void setConsTotalToday(String consTotalToday) {
        this.consTotalToday = consTotalToday;
    }

    public String getConsTotalMonth() {
        return consTotalMonth;
    }

    public void setConsTotalMonth(String consTotalMonth) {
        this.consTotalMonth = consTotalMonth;
    }

    public String getConsTotalYear() {
        return consTotalYear;
    }

    public void setConsTotalYear(String consTotalYear) {
        this.consTotalYear = consTotalYear;
    }

    public String getConsTotalAll() {
        return consTotalAll;
    }

    public void setConsTotalAll(String consTotalAll) {
        this.consTotalAll = consTotalAll;
    }

    public LocalDateTime getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(LocalDateTime recordTime) {
        this.recordTime = recordTime;
    }
    
}
