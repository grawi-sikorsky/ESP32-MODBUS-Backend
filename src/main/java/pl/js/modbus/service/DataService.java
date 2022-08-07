package pl.js.modbus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.js.modbus.model.DataModel1;
import pl.js.modbus.repository.DataRepository1;

@Service
public class DataService {

    private final DataRepository1 dataRepository;

    public DataService(DataRepository1 dataRepository) {
        this.dataRepository = dataRepository;
    }
    
    public List<DataModel1> getData(){
        return dataRepository.findByModbusID("modbus1");
    }

    public DataModel1 saveData(DataModel1 dataModel){
        return dataRepository.save(dataModel);
    }
}
