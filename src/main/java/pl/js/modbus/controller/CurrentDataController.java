package pl.js.modbus.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.js.modbus.model.LiveDataModel;
import pl.js.modbus.service.DataService;

@CrossOrigin(origins = {"*", "http://localhost:4200", "https://modbuspanel.herokuapp.com:8080", "http://10.0.2.2:8080"}, exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/live")
public class CurrentDataController {
    
    private final DataService dataService;

    public CurrentDataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public LiveDataModel showLiveData(){
        return dataService.getLiveData();
    }

    @PostMapping
    public LiveDataModel receiveLiveData(@RequestBody LiveDataModel incomingDataModel){
        return dataService.saveLiveData(incomingDataModel);
    }
}
