package pl.js.modbus.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Locale;

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

    public List<DataModel> getDataInRange(String start, String end){
        LocalDateTime startTime = ZonedDateTime.parse(start).toLocalDateTime();
        LocalDateTime endTime = ZonedDateTime.parse(end).toLocalDateTime();
        
        ZonedDateTime s = startTime.atZone(ZoneId.of("Europe/Warsaw"));
        ZonedDateTime e = endTime.atZone(ZoneId.of("Europe/Warsaw"));

        return dataRepository.findByRecordTimeBetween(s,  e);
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