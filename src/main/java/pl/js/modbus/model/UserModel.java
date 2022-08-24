package pl.js.modbus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class UserModel {
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String modbusID;

    private MPPTSettings mpptSettings;
    private SetupModel setupModel;

    public UserModel() {
    }


}
