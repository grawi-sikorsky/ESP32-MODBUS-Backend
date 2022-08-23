package pl.js.modbus.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import pl.js.modbus.model.DataModel;
import pl.js.modbus.model.LiveDataModel;
import pl.js.modbus.repository.DataRepository;
import pl.js.modbus.repository.LiveDataRepository;

@Service
public class DataService {

    private final DataRepository dataRepository;
    private final LiveDataRepository liveDataRepository;

    public DataService(DataRepository dataRepository, LiveDataRepository liveDataRepository) {
        this.dataRepository = dataRepository;
        this.liveDataRepository = liveDataRepository;
    }
    
    public List<DataModel> getData(){
        return dataRepository.findByModbusID("modbus1");
    }

    public DataModel saveData(DataModel dataModel){
        System.out.println(dataModel.getBatVoltage());
        return dataRepository.save(dataModel);
    }

    // LIVE
    public LiveDataModel getLiveData(){
        return liveDataRepository.findByModbusID("modbus1");
    }

    public LiveDataModel saveLiveData(LiveDataModel liveDataModel){
        if(liveDataRepository.findByModbusID("modbus1") != null){
            LiveDataModel currentLiveDataModel = liveDataRepository.findByModbusID("modbus1");

            liveDataModel.setId(currentLiveDataModel.getId());
            liveDataModel.setRecordTime(LocalDateTime.now());
        }
        return liveDataRepository.save(liveDataModel);
    }
}
