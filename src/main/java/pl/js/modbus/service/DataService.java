package pl.js.modbus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.js.modbus.model.DataModel;
import pl.js.modbus.repository.DataRepository;

@Service
public class DataService {

    private final DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }
    
    public List<DataModel> getData(){
        return dataRepository.findByModbusID("modbus1");
    }

    public DataModel saveData(DataModel dataModel){
        System.out.println(dataModel.getBatVoltage());
        return dataRepository.save(dataModel);
    }
}
