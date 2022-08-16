package pl.js.modbus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SetupModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true, updatable = true)
    private String modbusID;
    
    private String readingUpdateInterval;
    private String postUpdateInterval;
    private String setupUpdateInterval;
    
    public SetupModel() {
    }

    public SetupModel(String readingUpdateInterval, String postUpdateInterval, String setupUpdateInterval) {
        this.readingUpdateInterval = readingUpdateInterval;
        this.postUpdateInterval = postUpdateInterval;
        this.setupUpdateInterval = setupUpdateInterval;
    }

    public String getReadingUpdateInterval() {
        return readingUpdateInterval;
    }
    public void setReadingUpdateInterval(String readingUpdateInterval) {
        this.readingUpdateInterval = readingUpdateInterval;
    }
    public String getPostUpdateInterval() {
        return postUpdateInterval;
    }
    public void setPostUpdateInterval(String postUpdateInterval) {
        this.postUpdateInterval = postUpdateInterval;
    }
    public String getSetupUpdateInterval() {
        return setupUpdateInterval;
    }
    public void setSetupUpdateInterval(String setupUpdateInterval) {
        this.setupUpdateInterval = setupUpdateInterval;
    }
    public String getModbusID() {
        return modbusID;
    }
    public void setModbusID(String modbusID) {
        this.modbusID = modbusID;
    }
}
