package pl.js.modbus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class MPPTSettings {
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ratedVoltage;    // 311D
    private String ratedLoadCurrent;    // 300E
    private String ratedChargingCurrent;    // 3005

    private String batType; // 9000
    private String batChargingMode; // 9070
    private String batCapacity;  // 9001
    private String batTempCompensation;     // 9002
    private String overvoltageDisconnectVol;   // 9003
    private String overvoltageReconnect;    // 9005
    private String equilibriumCharging;     // 9006
    private String boostChatging;           // 9007
    private String floatCharging;           // 9008
    private String boostReconnectVolt;      // 906E
    private String ratedVoltageLevel;       // 9067
    private String boostDuration;           // 906C
    private String equilibriumDuration;     // 906B
    private String chargingLimitVoltage;    // 9004
    private String dischargingLimitVoltage; // 900E
    private String lowVoltDisconnect;       // 900D
    private String lowVoltReconnect;        // 900A
    private String undervoltWarning;        // 900B
    private String undervoltWarningReconnect;   //906D
    
    public MPPTSettings() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRatedVoltage() {
        return ratedVoltage;
    }

    public void setRatedVoltage(String ratedVoltage) {
        this.ratedVoltage = ratedVoltage;
    }

    public String getRatedLoadCurrent() {
        return ratedLoadCurrent;
    }

    public void setRatedLoadCurrent(String ratedLoadCurrent) {
        this.ratedLoadCurrent = ratedLoadCurrent;
    }

    public String getRatedChargingCurrent() {
        return ratedChargingCurrent;
    }

    public void setRatedChargingCurrent(String ratedChargingCurrent) {
        this.ratedChargingCurrent = ratedChargingCurrent;
    }

    public String getBatType() {
        return batType;
    }

    public void setBatType(String batType) {
        this.batType = batType;
    }

    public String getBatChargingMode() {
        return batChargingMode;
    }

    public void setBatChargingMode(String batChargingMode) {
        this.batChargingMode = batChargingMode;
    }

    public String getBatCapacity() {
        return batCapacity;
    }

    public void setBatCapacity(String batCapacity) {
        this.batCapacity = batCapacity;
    }

    public String getBatTempCompensation() {
        return batTempCompensation;
    }

    public void setBatTempCompensation(String batTempCompensation) {
        this.batTempCompensation = batTempCompensation;
    }

    public String getOvervoltageDisconnectVol() {
        return overvoltageDisconnectVol;
    }

    public void setOvervoltageDisconnectVol(String overvoltageDisconnectVol) {
        this.overvoltageDisconnectVol = overvoltageDisconnectVol;
    }

    public String getOvervoltageReconnect() {
        return overvoltageReconnect;
    }

    public void setOvervoltageReconnect(String overvoltageReconnect) {
        this.overvoltageReconnect = overvoltageReconnect;
    }

    public String getEquilibriumCharging() {
        return equilibriumCharging;
    }

    public void setEquilibriumCharging(String equilibriumCharging) {
        this.equilibriumCharging = equilibriumCharging;
    }

    public String getBoostChatging() {
        return boostChatging;
    }

    public void setBoostChatging(String boostChatging) {
        this.boostChatging = boostChatging;
    }

    public String getFloatCharging() {
        return floatCharging;
    }

    public void setFloatCharging(String floatCharging) {
        this.floatCharging = floatCharging;
    }

    public String getBoostReconnectVolt() {
        return boostReconnectVolt;
    }

    public void setBoostReconnectVolt(String boostReconnectVolt) {
        this.boostReconnectVolt = boostReconnectVolt;
    }

    public String getRatedVoltageLevel() {
        return ratedVoltageLevel;
    }

    public void setRatedVoltageLevel(String ratedVoltageLevel) {
        this.ratedVoltageLevel = ratedVoltageLevel;
    }

    public String getBoostDuration() {
        return boostDuration;
    }

    public void setBoostDuration(String boostDuration) {
        this.boostDuration = boostDuration;
    }

    public String getEquilibriumDuration() {
        return equilibriumDuration;
    }

    public void setEquilibriumDuration(String equilibriumDuration) {
        this.equilibriumDuration = equilibriumDuration;
    }

    public String getChargingLimitVoltage() {
        return chargingLimitVoltage;
    }

    public void setChargingLimitVoltage(String chargingLimitVoltage) {
        this.chargingLimitVoltage = chargingLimitVoltage;
    }

    public String getDischargingLimitVoltage() {
        return dischargingLimitVoltage;
    }

    public void setDischargingLimitVoltage(String dischargingLimitVoltage) {
        this.dischargingLimitVoltage = dischargingLimitVoltage;
    }

    public String getLowVoltDisconnect() {
        return lowVoltDisconnect;
    }

    public void setLowVoltDisconnect(String lowVoltDisconnect) {
        this.lowVoltDisconnect = lowVoltDisconnect;
    }

    public String getLowVoltReconnect() {
        return lowVoltReconnect;
    }

    public void setLowVoltReconnect(String lowVoltReconnect) {
        this.lowVoltReconnect = lowVoltReconnect;
    }

    public String getUndervoltWarning() {
        return undervoltWarning;
    }

    public void setUndervoltWarning(String undervoltWarning) {
        this.undervoltWarning = undervoltWarning;
    }

    public String getUndervoltWarningReconnect() {
        return undervoltWarningReconnect;
    }

    public void setUndervoltWarningReconnect(String undervoltWarningReconnect) {
        this.undervoltWarningReconnect = undervoltWarningReconnect;
    }

    

}
