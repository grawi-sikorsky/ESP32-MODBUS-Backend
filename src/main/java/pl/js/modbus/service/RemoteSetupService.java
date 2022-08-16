package pl.js.modbus.service;

import org.springframework.stereotype.Service;

import pl.js.modbus.model.SetupModel;
import pl.js.modbus.repository.SetupRepository;

@Service
public class RemoteSetupService {
    
    private final SetupRepository setupRepository;

    public RemoteSetupService(SetupRepository setupRepository) {
        this.setupRepository = setupRepository;
    }

    public SetupModel getSetupModel(String modbusID){
        return setupRepository.findByModbusID(modbusID);
    }

    public SetupModel saveSetupModel(SetupModel setup){
        if(setupRepository.findByModbusID(setup.getModbusID()) == null ){
            return setupRepository.save(setup);
        }else{
            SetupModel setupToSave = setupRepository.findByModbusID(setup.getModbusID());
            setupToSave.setPostUpdateInterval(setup.getPostUpdateInterval());
            setupToSave.setReadingUpdateInterval(setup.getReadingUpdateInterval());
            setupToSave.setSetupUpdateInterval(setup.getSetupUpdateInterval());

            return setupRepository.save(setupToSave);
        }        
    }

}
